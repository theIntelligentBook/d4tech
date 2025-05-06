package d4tech.empathise

import com.wbillingsley.veautiful.html.{<, ^}
import com.wbillingsley.veautiful.doctacular.*
import d4tech.{*, given}

val practicalTips = DeckBuilder(1920, 1080)
  .titleSlide(
    title="Choosing an individual design student project",
    subtitle="(a few practical tips)"
  )
  .markdownSlides(
    """|## Constraints
       |
       |As we'll see later, design is often influenced by the constraints of its context.
       |
       |If you're a student taking a class, this can also be true of how you design a design project for a class. Particularly:
       |
       |* Terms are short
       |
       |* As a student, even if you're "full-time" you're probably part-time (as in, this isn't your only subject right now)
       |
       |* Assessments have fixed deadlines and stages
       |
       |
       |---
       |
       |## Goals
       |
       |But we want to design to meet our goals. In this case, the goals for your project are usually to show your design skills
       |
       |* In understanding user's real needs
       |
       |* In gaining insight into a real problem
       |
       |* In proposing solutions that are pragmatic as well as showing real thought
       |
       |* In testing and iterating on your designs, to understand the trade-offs and complexities they reveal about the problem
       |
       |---
       |
       |## Start with the user!
       |
       |Every step in your design process is about understanding a user's real problem. So, rather than "pick the perfect problem",
       |you may need to start by picking who you have access to as users.
       |
       |* You won't have time to "recruit" users, so think about who you have access to
       |
       |* Realistically, you're not going to have time in a typical course to do a deep study of a lot of users. 
       |
       |* Most real problems have different kinds of stakeholder (e.g. teachers and students), so if possible think of something
       |  where you have access to to people who have different roles or insights
       |
       |---
       |
       |## Who you have access to will determine your methods
       |
       |Because you won't have time to recruit lots of participants, you will probably find yourself using mostly
       |*qualitative* methods.
       |
       |In the early stages, you'll want some different sources of data that lets you *triangulate* to understand
       |the problem in more depth. i.e. You'll want to talk to a few people and look at stuff.
       |
       |* If you can see them at work, contextual inquiry is great. Be polite, and be clear that you're doing this 
       |  as a student project to learn and practice design skills, not as academic research. 
       |
       |* If you can't see them at work, you are likely to be looking at
       |
       |  - unstructured interviews
       |  - document analysis
       |  - secondary research
       |
       |* Diary studies are great, but you won't hae time in a typical term.
       |
       |---
       |
       |## Remember, Zoom is a thing
       |
       |Plenty of studies have interviewed participants over Zoom or video chat. During covid. International students
       |solving a problem for connections they have at home. etc.
       |
       |* The participant can control what they show you; if they don't hold it up to the camera, you can't see it.
       |  That puts them in a good position to control their privacy. (Do not pressure them to show you anything they
       |  don't want to)
       |
       |* You can get access to participants you'd not be able to meet otherwise, due to travel constraints
       |  (for instance, if you are an international student now living with other students in another country,
       |  where you don't have many contacts who aren't students)
       |
       |---
       |
       |## Interesting problems beat having a solution in mind
       |
       |If you go into a design project with a solution already in your head, it's going to be difficult to convince 
       |a marker that you practiced human centred design. (How could the user have had impact on your design, if you
       |already pre-planned every detail of the solution?)
       |
       |Psychologically it's hard for an engineer not to want to run ahead and plan out how they're going to build
       |their design as soon as they've thought of it.
       |
       |So, you can sometimes be better off picking something where you can "see that it's a problem" but don't yet
       |know so much about it to leap to a solution. 
       |
       |---
       |
       |## Problems at work can be great
       |
       |If you are working while studying, a problem at work can be an excellent choice
       |
       |* You have ready access to users to empathise with, usually from multiple perspectives
       |
       |* You know the context well enough to make for an interesting explanation in a design videos
       |
       |* The problems matter to you, which means you're more likely to be invested in solving them well
       |
       |There are some things to be wary of
       |
       |* Designing just for you. Human-centred design can't be You-centred design even though you're a human too.
       |  
       |* Don't show us things that are trade secret. Although the chances are there are very few of your competitors in the
       |  your course, your studies are supposed to help you in your career not get you in trouble with your boss.
       |
       |* So, often side-projects and "nice to have" projects can make better choices than looking at critical parts of your day job.
       |
       |---
       |
       |## Most things aren't a completely blank slate
       |
       |* HCI course projects often start from a design thinking ideal of "what's the underlying issue". Realistically, most UX work
       |  isn't so greenfield. "You were asked to design us a new admissions system, not tell us how you reimagine higher education in the western world."
       |
       |* When you get to the "define" stage of your project, you're going to be thinking about what your users think, feel, see, and say.
       |  At that point, you're going to see a lot of the constraints that *they* are under.
       |
       |* Sometimes there's' genuine good value in breaking a few constraints (so you don't just end up at the old solution), but you probably can't
       |  just break all of them.
       |
       |""".stripMargin
  )
  .willCcBy
  .renderSlides

