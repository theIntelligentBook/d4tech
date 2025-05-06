//> using dep "com.wbillingsley::doctacular::0.3.0"
//> using dep "org.scala-js::scalajs-dom::2.2.0"

package d4tech

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scalajs.js
import js.Thenable.Implicits._
import org.scalajs.dom

import simplesttalks.core.{given, *}
import scala.scalajs.js.JSON


def loadLists():Future[Seq[TalkList]] = {
  val url ="talks/lists.json"
  for 
    response <- dom.fetch(url)
    j <- response.text()
    parsed <- Future.fromTry(io.circe.parser.decode[Seq[TalkList]](j).toTry.recoverWith {
      case x => dom.console.error(x); scala.util.Failure(x)
    })
  yield parsed
}

def loadList(url:String):Future[Seq[Talk]] =
  import typings.hjson.mod as hjson

  for 
    response <- dom.fetch(url)
    t <- response.text()
    j = hjson.parse(t)
  yield
    val talks = scala.collection.mutable.Buffer.empty[Talk]

    for item <- j.asInstanceOf[js.Array[js.Any]] if js.typeOf(item) != "string" do 
      val text = JSON.stringify(item)

      io.circe.parser.decode[Talk](text) match {
        case Right(talk) => talks.append(talk)
        case Left(err) => dom.console.log(err)
      }

    talks.toSeq      


def loadData():Future[Map[TalkList, Seq[Talk]]] = 
  for 
    lists <- loadLists()
    maps <- (
      Future.sequence(
        for 
          l <- lists
          f <- l.files
        yield for talks <- loadList(f) yield l -> talks
      )
    )
  yield
    maps.foldLeft(Map.empty[TalkList, Seq[Talk]]) { 
      case (maps, (name, talks)) => maps.updated(name, maps.getOrElse(name, Seq.empty) ++ talks)
    }


import com.wbillingsley.veautiful.html.*  
import com.wbillingsley.veautiful.doctacular.* 

val site = Site()

val talkListStyle = Styling(
  """|
     |""".stripMargin
).modifiedBy(
  
).register()

val talkStyle = Styling(
  """|margin: 3em 0;
     |max-width: 40em;
     |""".stripMargin
).modifiedBy(
  " .title" -> "margin: 0;",
  " .series" -> "color: green; text-decoration: none;",
  " .duration" -> "padding: 0.25em; margin: 1em; border-radius: 5px; background: #9de5f1;"

).register()

given marked:Markup(typings.marked.mod.marked.parse)

import typings.jsTemporalPolyfill.mod.Temporal

extension(tl:TalkList) {

  def tz = Temporal.TimeZone.from(tl.timezone)

}

def renderTalk(tl:TalkList, t:Talk) =
  val date = Temporal.PlainDate.from(t.date)
  val start = Temporal.PlainTime.from(t.start).toPlainDateTime(date).toZonedDateTime(tl.timezone)

  //val duration = Temporal.Duration.from("PT" + t.duration.toUpperCase())

  <.div(^.cls := talkStyle,

    <.label(<.a(^.cls := "series", ^.href := site.router.path(site.PageRoute(tl.short)), tl.series)),
    <.h3(^.cls := "title", t.title),
    // <.p(start.toLocaleString()),
    if t.speakerUrl.trim().nonEmpty then 
      <.p(
        <.a(t.speaker, ^.attr.href := t.speakerUrl)
      ) 
    else
      <.p(t.speaker),

    if t.`abstract`.nonEmpty then 
      marked.div(t.`abstract`) else <.div(),

    <.div(
      <.input(^.attr.`type` := "datetime-local", ^.attr.value := start.toPlainDateTime().toString, ^.on.change ==> { (e) => (e.target.asInstanceOf[js.Dynamic].value = start.toPlainDateTime().toString) }),
      <.label(^.cls := "duration", t.duration)
    ),

    for loc <- t.where yield marked.div(loc),

  )

def renderTalks(series:TalkList, talks:Seq[Talk]) = 
  <.div(
    <.h1(series.series),

    talks.map(renderTalk(series, _))


  )

def renderTalks(title:String, talks:Seq[(TalkList, Talk)]) = 
  <.div(
    <.h2(title),
    for (list, talk) <- talks yield
      <.div(renderTalk(list, talk))
  )

def home = <.div(
  marked.div(
    """|# Design for the Technically Minded
       |
       |This is a work in progress - an online interactive book for teaching design and HCI to 
       |students who have mostly a programming background.
       |
       |Slide decks will be added as we go.
       |""".stripMargin 
    )
)

@main def main() = {
  import site.given

  site.toc = site.Toc(
      ("Home" -> site.HomeRoute),  
      ("Intro" -> site.Toc(
        "Wicked problems and pragmatism" -> site.addDeck("intro", intro.talk)
      )),
      ("Empathise" -> site.Toc(
        "Practical tips on picking a student design problem" -> site.addDeck("picking_a_design_problem", empathise.practicalTips)
      )),
      ("Ideate" -> site.Toc(
        "Generative AI in design research" -> site.addDeck("gen_ai_in_design", ideate.genai)
      )),            
      ("Discovery" -> site.Toc(
        "Research through Design" -> site.addDeck("rtd", rtd.rtd)
      ))            
           
            
  )

  site.home = () => site.renderPage(home)

  Styles.installStyles()
  site.attachToBody()

}