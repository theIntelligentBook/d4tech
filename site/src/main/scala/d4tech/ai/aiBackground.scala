package d4tech.ai

import com.wbillingsley.veautiful.html.{<, ^}
import com.wbillingsley.veautiful.doctacular.*
import d4tech.{*, given}

val ai1 = DeckBuilder(1920, 1080)
  .titleSlide(
    title="A Whirlwind History of AI",
    subtitle="(neat and scruffy)"
  )
  .markdownSlides(
    """|## Back to the 1970s
       |
       |AI isn't just one technique.
       |
       |Back in the 1970s, Roger Schank wanted to describe the difference between AI for natural language processing
       |and the sort of AI that was taking place in Aritificial Intelligence groups. 
       |
       |He came up with "neat" vs "scruffy" AI
       |
       |* Neat - algorithms that have a formal paradigm behind them. E.g. logic, optimisation, even neural networks
       |
       |* Scruffy - using anything and everything that works, and using incremental testing to improve your results
       |
       |This distinction makes sense for NLP, especially in the 1970s
       |
       |---
       |
       |## Another way of looking at it
       |
       |If "neat" vs "scruffy" is about how precisely you approach the problem, we could also look at it on how precisely
       |you approach the *answer*
       |
       |* Theorem provers, formal logic, etc, produce a precise answer (but have a limited number of problems they can address)
       |
       |* Statistical and neural network approaches produce an *imprecise* answer, but they'll give you an answer
       |
       |E.g. "is there a banana in this picture"
       |
       |In both cases, though, there's a fairly large suite of algorithms you could throw at a problem
       |
       |---
       |
       |## Combinations of techniques
       |
       |Sometimes, if you're modelling a doman, you'll find that using a combined architecture works better. E.g. affect recognition
       |
       |A little demo:
       |
       |![Face Pong](https://turing.une.edu.au/~cosc360/sync/lectures/facepong/)
       |
       |This uses an old version of affect recognition by Affectiva, to control a pong game.
       |
       |At the time, their model used two stages:
       |
       |* Detecting facial gestures using a Hidden Markov Model (e.g. an eyebrow raise vs an eyebrow flash)
       |
       |* From the facial gestures you're making, determining the emotion you are expressing using a Bayesian network (e.g. raising your eyebrows might indicate surprise)
       |
       |---
       |
       |## Time marches on...
       |
       |[The Unreasonable Effectiveness of Data](https://static.googleusercontent.com/media/research.google.com/en//pubs/archive/35179.pdf)
       |
       |TLDR: Eventually, having *lots* of data beats trying to do things intricately and manually.
       |
       |Affectiva went that way too. Eventually they replaed their crafted model by just getting a lot of video and photograph data and training the model to go 
       |straight from the video to the emotion identification.
       |
       |This makes for understanding human communication:
       |
       |* The real relationship is probably more complex than the model you'd hand-craft
       |
       |* With a big enough network and enough data, a trained model can represent something more complex than you *would* hand-craft 
       |
       |---
       |
       |## A wrinkle with interaction, though
       |
       |AI is not great at letting you see the system state. When it goes wrong, you are likely to exclaim
       |"Why did it just do that" and be annoyed
       |
       |That is *subjective* based on the percieved accuracy of what the AI does and the perceived usefulness of its output.
       |
       |![Clippy](https://upload.wikimedia.org/wikipedia/en/d/db/Clippy-letter.PNG)
       |
       |---
       |
       |## What makes AI go from annoying to popular?
       |
       |Two things are dependent on the power of the AI technology you have at hand:
       |
       |* The accuracy of its inferences
       |
       |* The power/utility of its output
       |
       |For those it may just be a matter of waiting for better technology.
       |
       |e.g. multi-touch
       |
       |---
       |
       |## "Natural" interfaces to precise programs
       |
       |Most AI interfaces (perhaps with the unusual exception of chat-based AI) tries to turn a vague input
       |into a precise input.
       |
       |e.g. "Ok Google, set an alarm for 7:30"
       |
       |[Teachable Machine](https://teachablemachine.withgoogle.com/train/image)
       |
       |There are trade-offs here:
       |
       |* The system state is clearer
       |
       |* Do we just have a clumsy interface to a small API
       |
       |e.g. the worst game of Pac Man you'll ever play:
       |
       |[Pac Man with TensorFlow](https://storage.googleapis.com/tfjs-examples/webcam-transfer-learning/dist/index.html)
       |
       |""".stripMargin
  )
  .willCcBy
  .renderSlides

