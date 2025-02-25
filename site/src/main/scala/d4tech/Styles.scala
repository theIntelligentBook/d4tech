package d4tech

import com.wbillingsley.veautiful.html._
import com.wbillingsley.veautiful.doctacular._
import org.scalajs.dom

given styleSuite:StyleSuite = StyleSuite()

object Styles {

  val imageCard = Styling(
    "padding: 20px; border-radius: 20px; background: #f6f6f6; display: inline-block;"
  ).modifiedBy(
    " img" -> "display: inline-block; margin-right: 20px; vertical-align: middle; width: 600px;",
    " p" -> "display: inline-block; font-family: 'Tangerine', cursive; font-size: 72pt; vertical-align: middle; margin-right: 20px;"
  ).register()

  val imageSlide = Styling(
    """position: relative;
      |top: 0;
      |width: calc(100% + 100px);
      |height: calc(100% + 100px);
      |margin: -50px;
      |""".stripMargin
  ).modifiedBy(
    ".cover img" -> "object-fit: cover; height: 100%;",
    ".contain img" -> "object-fit: contain; max-height: 100%;",
    " img" -> "width: 100%;",
    ".pp img" -> "width: 50%;",
    " figcaption" ->
      """font-size: 3rem;
        |position: absolute;
        |bottom: 10px;
        |left: 10px;
        |background: rgba(255, 255, 255, 0.7);
        |padding: 5px;
        |border-radius: 5px;
        |""".stripMargin
  ).register()

  def installStyles():Unit = {
    VSlides.defaultTheme.addRules(Map(
      "" -> "position: relative; top: 0px; overflow-y: auto;"
    ))

    site.pageLayout.leftSideBarStyle.addRules(Map(
      "" -> """
              |background: #373a3c;
              |color: rgb(186, 186, 186);
              |border: none;
              |""".stripMargin,
      " a" ->
        """color: rgb(186, 186, 186);
          |""".stripMargin,
    ))

    site.pageLayout.tocItemStyles(-1).addRules(Map(
      ".active" -> """
                     |background: #ffffff10;
                     |""".stripMargin,
      "" -> """
              |transition: background 0.25s;
              |""".stripMargin,
    ))

    site.pageLayout.sideBarToggleStyle.addRules(
      """
        |background: #373a3c;
        |border: none;
        |""".stripMargin)

    styleSuite.addGlobalRules(
      """@import url(https://fonts.googleapis.com/css?family=Fira+Mono|Fira+Sans|Lato|Playfair+Display:ital@1);
        |
        |* {
        |  box-sizing: border-box;  
        |} 
        |
        |body {
        |  font-family: 'Lato', sans-serif; margin: 0;
        |}
        |
        |h1, h2, h3, h4, h5 {
        |  font-family: 'Playfair Design', serif;  margin-top: 2rem;
        |}
        |""".stripMargin)

    VSlides.defaultTheme.addRules(Map(
      "" -> "font-family: 'Lato', sans-serif; font-size: 30px;",
      " td" -> "font-family: 'Lato', sans-serif; font-size: 30px;",
      " h1" -> "font-family: 'Playfair Design', serif; font-size: 60px; font-style: italic; color: #5a074f;",
      " h2" -> "font-family: 'Playfair Design', serif; font-size: 48px; font-style: italic; color: #5a074f;",
      " h3" -> "font-family: 'Playfair Design', serif; font-size: 36px; font-style: italic; color: #5a074f;",
      " h4" -> "font-family: 'Playfair Design', serif; font-style: italic; color: #5a074f;",
      " h5" -> "font-family: 'Playfair Design', serif; font-style: italic; color: #5a074f;",
      " code" -> "font-family: 'Fira Mono', monospace;",
      " pre" -> "font-family: 'Fira Mono', monospace;",
      " .bottom" -> "margin-top: auto;"
    ))

    styleSuite.install()
  }

}


import Styles.*
/**
* A local object to demonstrate how layouts can be templated. These can be provided as libraries or written by
* local teams. The syntax will be cleaner with Scala 3
*/
extension (db:DeckBuilder) {


 /**
   * Two portrait images, side by side to fill a slide
   */
  def portraitImageSlide(image1:String, caption:String):DeckBuilder = {
    db.veautifulSlide(
      <.div(^.cls := imageSlide.className,
        <.img(^.src := image1),
        <("figcaption")(caption)
      )
    )
  }

  /**
   * Two portrait images, side by side to fill a slide
   */
  def rightImage(image1:String, caption:String)(f: VHtmlContent):DeckBuilder = {
    db.veautifulSlide(
      <.div(^.cls := imageSlide.className,
        <.img(^.src := image1),
        <("figcaption")(caption)
      )
    )
  }

  /**
   * A slide with a single image and a caption
   */
  def landscapeImageSlide(image:String, caption:String, cover:Boolean = true):DeckBuilder = {
    db.veautifulSlide(<.div(
      <.div(^.cls := (if (cover) s"${imageSlide.className} cover" else s"${imageSlide.className} contain"),
        <.img(^.src := image),
        <("figcaption")(caption)
      )
    ))
  }

  /**
   * Two portrait images, side by side to fill a slide
   */
  def ppImageSlide(image1:String, image2: String, caption:String, cover:Boolean = true):DeckBuilder = {
    db.veautifulSlide(
      <.div(^.cls := "wrapper",
        <.img(^.src := image1),
        <.img(^.src := image2),
        <("figcaption")(caption)
      )
    ).withClass(if (cover) "image-slide pp cover" else "image-slide pp contain")
  }

  /** A title slide for the front of the deck */
  def titleSlide(title:String, subtitle:String):DeckBuilder = {
    db.veautifulSlide(
      <.div(
        <.h1(^.attr("style") := "margin-bottom: 0; font-size: 60px", title),
        <.h2(^.attr("style") := "margin-bottom: 150px", subtitle),
        // <.div(^.attr("style") := "display: inline-flex;",
        //   authorCard
        // ),
        // <.div(logos)
      )
    ).withClass("center middle")

  }

  def iframeSlide(url:String) = db.veautifulSlide(
    <("iframe")(^.attr("width") := "100%", ^.attr("height") := "100%", ^.src := url)
  )

  def sectionTitle(title:String, subtitle:String = ""):DeckBuilder = {
    db.veautifulSlide(<.div(
      <.h2(title),
      <.p(subtitle)
    )).withClass("center middle")
  }

  def willCcBy:DeckBuilder = {
      db.markdownSlide("""
      |<p>Written by Will Billingsley</p>
      |
      |<a rel="license" href="http://creativecommons.org/licenses/by/3.0/au/">
      |  <img alt="Creative Commons Licence" style="border-width:0" src="https://i.creativecommons.org/l/by/3.0/au/88x31.png" /></a><br />
      |  This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/3.0/au/">Creative Commons Attribution 3.0 Australia License</a>.
      |""".stripMargin).withClass("bottom")
  }


}


def bootStrapMediaBox(imageUrl:String, content:VHtmlContent) = {
  <.div(^.cls := "media",
    <.img(^.src := imageUrl, ^.cls := "mr-3", ^.attr("style") := "height: 150px"),
    <.div(^.cls := "media-body", ^.attr("style") := "text-align: left;", content)
  )
}

