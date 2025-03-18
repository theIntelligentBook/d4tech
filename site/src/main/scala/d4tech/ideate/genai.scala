package d4tech.ideate

import com.wbillingsley.veautiful.html.{<, ^}
import com.wbillingsley.veautiful.doctacular.*
import d4tech.{*, given}

val genai = DeckBuilder(1920, 1080)
  .titleSlide(
    title="Generative AI in Design Research",
    subtitle="(a few practical tips)"
  )
  .markdownSlides(
    """|## The usual disclaimers
       |
       |* This is early days on this deck.
       |
       |* If you use GenAI, you **must** say how you used it in your submission
       |
       |* Designers are using Generative AI. It does become part of our toolkit.
       |
       |---
       |
       |## A multiplier of you...
       |
       |The core aspect we want to ensure is **human centred design** -- i.e., that you are constantly
       |studying your users, learning from them, validating your ideas with them
       |
       |There are also some things we're not trying to assess, but that do come up along the way of designing 
       |something well
       |
       |* The ability to draw
       |
       |* Coming up with a lot of ideas quickly
       |
       |* Searching for "secondary research" 
       |
       |* Getting *more* criticism of your research and designs, so you can refine them before you take them to users
       |
       |So there are places where using AI can enable you to do more
       |
       |---
       |
       |## But, a dreadful danger
       |
       |The opposite of human centred design is a "designer" secluded away from their users, never speaking to them.
       |Producing ideas that they have simply been told would be a good idea, and then building them.
       |
       |AI can end up producing this scenario too.
       |
       |* It feels safe and easy typing text prompts into a computer who doesn't care who you are
       |
       |* It can often give vaguely plausible sounding answers, because you are probably not the first person to think
       |  or write about this problem
       |
       |* In chat, we're almost at the point where you could prompt it for an idea, prompt it for what it thinks about, prompt
       |  it to give you a picture, prompt it to write the code and make it work. All without ever seeing a human.
       |
       |That would **not** be human-centred design. There are no users in that scenario. And in this unit, the task is to 
       |be human-centred and to tell us how you observed humans, how you empathised with humans, how you ran your ideas past
       |human users, how you conducted user testing with humans, etc. 
       |
       |---
       |
       |## Will's rules of thumb
       |
       |* **Supplement**, do not replace.  
       |  If you only have time and access to 3 users, then a conversation with generative AI can help point you to documents
       |  to analyse, and lead you to things you need to consider. But for goodness sakes, don't think "I'll do away with one of
       |  the users and chat to AI instead"
       |
       |* Never take the AI output as read  
       |  The AI's training data is *vastly* bigger than your prompt and therefore more influential to the AI. It is magnetised
       |  to the commonplace, not to the specific needs of your users. Even if it doesn't "hallucinate", it can still end up
       |  sounding generic.
       |
       |* Sift and edit  
       |  If you use it to generate potential visuals, sift them, refine your prompt, and then edit the results yourself afterwards too.
       |
       |Whenever you work with generative AI, the more interesting question is what **you** did, **your** process. If you have offloaded the work of creating
       |drawings or art assets, then how did you ensure that meant you got **better visual outputs in the same time** rather than **only roughly as good visual outputs in less time**.
       |
       |---
       |
       |## 
       |
       |> “Many students produced very similar if not the same personas etc.
       |> Unless you provide very specific information the resources generated
       |> are quite generic"
       |
       |> “Basically
       |> used the same prompt (e.g., Generate persona for this app) but with
       |> more and more detail each time. At first was getting lots of ‘best
       |> case’ personas/scenarios, so had to manipulate it to get some that
       |> challenged the app concepts
       |
       |Ahmed Kharrufa and Ian G. Johnson. 2024. The Potential and Implications
       |of Generative AI on HCI Education. In EduCHI 2024: 6th Annual Symposium
       |on HCI Education (EduCHI ’24), June 05–07, 2024, New York, NY, USA. ACM,
       |New York, NY, USA, 8 pages. https://doi.org/10.1145/3658619.3658627
       |
       |
       |
       |""".stripMargin
  )
  .landscapeImageSlide("ideate/copilot asbestos app.jpeg", "The training data had more influence on this than the prompt", false)
  .markdownSlide(
    """|
       |---
       |
       |## A demo and experimental playground
       |
       |(Demo)
       |""".stripMargin
  )
  .willCcBy
  .renderSlides

