package d4tech.intro

import com.wbillingsley.veautiful.html.{<, ^}
import com.wbillingsley.veautiful.doctacular.*
import d4tech.{*, given}

val talk = DeckBuilder(1920, 1080)
  .titleSlide(
    title="How we know what we know",
    subtitle="Design is pragmatic"
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
  .markdownSlide("<img src='resources/ascilite2021/site-fixed-msg.png' width='1600' alt='A student fixed my bug' />").withClass("center")
  .willCcBy
  .renderSlides

