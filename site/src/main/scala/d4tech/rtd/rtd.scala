package d4tech.rtd

import com.wbillingsley.veautiful.html.{<, ^}
import com.wbillingsley.veautiful.doctacular.*
import d4tech.{*, given}

val rtd = DeckBuilder(1920, 1080)
  .titleSlide(
    title="Research through Design",
    subtitle="(or, what really is research?)"
  )
  .markdownSlides(
    """|## The problem of "research"
       |
       |Research matters to universities, academics, and governments. But when are we doing research?
       |
       |> "Why … may not landscape be considered a branch of natural philosophy, of which pictures are but experiments?"  
       |> John Constable, 1836
       |
       |So, does an exhibition of paintings count as research or doesn't it?
       |
       |---
       |
       |## Sir Christopher Frayling
       |
       |![Christopher Frayling](https://en.wikipedia.org/wiki/File:Christopher_Frayling_University_of_Bath_(cropped).jpg)
       |
       |Sir Christopher Frayling, Royal College of Art, "Research in Art and Design"
       |
       |The word research can mean three different things:
       |
       |* Research *into* art and design
       |
       |* Research *through* art and design
       |
       |* Research *for* art and design
       |
       |He based some of this on a view expressed by Picasso: to be research, you have to find something.
       |
       |Let's take these out of order...
       |
       |
       |---
       |
       |## Research for design
       |
       |* Essentially, the research you've been doing
       |
       |* You are embarking on creating something, so you have to do the research that tells you what to create
       |
       |* "what Picasso considered was the gathering of reference materials rather than research proper"
       |
       |> "Rightly or wrongly, we tend to feel the goal here is the art rather than the knowledge and understanding. ...
       |> And we feel that we don't want to be in the position where the entire history of art is eligible for a postgraduate
       |> research degree."
       |
       |
       |---
       |
       |## Research into design
       |
       |* Probably the easiest to understand. Artists/designers as your study population and finding something out about how they work.
       |
       |* "How do designers..."
       | 
       |
       |---
       |
       |## Research *through* design
       |
       |* Discovering new knowledge and understanding through the act of designing something
       |
       |Frayling gives a few examples
       |
       |* Materials research - how do materials behave when you are designing with them
       |
       |* Development work - using something to do something nobody had considered before
       |
       |* Action research - where a research diary tells in a step-by-step way of a practical experiment in the studios and the 
       |  resulting report aims to contextualise it. Both the diary and the report are there to *communicate the results* which
       |  is what separates *research* from the collection of reference materials.
       |
       |RtD research in HCI and technology essentially carries on this last category
       |
       |---
       |
       |## The next problem
       |
       |* If we're doing research, it's expected to go through peer review to be published.
       |
       |* Peer reviewers examine studies for methodological rigour
       |
       |* So what does it mean to be rigorous?
       |
       |Here, we're back at the problem of epistemology. We've said this is research because our design process *found something*
       |but we need to convince a reviewer there was rigour to what we found.
       |
       |Or in otherwords, how do we convince positivists (e.g. natural scientists) and interpretivists (e.g. social scientists) that
       |our methods are worthwhile?
       |
       |---
       |
       |## Design speaks to the future
       |
       |One of the differences between our methods and those of natural scientists and social scientists is that they study the world
       |as it is *now*
       |
       |Whereas we are designing systems to be used in the future
       |
       |* Design artifacts as "embodied hypotheses" of what might be useful
       |
       |* Tackling the envisioned world problem
       |
       |* "The ontological nature of design: Prospecting new futures through probabilistic knowledge" Galdon, F., & Hall., A. (2019)
       |
       |Ok, that answers how we're differnt. But how do we tell if we're doing it *well*? And how do we tell a student what they need to be doing to be rigorous?
       |
       |---
       |
       |## Design is clearly useful
       |
       |> "There are circumstances where the best or only way to shed light on a proposition, a principle, a material, a process or a 
       |> function is to attempt to construct something, or to enact something, calculated to explore, embody or test it"  
       |> Bruce Archer, 1995
       |
       |But is it reproduceable?
       |
       |* In education, RtD are often called "design experiments"
       |
       |* But the term was coined through a *complaint* about them being done badly (often by technologists)
       |
       |> "major problems with current design experiments prevent our gaining much information from them"  
       |> Alan Collins, 1990
       |
       |---
       |
       |## Attempts at guidance
       |
       |In HCI, there are some much-cited papers on how to do Research through Design. 
       |
       |> Zimmerman, J., Stolterman, E., & Forlizzi, J. (2010). An analysis and critique of research through design: 
       |> Towards a formalization of a research approach. In Proceedings of the 8th ACM Conference on Designing Interactive Systems (DIS ‘10). 
       |> Association for Computing Machinery, New York, NY, USA, 310–319. https://doi.org/10.1145/1858171.1858228.
       |
       |Personally, I always find them a litte unsatisfying because they argue by example.
       |
       |In Assessment 5 (for post-grads), instead I've given you the task of going to the literature and finding out how recently published papers
       |have done it.
       |
       |i.e. Sadly, I don't think there is an easy gauge of "what makes good research through design"; you are at the mercy of reviewers on whether
       |or not they liked what you did and whether they thought it *good enough*.
       |
       |But...
       |
       |---
       |
       |## Unreasonable effectiveness
       |
       |* A term originally from mathematics, expressing surprise that so much of physics can be expressed using simple mathematical equations.
       |  Why, for example, should circles and the density function of the Gaussian distribution of populations have the value pi in common?
       |
       |* Adopted into technology. Why should throwing lots of data at a machine learning model prove to be quite so effective
       |
       |I'd like to use it a different way:
       |
       |* Technology can be effective before you can explain why it should be.
       |
       |* The sheer number of things AI and LLMs are being thrown at...
       |
       |* The sheer number of revolutionary tools that *didn't* come out of direct research...
       |
       |i.e., we have our own strange duality happening
       |
       |* Pragmatism and design is *turning out to be* by far the most effective method of discovery we have ever had
       |
       |* But we struggle to convince reviewers because it is only *probabilistically* reliable in each case, and they are always reviewing a specific case.
       |
       |""".stripMargin
  )
  .willCcBy
  .renderSlides

