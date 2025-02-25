package d4tech.intro

import com.wbillingsley.veautiful.html.{<, ^}
import com.wbillingsley.veautiful.doctacular.*
import d4tech.{*, given}

val talk = DeckBuilder(1920, 1080)
  .titleSlide(
    title="Wicked problems and pragmatism",
    subtitle="(or, why design isn't just science)"
  )
  .markdownSlide(
    """|## Epistemology
       |
       |* If I wanted to know if all primes are odd, would experimentally trying a 
       |  sample of 50 primes be ok?
       |
       |* "Epistemology" is how we know what we know. 
       |
       |* It's different for different fields.
       | 
       |""".stripMargin
  )
  .markdownSlide(
    """|## Experiments are *positivist*
       |
       |* Philosophically, positivism is the idea that there is a world with consistent rules that
       |  are discoverable by experimentation
       |
       |* Gallileo's experiment should work the same in Italy as in Australia. Gravity is a rule we 
       |  can discover
       |
       |* But most rules have their limits.
       |
       |Computing is often taught in science schools, where we are used to positivism and conducting
       |lots of experiments.
       | 
       |""".stripMargin
  )
  .markdownSlide(
    """|## Social sciences are often *interpretivist*
       |
       |* How do modern rural Australian youth consider risk-taking compared to youth in the 1980s?
       |
       |* It's not possible to go back in time and experiment in the 1980s
       |
       |* Much of it is dependent on interpretation (internal to someone)
       |
       |* Much of it is contextual (is it the same in Armidale as Tamworth?)
       |
       |* Lots of social factors and influences that would be hard to control for
       |
       |These questions are often studied by looking at a few cases in depth. It is expected that
       |it will vary from person to person, so findings are only "transferable" not "generalised"
       | 
       |""".stripMargin
  )
  .markdownSlide(
    """|## Design is *pragmatic*
       |
       |* Pragmatism is learning from experience and reflection
       |
       |* It's not purely positivist - most of our experiences weren't formal experiments
       |
       |* It's not purely interpretivist - when I build something, the thing I build is an "embodied hypothesis"
       |  about what might be useful (to you, even though I've never met you)
       | 
       |""".stripMargin
  )
  .markdownSlide(
    """|## AI is *also* pragmatic
       |
       |* GPT (whichever version) was trained on available data - everything good its designers could give it
       |
       |* It then sees a prompt about a new problem (a prompt) and attempts to produce a good answer
       |  (zero-shot learning)
       |
       |* "Fine tuning" is where you take a smaller number of more accurate examples and show those to the AI
       |  (few-shot learning)
       |
       |* With each version, the authors looked at what worked, and built new code to improve it 
       |  (reflection and iteration)
       |
       |So it's not just AI that's taking over the world. Pragmatism is too.
       | 
       |""".stripMargin
  )
  .markdownSlide(
    """|## Designers have to do something similar
       |
       |* We draw on *all* our past experience to interpret the problem
       |
       |* We might only have access to a few users
       |
       |* And a pretty sketchy description of the problem
       |
       |* And we're expected to produce something that works for people
       |
       |But we can do better than just talk to you
       |
       |* We can come and see how you work
       |
       |* We can put ourselves in your shoes and imagine what it might be like
       |  to be you using this product
       |
       |* We can build prototypes, get you to try them out, and learn new things from 
       | 
       |* We can have a design *process*, not just a *chat*.
       |
       |""".stripMargin
  )
  .landscapeImageSlide("https://images.pexels.com/photos/1814397/pexels-photo-1814397.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2", "Wicked Problems", true)
  .markdownSlide(
    """|# Wicked Problems
       |
       |* Rittel & Webber. Dilemmas in a general theory of planning, *Policy Sciences*, 1973.
       |
       |* Most design problems are problems where:
       |
       |  - people don't agree on the definition of the problem, and how you explain the problem determines the solution you'll come to
       |  - the problem is unique, but can always be thought of as a symptom of another problem
       |  - there's an unbounded set of potential solutions
       |  - there is no "stopping rule" - you don't know when you're finished designing
       |  - solutions aren't "true or false" but "good or bad"
       |  - every attempt to solve the problem has impacts/effects
       |  - the designer has no right to be wrong
       |""".stripMargin
  )
  .landscapeImageSlide("intro/rocketship.jpg", "Science vs Engineering", true)
  .landscapeImageSlide("https://images.pexels.com/photos/5387332/pexels-photo-5387332.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2", "The trouble with being positiv(ist)", true)
  .markdownSlide(
    """|## Envisioned World Problem
       |
       |* We’re designing for patterns of behaviour in the envisioned world where our product exists
       |
       |* But we can only examine the current world, where our product doesn’t exist
       |
       |## Design talks to the future
       |
       |* Experiments can tell you how the world is now
       |
       |* Design is about how we want the world to be
       |""".stripMargin
  )
  .markdownSlide(
    """|## Sampling
       |
       |* Positivists care deeply about getting a representative sample to eliminate biases in samples. 
       |
       |* In design, to begin with, we don't always know what a representative sample *is*
       |
       |  - There are more aspects that are different about you than we can list, let alone balance for
       |
       |  - It's not always clear what population a representative sample should be representative of  
       |    (When they were building Twitter, how could they know who their users would be?)
       |
       |""".stripMargin
  )
  .landscapeImageSlide("https://images.pexels.com/photos/4868553/pexels-photo-4868553.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2", "People know everything about what they do; they just can't tell you", true)
  .landscapeImageSlide("https://images.pexels.com/photos/534078/pexels-photo-534078.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2", "Most design processes are iterative", true)
  .landscapeImageSlide("intro/iterativemodel.png", "General iterative model, eg in ISO 9241-210:2010", false)
  .markdownSlide(
    """|## Design Thinking
       |
       |* Empathise
       |* Define
       |* Ideate
       |* Prototype
       |* Test
       |""".stripMargin
  )
  .landscapeImageSlide("intro/designthinkingiterative.png", "Design Thinking", false)
  .landscapeImageSlide("intro/doublediamond.jpg", "Double Diamond, British Design Council", false)
  .landscapeImageSlide("intro/ideoanddoublediamond.jpg", "IDEO superimposed on Double Diamond", false)
  .landscapeImageSlide("intro/actionresearch.png", "Action Research", false)
  .willCcBy
  .renderSlides

