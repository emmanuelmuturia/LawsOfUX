package emmanuelmuturia.lawsofux.home.source.source

import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.home.source.model.LocalUXLaw
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class LocalUXLawsSourceImplementation(
    private val ioDispatcher: CoroutineDispatcher,
) : LocalUXLawsSource {
    private val listOfLocalUXLaws =
        listOf(
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.aesthetic_usability_effect,
                localUxLawTitle = "Aesthetic-Usability Effect",
                localUxLawDescription =
                    "Users often perceive aesthetically pleasing design as design that’s more " +
                        "usable.",
                localUXLawTakeaways = listOf(
                    "An aesthetically pleasing design creates a positive response in people’s " +
                        "brains and leads them to believe the design actually works better.",
                    "People are more tolerant of minor usability issues when the design of a " +
                        "product or service is aesthetically pleasing.",
                    "Visually pleasing design can mask usability problems and prevent issues " +
                        "from " +
                        "being discovered during usability testing."
                ),
                localUXLawOrigins = "The aesthetic-usability effect was first studied in the " +
                    "field " +
                    "of human–computer interaction in 1995. Researchers Masaaki Kurosu and " +
                    "Kaori " +
                    "Kashimura from the Hitachi Design Center tested 26 variations of an ATM " +
                    "UI, " +
                    "asking the 252 study participants to rate each design on ease of use, as " +
                    "well " +
                    "as aesthetic appeal. They found a stronger correlation between the " +
                    "participants’ ratings of aesthetic appeal and perceived ease of use than " +
                    "the " +
                    "correlation between their ratings of aesthetic appeal and actual ease of " +
                    "use. " +
                    "Kurosu and Kashimura concluded that users are strongly influenced by the " +
                    "aesthetics of any given interface, even when they try to evaluate the " +
                    "underlying functionality of the system.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "The Aesthetic-Usability Effect",
                        second = "Kate Moran | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/aesthetic-usability-effect/"
                    ),Triple(
                        first = "The Aesthetic Usability Effect and Prioritizing Appearance vs. " +
                            "Functionality",
                        second = "Kathryn Whitenton | Nielsen Norman Group",
                        third = "https://www.nngroup.com/videos/aesthetic-usability-effect/"
                    ),Triple(
                        first = "Aesthetic Usability Effect",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Aesthetic_usability_effect"
                    ),Triple(
                        first = "The Aesthetic-Usability Effect: Why Beautiful-Looking Products " +
                            "are " +
                            "Preferred Over Usable-But-Not-Beautiful Ones",
                        second = "Abhishek Chakraborty | Medium",
                        third = "https://medium.com/@coffeeandjunk/design-psychology-aesthetic-" +
                            "usability-effect-494ed0f22571"
                    ),Triple(
                        first = "A Neuropsychological Theory of Positive Affect and Its " +
                            "Influence " +
                            "on Cognition",
                        second = "F. Gregory Ashby",
                        third = "https://www.researchgate.net/publication/12831914_A_" +
                            "Neuropsychological_Theory_of_Positive_Affect_and_Its_Influence_on_" +
                            "Cognition"
                    ),
                ),
                localUXLawSource = "https://www.nngroup.com/articles/aesthetic-usability-effect/",
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "aesthetic" +
                    "-usability-effect-poster",
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/7nikdzo307tkovplmiad9/A" +
                    "Cyja" +
                    "AZ6zG0dY6eKJ0W1MbQ?rlkey=152ul2m8sh4h21lsisic7xbx4&st=eurhxhiw&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.choice_overload,
                localUxLawTitle = "Choice Overload",
                localUxLawDescription =
                    "The tendency for people to get overwhelmed when they are presented with a " +
                        "large number of options, often used interchangeably with the term " +
                        "paradox " +
                        "of " +
                        "choice.",
                localUXLawTakeaways = listOf(
                    "Too many options hurts users’ decision-making ability. How they feel about " +
                        "the " +
                        "experience as a whole can be significantly impacted as a result.",
                    "When comparison is necessary, we can avoid choice overload by enabling " +
                        "side-by-side comparison of related items and options that require a " +
                        "decision (e.g. pricing tiers).",
                    "We can avoid choice overload by optimizing our designs for the " +
                        "decision-making " +
                        "process and avoid overwhelming users by prioritizing the content that’s " +
                        "shown to them at any given moment (e.g. featured product), providing " +
                        "tools for narrowing down choices up front (e.g. search and filtering)."
                ),
                localUXLawOrigins = "Overchoice or choice overload is the paradoxical phenomenon " +
                    "that choosing between a large variety of options can be detrimental to " +
                    "decision making processes. The term was first introduced by Alvin Toffler " +
                    "in " +
                    "his 1970 book, Future Shock.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "The Paradox of Choice",
                        second = "The Decision Lab",
                        third = "https://thedecisionlab.com/reference-guide/economics/the-" +
                            "paradox-of-choice"
                    ),Triple(
                        first = "Choice Overload Impedes User Decision-Making [Video]",
                        second = "Alita Kendrick | Nielsen Norman Group",
                        third = "https://www.nngroup.com/videos/choice-overload/"
                    ),Triple(
                        first = "Simplicity Wins over Abundance of Choice",
                        second = "Hoa Loranger | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/simplicity-vs-choice/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Overchoice" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/cho" +
                    "ice-overload-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/ofeu7q41l9ttmeke8etes" +
                    "/API24jjWg5gyoI1usGaLkak?rlkey=8zbeuiqj7qu1436iwh8h1175u&st=k11d51qw&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.chunking,
                localUxLawTitle = "Chunking",
                localUxLawDescription =
                    "A process by which individual pieces of an information set are broken down " +
                        "and then grouped together in a meaningful whole.",
                localUXLawTakeaways = listOf(
                    "Chunking enables users to easily scan content. It allows them to easily " +
                        "identify the information that aligns with their goals and process that " +
                        "information to achieve their goals more quickly.",
                    "Structuring content into visually distinct groups with a clear hierarchy " +
                        "enables designers to align information with how people evaluate and " +
                        "process digital content.",
                    "Chunking can be used to help users understand underlying relationships by " +
                        "grouping content into distinctive modules, applying rules to separate " +
                        "content, and providing hierarchy."
                ),
                localUXLawOrigins = "The word chunking comes from a famous 1956 paper by George A. " +
                    "Miller, “The Magical Number Seven, Plus or Minus Two: Some Limits on Our " +
                    "Capacity for Processing Information”. At a time when information theory was " +
                    "beginning to be applied in psychology, Miller observed that some human " +
                    "cognitive tasks fit the model of a “channel capacity” characterized by a " +
                    "roughly constant capacity in bits, but short-term memory did not.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "How Chunking Helps Content Processing",
                        second = "Kate Moran | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/chunking/"
                    ),Triple(
                        first = "Chunking",
                        second = "Interaction Design Foundation",
                        third = "https://www.interaction-design.org/literature/book/the-" +
                            "glossary-of-human-computer-interaction/chunking"
                    ),Triple(
                        first = "Why Chunking Content is Important [Video]",
                        second = "Kate Moran | Nielsen Norman Group",
                        third = "https://www.nngroup.com/videos/chunking/"
                    ),
                ),
                localUXLawSource = "https://www.interaction-design.org/literature/" +
                    "book/the-glossary-of-human-computer-interaction/chunking" ,
                localUXLawLargeFormatPoster = "http://jonyablonski.bigcartel.com/" +
                    "product/chunking-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/pt4m2yinn4p7x000htzsj/" +
                    "AFY32uCPxzukx79ofh0Mri4?rlkey=fk7vwoqz0rcmwmhh7nm5oihpi&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.cognitive_bias,
                localUxLawTitle = "Cognitive Bias",
                localUxLawDescription =
                    "A systematic error of thinking or rationality in " +
                        "judgment that influence our perception of the world " +
                        "and our decision-making ability.",
                localUXLawTakeaways = listOf(
                    "Rather than thinking through every situation, we conserve mental energy by " +
                        "developing rules of thumb to make decisions which are based on past " +
                        "experiences. These mental shortcuts increase our efficiency by enabling " +
                        "us to make quick decisions without the need to thoroughly analyze a " +
                        "situation but can also influence our decision-making processes and " +
                        "judgement without our awareness.",
                    "Understanding of our own intrinsic biases may not eliminate them " +
                        "completely " +
                        "from our decision-making but it increases the chance that we can " +
                        "identify " +
                        "them in ourselves and others and serve as a safeguard against " +
                        "fallacious " +
                        "reasoning, unintentional discrimination or costly mistakes our decisions.",
                    "Take for example our tendency to seek out, interpret, and recall " +
                        "information " +
                        "in a way that confirms their preconceived notions and ideas. " +
                        "This is known as confirmation bias, and it can make having a " +
                        "logical discussion about a polarizing hot-button issue with " +
                        "someone incredibly difficult."
                ),
                localUXLawOrigins = "Amos Tversky and Daniel Kahneman introduced the notion of " +
                    "cognitive biases in 1972 after they observed people’s inability to reason " +
                    "intuitively with greater orders of magnitude. In a series of replicable " +
                    "experiments, Tversky, Kahneman, and their colleagues demonstrated that human " +
                    "judgment and decision-making differ from rational choice theory. " +
                    "They explained human differences in judgment and decision-making in terms " +
                    "of " +
                    "heuristics, which are mental shortcuts that provide quick estimates about " +
                    "the probabilities of uncertain events. but can introduce severe and " +
                    "systematic errors.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Thinking, Fast and Slow [Book]",
                        second = "Daniel Kahneman | Farrar, Straus and Giroux",
                        third = "https://us.macmillan.com/books/9780374533557/thinkingfastandslow/"
                    ),Triple(
                        first = "Design for Cognitive Bias [Book]",
                        second = "David Dylan Thomas | A Book Apart",
                        third = "https://abookapart.com/products/design-for-cognitive-bias.html"
                    ),Triple(
                        first = "Decision Frames: How Cognitive Biases Affect UX Practitioners",
                        second = "Kathryn Whitenton | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/decision-framing-cognitive-" +
                            "bias-ux-pros/"
                    ),Triple(
                        first = "Daniel Kahneman Explains The Machinery of Thought",
                        second = "Farnam Street",
                        third = "https://fs.blog/daniel-kahneman-the-two-systems/"
                    ),Triple(
                        first = "Cognitive Biases",
                        second = "Interaction Design Foundation",
                        third = "https://www.interaction-design.org/literature/topics/" +
                            "cognitive-biases"
                    ),Triple(
                        first = "How Cognitive Biases Influence the Way You Think and Act",
                        second = "Kendra Cherry, MSEd | verywell mind",
                        third = "https://www.verywellmind.com/what-is-a-cognitive-bias-2794963"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Cognitive_bias" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/" +
                    "product/cognitive-bias-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/bbo1exe3axiuamb52ez4p/" +
                    "APuv9AxdKo6bnM_FqlTB6ns?rlkey=kt90qaxrj0govxx11m1jxe32r&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.cognitive_load,
                localUxLawTitle = "Cognitive Load",
                localUxLawDescription =
                    "The amount of mental resources needed to understand " +
                        "and interact with an interface.",
                localUXLawTakeaways = listOf(
                    "When the amount of information coming in exceeds the space we have " +
                        "available, we struggle mentally to keep up — tasks become more " +
                        "difficult, details are missed, and we begin to feel overwhelmed.",
                    "Intrinsic cognitive load refers to the effort required by users to carry " +
                        "around information relevant to their goal, absorb new information and " +
                        "keep track of their goals.",
                    "Extraneous cognitive load refers to the mental processing that takes up " +
                        "resources but doesn't help users understand the content of an " +
                        "interface (e.g. distracting or unnecessary design elements)."
                ),
                localUXLawOrigins = "Cognitive load theory was developed in the late 1980s by " +
                    "John Sweller out of a study of problem solving and was in many ways an " +
                    "expansion on the information processing theories of George Miller. " +
                    "Sweller argued that instructional design can be used to reduce cognitive " +
                    "load in learners, culminating in his 1988 publication of “Cognitive Load " +
                    "Theory, Learning Difficulty, and Instructional Design”. Researchers later " +
                    "on developed a way to measure perceived mental effort which is indicative " +
                    "of " +
                    "cognitive load.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "What Is Cognitive Load? [Video]",
                        second = "Maddie Brown | Nielsen Norman Group",
                        third = "https://www.nngroup.com/videos/cognitive-load/"
                    ),Triple(
                        first = "Ease Cognitive Overload in UX Design",
                        second = "Mailchimp",
                        third = "https://mailchimp.com/resources/cognitive-overload/"
                    ),Triple(
                        first = "Minimize Cognitive Load to Maximize Usability",
                        second = "Kathryn Whitenton | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/minimize-cognitive-load/"
                    ),Triple(
                        first = "Design Principles for Reducing Cognitive Load",
                        second = "Jon Yablonski | Laws of UX",
                        // This should navigate to the appropriate screen [Articles]...
                        third = "https://lawsofux.com/articles/2015/design-principles-for-" +
                            "reducing-cognitive-load/"
                    ),Triple(
                        first = "Reducing Cognitive Overload For A Better User Experience",
                        second = "Danny Halarewich | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2016/09/reducing-cognitive-" +
                            "overload-for-a-better-user-experience/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Cognitive_load" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "cognitive-load-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/htsnyi13x0zn4mnp9pzcp/" +
                    "AHrEFqvmm_cn4UQw4wjvNNk?rlkey=jll89ygpcthx07xc7umr5bju4&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.doherty_threshold,
                localUxLawTitle = "Doherty Threshold",
                localUxLawDescription =
                    "Productivity soars when a computer and its users interact " +
                        "at a pace (<400ms) that ensures that neither has to wait on the other.",
                localUXLawTakeaways = listOf(
                    "Provide system feedback within 400 ms in order to keep users’ attention and " +
                        "increase productivity.",
                    "Use perceived performance to improve response time and reduce the " +
                        "perception of waiting.",
                    "Animation is one way to visually engage people while loading or processing " +
                        "is happening in the background.",
                    "Progress bars help make wait times tolerable, regardless of their accuracy.",
                    "Purposefully adding a delay to a process can actually increase its " +
                        "perceived value and instill a sense of trust, even when the process " +
                        "itself actually takes much less time."
                ),
                localUXLawOrigins = "In 1982 Walter J. Doherty and Ahrvind J. Thadani published, " +
                    "in the IBM Systems Journal, a research paper that set the requirement for " +
                    "computer response time to be 400 milliseconds, not 2,000 (2 seconds) " +
                    "which had been the previous standard. When a human being’s command was " +
                    "executed and returned an answer in under 400 milliseconds, it was deemed " +
                    "to exceed the Doherty threshold, and use of such applications were deemed " +
                    "to be “addicting” to users.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "The Economic Value of Rapid Response Time",
                        second = "Jim Elliott",
                        third = "https://jlelliotton.blogspot.com/p/the-economic-value-of-" +
                            "rapid-response.html"
                    ),Triple(
                        first = "This 70s UX gem still applies today",
                        second = "Michael Gugel | Medium",
                        third = "https://gugel.medium.com/the-doherty-threshold-5471ca990de6"
                    ),Triple(
                        first = "The Economic Value of Rapid Response Time",
                        second = "Dave Rupert",
                        third = "https://daverupert.com/2015/06/doherty-threshold/"
                    ),Triple(
                        first = "The importance of percent-done progress indicators for " +
                            "computer-human interfaces",
                        second = "Brad A. Myers",
                        third = "https://www.researchgate.net/publication/234791131_The_" +
                            "importance_of_percent-done_progress_indicators_for_computer-" +
                            "human_interfaces"
                    ),
                    Triple(
                        first = "Response time in man-computer conversational transactions",
                        second = "Robert B. Miller",
                        third = "https://yusufarslan.net/sites/yusufarslan.net/files/upload/" +
                            "content/Miller1968.pdf"
                    ),
                ),
                localUXLawSource = null ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "doherty-threshold-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/du4o9esuvjl3zmw/" +
                    "AAD1SjQ56-lIord47MaAH83Ba?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.fitts_law,
                localUxLawTitle = "Fitt's Law",
                localUxLawDescription =
                    "The time to acquire a target is a function of the distance to " +
                        "and size of the target.",
                localUXLawTakeaways = listOf(
                    "Touch targets should be large enough for users to accurately select them.",
                    "Touch targets should have ample spacing between them.",
                    "Touch targets should be placed in areas of an interface that allow them to " +
                        "be easily acquired."
                ),
                localUXLawOrigins = "In 1954, psychologist Paul Fitts, examining the human motor " +
                    "system, showed that the time required to move to a target depends on the " +
                    "distance to it, yet relates inversely to its size. By his law, fast " +
                    "movements and small targets result in greater error rates, due to the " +
                    "speed-accuracy trade-off. Although multiple variants of Fitts’ law exist, " +
                    "all encompass this idea. Fitts’ law is widely applied in user experience " +
                    "(UX) and user interface (UI) design. For example, this law influenced the " +
                    "convention of making interactive buttons large (especially on " +
                    "finger-operated " +
                    "mobile devices)—smaller buttons are more difficult (and time-consuming) " +
                    "to click. Likewise, the distance between a user’s task/attention area and " +
                    "the task-related button should be kept as short as possible.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Fitts's Law and Its Applications in UX",
                        second = "Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/fitts-law/"
                    ),Triple(
                        first = "Fitts’ Law In The Touch Era",
                        second = "Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2022/02/fitts-law-touch-era/"
                    ),Triple(
                        first = "Fitts’s Law: The Importance of Size and Distance in UI Design",
                        second = "Interaction Design Foundation",
                        third = "https://www.interaction-design.org/literature/article/fitts-s-" +
                            "law-the-importance-of-size-and-distance-in-ui-design"
                    ),Triple(
                        first = "Fitts’s Law on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Fitts%27s_law"
                    ),Triple(
                        first = "Design for Fingers, Touch, and People, Part 1",
                        second = "Steven Hoober | UX Matters",
                        third = "https://www.uxmatters.com/mt/archives/2017/03/design-for-" +
                            "fingers-touch-and-people-part-1.php"
                    ),Triple(
                        first = "The information capacity of the human motor system in " +
                            "controlling the amplitude of movement",
                        second = "Semantic Scholar",
                        third = "https://pdfs.semanticscholar.org/634c/" +
                            "9fde5f1c411e4487658ac738dcf18d98ea8d.pdf"
                    ),
                ),
                localUXLawSource = "https://www.interaction-design.org/literature/topics/" +
                    "fitts-law" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "fittss-law-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/ozd7pluafa4f6k9/" +
                    "AAC0obiwWN2-zc6QhEskBd0-a?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.flow,
                localUxLawTitle = "Flow",
                localUxLawDescription =
                    "The mental state in which a person performing some activity is " +
                        "fully immersed in a feeling of energized focus, " +
                        "full involvement, and enjoyment in the process of the activity.",
                localUXLawTakeaways = listOf(
                    "Flow occurs when there is a balance between the difficulty of a task with " +
                        "the level of skill at the given task. It’s characterized by intense and " +
                        "focused concentration on the present, combined with a sense of total " +
                        "control.",
                    "A task that’s too difficult leads to heighten frustration while a task " +
                        "that’s too easy can lead to boredom. Finding the right balance " +
                        "requires matching the challenge with skill of the user.",
                    "Design for flow by providing the necessary feedback so that the user know " +
                        "what action has been done and what has been accomplished.",
                    "Optimize for efficiency and system responsiveness by removing any " +
                        "unnecessary friction, and making content and features available " +
                        "for discovery to avoid disengagement with the interface."
                ),
                localUXLawOrigins = "Flow was coined by psychologist Mihály Csíkszentmihályi in " +
                    "1975 and has been widely referred to across a variety of fields " +
                    "(and is particularly well recognized in occupational therapy), " +
                    "though the concept has been claimed to have existed for thousands of " +
                    "years under other names.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "The 3 design principles for creating flow",
                        second = "Rahul Vohra | Superhuman",
                        third = "https://blog.superhuman.com/how-to-design-for-flow/"
                    ),Triple(
                        first = "Designing For Flow",
                        second = "Jim Ramsey | A List Apart",
                        third = "https://alistapart.com/article/designingforflow/"
                    ),Triple(
                        first = "7 Steps to Achieving Flow in UX Design",
                        second = "Elaine Tran | UX Collective",
                        third = "https://uxdesign.cc/7-steps-to-achieving-flow-in-ux-design-" +
                            "7ef28adb0de2"
                    ),Triple(
                        first = "Beyond Task Completion: Flow in Design",
                        second = "Dana Chisnell | UX Magazine",
                        third = "https://uxmag.com/articles/beyond-task-completion-flow-in-design"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Flow_%28psychology%29" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "flow-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/yp347s5dchdf1ye5b6zhd/" +
                    "AEeXQcdyugYiCqglfhYYErA?rlkey=y0va8b1z3u4u4kyhxlso2e1dz&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.goal_gradient_effect,
                localUxLawTitle = "Goal-Gradient Effect",
                localUxLawDescription =
                    "The tendency to approach a goal increases with proximity to the goal.",
                localUXLawTakeaways = listOf(
                    "The closer users are to completing a task, the faster they work towards " +
                        "reaching it.",
                    "Providing artificial progress towards a goal will help to ensure users " +
                        "are more likely to have the motivation to complete that task.",
                    "Provide a clear indication of progress in order to motivate users to " +
                        "complete tasks."
                ),
                localUXLawOrigins = "The goal-gradient hypothesis, originally proposed by the " +
                    "behaviorist Clark Hull in 1932, states that the tendency to approach a " +
                    "goal increases with proximity to the goal. In a classic experiment that " +
                    "tests this hypothesis, Hull (1934) found that rats in a straight alley " +
                    "ran progressively faster as they proceeded from the starting box to the " +
                    "food. Although the goal-gradient hypothesis has been investigated " +
                    "exten-sively with animals (e.g., Anderson 1933; Brown 1948; for a review, " +
                    "see Heilizer 1977), its implications for human behavior and decision " +
                    "making are understudied. Further-more, this issue has important theoretical " +
                    "and practical implications for intertemporal consumer behavior in " +
                    "reward programs (hereinafter RPs) and other types of motivational " +
                    "systems (e.g., Deighton 2000; Hsee, Yu, and Zhang 2003; Kivetz 2003; " +
                    "Lal and Bell 2003).",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "How Uber uses psychology to perfect their customer experience",
                        second = "Jennifer Clinehens | Choice Hacking",
                        third = "https://medium.com/choice-hacking/how-uber-uses-psychology-to-" +
                            "perfect-their-customer-experience-d6c440285029"
                    ),Triple(
                        first = "Moving the Finish Line: The Goal Gradient Hypothesis",
                        second = "Farnam Street",
                        third = "https://fs.blog/2016/10/goal-gradient-hypothesis/"
                    ),Triple(
                        first = "Designing for motivation with the goal-gradient effect",
                        second = "Ian Batterbee | UX Collective",
                        third = "https://uxdesign.cc/designing-for-motivation-with-the-goal-" +
                            "gradient-effect-c873cdf58beb"
                    ),Triple(
                        first = "The Goal-Gradient Hypothesis Resurrected: Purchase Acceleration," +
                            " " +
                            "Illusionary Goal Progress, and Customer Retention",
                        second = "Ran Kivetz, Oleg Urminsky, Yuhuang Zheng | uchicago.edu",
                        third = "http://home.uchicago.edu/ourminsky/Goal-Gradient_Illusionary_" +
                            "Goal_Progress.pdf"
                    ),Triple(
                        first = "The importance of percent-done progress indicators for " +
                            "computer-human interfaces",
                        second = "Brad A. Myers | Carnegie Mellon University",
                        third = "https://www.researchgate.net/publication/234791131_The_" +
                            "importance_of_percent-done_progress_indicators_for_computer-" +
                            "human_interfaces"
                    ),
                ),
                localUXLawSource = "http://home.uchicago.edu/ourminsky/" +
                    "Goal-Gradient_Illusionary_Goal_Progress.pdf" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/" +
                    "product/goal-gradient-effect" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/j8em74kljaohv0p/" +
                    "AABPm9Z5AeiSYlUd4joUfv6Aa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.hicks_law,
                localUxLawTitle = "Hick's Law",
                localUxLawDescription =
                    "The time it takes to make a decision increases with the number and " +
                        "complexity of choices.",
                localUXLawTakeaways = listOf(
                    "Minimize choices when response times are critical to decrease decision time.",
                    "Break complex tasks into smaller steps in order to decrease cognitive load.",
                    "Avoid overwhelming users by highlighting recommended options.",
                    "Use progressive onboarding to minimize cognitive load for new users.",
                    "Be careful not to simplify to the point of abstraction."
                ),
                localUXLawOrigins = "Hick’s Law (or the Hick-Hyman Law) is named after a " +
                    "British and an American psychologist team of William Edmund Hick and " +
                    "Ray Hyman. In 1952, this pair set out to examine the relationship " +
                    "between the number of stimuli present and an individual’s reaction " +
                    "time to any given stimulus. As you would expect, the more stimuli to " +
                    "choose from, the longer it takes the user to make a decision on which " +
                    "one to interact with. Users bombarded with choices have to take time to " +
                    "interpret and decide, giving them work they don’t want.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "UX Psychology: Google Search",
                        second = "Jon Yablonski",
                        third = "https://lawsofux.com/articles/2020/ux-psychology-google-search/"
                    ),Triple(
                        first = "The Choice Overload Effect: Why simplicity is the " +
                            "key to perfecting your experience",
                        second = "Jennifer Clinehens | Medium",
                        third = "https://medium.com/choice-hacking/choice-overload-why-" +
                            "simplicity-is-the-key-to-winning-customers-2f8e239eaba6"
                    ),Triple(
                        first = "Hick’s Law: Making the choice easier for users",
                        second = "Mads Soegaard | Interaction Design Foundation",
                        third = "https://www.interaction-design.org/literature/article/hick-s-" +
                            "law-making-the-choice-easier-for-users"
                    ),Triple(
                        first = "Hick’s Law — Quick Decision Making",
                        second = "Anton Nikolov | Medium.com",
                        third = "https://uxplanet.org/design-principles-hicks-law-quick-" +
                            "decision-making-3dcc1b1a0632"
                    ),Triple(
                        first = "The Psychology Principles Every UI/UX Designer Needs to Know",
                        second = "Thanasis Rigopoulos | Marvel",
                        third = "https://blog.marvelapp.com/psychology-principles-every-uiux-" +
                            "designer-needs-know/"
                    ),Triple(
                        first = "Hick’s Law on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Hick%27s_law"
                    ),
                ),
                localUXLawSource = "https://www.interaction-design.org/literature/article/hick-s-" +
                    "law-making-the-choice-easier-for-users" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "hicks-law-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/qcgfds9hd3j8xwb/" +
                    "AAB7iMfXLQX7Nzhu6SFxZTjIa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.jakobs_law,
                localUxLawTitle = "Jakob's Law",
                localUxLawDescription =
                    "Users spend most of their time on other sites. This means that " +
                        "users prefer your site to work the same way as " +
                        "all the other sites they already know.",
                localUXLawTakeaways = listOf(
                    "Users will transfer expectations they have built around one familiar " +
                        "product " +
                        "to another that appears similar.",
                    "By leveraging existing mental models, we can create superior user " +
                        "experiences in which the users can focus on their tasks rather " +
                        "than on learning new models.",
                    "When making changes, minimize discord by empowering users to continue " +
                        "using a familiar version for a limited time."
                ),
                localUXLawOrigins = "Jakob’s Law was coined by Jakob Nielsen, a User Advocate " +
                    "and principal of the Nielsen Norman Group which he co-founded with Dr. " +
                    "Donald A. Norman (former VP of research at Apple Computer). " +
                    "Dr. Nielsen established the ‘discount usability engineering’ " +
                    "movement for fast and cheap improvements of user interfaces and has " +
                    "invented several usability methods, including heuristic evaluation.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Jakob’s Law of Internet User Experience",
                        second = "Nielsen Norman Group",
                        third = "https://www.nngroup.com/videos/jakobs-law-internet-ux/"
                    ),Triple(
                        first = "The Power Law of Learning: Consistency vs. Innovation in User " +
                            "Interfaces",
                        second = "Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/power-law-learning/"
                    ),Triple(
                        first = "Familiar vs Novel",
                        second = "Jon Yablonski | Laws of UX",
                        third = "https://lawsofux.com/articles/2024/familiar-vs-novel/"
                    ),Triple(
                        first = "Top 10 Mistakes in Web Design",
                        second = "Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/top-10-mistakes-web-design/"
                    ),Triple(
                        first = "End of Web Design",
                        second = "Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/end-of-web-design/"
                    ),
                ),
                localUXLawSource = "https://www.nngroup.com/people/jakob-nielsen/" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "jakobs-law-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/5ipezzqg061hfli/" +
                    "AACVHRRfuHUM-LsLXdESFCa6a?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.law_of_common_region,
                localUxLawTitle = "Law of Common Region",
                localUxLawDescription =
                    "Elements tend to be perceived into groups if they are " +
                        "sharing an area with a clearly defined boundary.",
                localUXLawTakeaways = listOf(
                    "Common region creates a clear structure and helps users quickly and " +
                        "effectively understand the relationship between elements and sections.",
                    "Adding a border around an element or group of elements is an easy way to " +
                        "create common region.",
                    "Common region can also be created by defining a background behind an " +
                        "element or group of elements."
                ),
                localUXLawOrigins = "The principles of grouping (or Gestalt laws of grouping) " +
                    "are a set of principles in psychology, first proposed by Gestalt " +
                    "psychologists to account for the observation that humans naturally " +
                    "perceive objects as organized patterns and objects, a principle known as " +
                    "Prägnanz. Gestalt psychologists argued that these principles exist " +
                    "because the mind has an innate disposition to perceive patterns in the " +
                    "stimulus based on certain rules. These principles are organized into " +
                    "five categories: Proximity, Similarity, Continuity, Closure, and " +
                    "Connectedness.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "The Principle of Common Region: Containers Create Groupings",
                        second = "Aurora Harley | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/common-region/"
                    ),Triple(
                        first = "Design Principles: Visual Perception And The Principles Of " +
                            "Gestalt",
                        second = "Steven Bradley | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2014/03/design-principles-" +
                            "visual-perception-and-the-principles-of-gestalt/"
                    ),Triple(
                        first = "Gestalt principles",
                        second = "Scholarpedia",
                        third = "http://www.scholarpedia.org/article/Gestalt_principles"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Principles_of_grouping" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "law-of-common-region-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/br3v3ioqm8emckb/" +
                    "AADGf7D9mf3Mf4qHCXRYvrlQa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.law_of_proximity,
                localUxLawTitle = "Law of Proximity",
                localUxLawDescription =
                    "Objects that are near, or proximate to each other, tend to be grouped " +
                        "together.",
                localUXLawTakeaways = listOf(
                    "Proximity helps to establish a relationship with nearby objects.",
                    "Elements in close proximity are perceived to share similar functionality or " +
                        "traits.",
                    "Proximity helps users understand and organize information faster and more " +
                        "efficiently."
                ),
                localUXLawOrigins = "The principles of grouping (or Gestalt laws of grouping) " +
                    "are a set of principles in psychology, first proposed by " +
                    "Gestalt psychologists to account for the observation that humans " +
                    "naturally perceive objects as organized patterns and objects, a " +
                    "principle known as Prägnanz. Gestalt psychologists argued that these " +
                    "principles exist because the mind has an innate disposition to " +
                    "perceive patterns in the stimulus based on certain rules. " +
                    "These principles are organized into five categories: " +
                    "Proximity, Similarity, Continuity, Closure, and Connectedness.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Gestalt Principles of Design—Proximity",
                        second = "Chris Butler",
                        third = "https://www.chrbutler.com/gestalt-principles-of-design-proximity"
                    ),Triple(
                        first = "Proximity Principle in Visual Design",
                        second = "Aurora Harley | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/gestalt-proximity/"
                    ),Triple(
                        first = "Laws of Proximity, Uniform Connectedness, and Continuation",
                        second = "Mads Soegaard | Interation Design Foundation",
                        third = "https://www.interaction-design.org/literature/article/laws-of-" +
                            "proximity-uniform-connectedness-and-continuation-gestalt-principles-2"
                    ),Triple(
                        first = "The Psychology Principles Every UI/UX Designer Needs to Know",
                        second = "Thanasis Rigopoulos | Marvel",
                        third = "https://blog.marvelapp.com/psychology-principles-every-" +
                            "uiux-designer-needs-know/"
                    ),Triple(
                        first = "Design Principles: Visual Perception And The Principles Of " +
                            "Gestalt",
                        second = "Steven Bradley | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2014/03/design-principles-" +
                            "visual-perception-and-the-principles-of-gestalt/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Principles_of_grouping" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "law-of-proximity-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/3y61n213d8o5hxw/" +
                    "AAAIfaaOTRAgnzaJgceDYz3Fa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.law_of_pragnanz,
                localUxLawTitle = "Law of Prägnanz",
                localUxLawDescription =
                    "People will perceive and interpret ambiguous or complex images " +
                        "as the simplest form possible, because it is the interpretation " +
                        "that requires the least cognitive effort of us.",
                localUXLawTakeaways = listOf(
                    "The human eye likes to find simplicity and order in complex shapes because " +
                        "it prevents us from becoming overwhelmed with information.",
                    "Research confirms that people are better able to visually process and " +
                        "remember simple figures than complex figures.",
                    "The human eye simplifies complex shapes by transforming them into a single, " +
                        "unified shape."
                ),
                localUXLawOrigins = "In 1910, psychologist Max Wertheimer had an insight when he " +
                    "observed a series of lights flashing on and off at a railroad crossing. " +
                    "It was similar to how the lights encircling a movie theater marquee flash " +
                    "on and off. To the observer, it appears as if a single light moves around " +
                    "the marquee, traveling from bulb to bulb, when in reality it’s a series " +
                    "of bulbs turning on and off and the lights don’t move it all. This " +
                    "observation led to a set of descriptive principles about how we visually " +
                    "perceive objects. These principles sit at the heart of nearly everything " +
                    "we do graphically as designers.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Design Principles: Visual Perception And The Principles Of " +
                            "Gestalt",
                        second = "Steven Bradley | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2014/03/design-principles-" +
                            "visual-perception-and-the-principles-of-gestalt/"
                    ),Triple(
                        first = "The Laws of Figure/Ground, Prägnanz, Closure, and Common Fate",
                        second = "Mads Soegaard | Interation Design Foundation",
                        third = "https://www.interaction-design.org/literature/article/the-" +
                            "laws-of-figure-ground-praegnanz-closure-and-common-fate-gestalt-" +
                            "principles-3"
                    ),
                ),
                localUXLawSource = "https://www.smashingmagazine.com/2014/03/" +
                    "design-principles-visual-perception-and-the-principles-of-gestalt/" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "law-of-pragnanz-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/k7zogxjp8w43g09/" +
                    "AAAIF3gfRKpRdi083_L1dksUa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.law_of_similarity,
                localUxLawTitle = "Law of Similarity",
                localUxLawDescription =
                    "The human eye tends to perceive similar elements as " +
                        "a complete picture, shape, or group, even if those elements are " +
                        "separated.",
                localUXLawTakeaways = listOf(
                    "Elements that are visually similar will be perceived as related.",
                    "Color, shape, and size, orientation and movement can signal that " +
                        "elements belong to the same group and likely share a common " +
                        "meaning or functionality.",
                    "Ensure that links and navigation systems are visually differentiated " +
                        "from normal text elements."
                ),
                localUXLawOrigins = "The principles of grouping (or Gestalt laws of grouping) " +
                    "are a set of principles in psychology, first proposed by " +
                    "Gestalt psychologists to account for the observation that humans " +
                    "naturally perceive objects as organized patterns and objects, a " +
                    "principle known as Prägnanz. Gestalt psychologists argued that these " +
                    "principles exist because the mind has an innate disposition to perceive " +
                    "patterns in the stimulus based on certain rules. These principles are " +
                    "organized into five categories: Proximity, Similarity, Continuity, " +
                    "Closure, and Connectedness.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Gestalt Principles of Design—Similarity",
                        second = "Chris Butler",
                        third = "https://www.chrbutler.com/gestalt-principles-of-design-similarity"
                    ),Triple(
                        first = "Similarity Principle in Visual Design",
                        second = "Aurora Harley | Nielson Norman Group",
                        third = "https://www.nngroup.com/articles/gestalt-similarity/"
                    ),Triple(
                        first = "The Law of Similarity - Gestalt Principles",
                        second = "Interaction Deisgn Foundation | Mads Soegaard",
                        third = "https://www.interaction-design.org/literature/article/the-" +
                            "law-of-similarity-gestalt-principles-1"
                    ),Triple(
                        first = "Design Principles: Visual Perception And The Principles Of " +
                            "Gestalt",
                        second = "Steven Bradley | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2014/03/design-principles-" +
                            "visual-perception-and-the-principles-of-gestalt/"
                    ),Triple(
                        first = "Use Gestalt Laws to Improve Your UX",
                        second = "Sabina Idler | Usabilla Blog",
                        third = "http://blog.usabilla.com/gestalt-laws-start-with-thinking-basic/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Principles_of_grouping" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "law-of-similarity-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/th8x0ligr0mgmsa/" +
                    "AADb5ve3QmeX0-UThBDnYHn7a?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.law_of_uniform_connectedness,
                localUxLawTitle = "Law of Uniform Connectedness",
                localUxLawDescription =
                    "Elements that are visually connected are perceived as more " +
                        "related than elements with no connection.",
                localUXLawTakeaways = listOf(
                    "Group functions of a similar nature so they are visually connected via " +
                        "colors, lines, frames, or other shapes.",
                    "Alternately, you can use a tangible connecting reference " +
                        "(line, arrow, etc) from one element to the next to also create a " +
                        "visual connection.",
                    "Use uniform connectedness to show context or to emphasize the " +
                        "relationship between similar items."
                ),
                localUXLawOrigins = "The principles of grouping (or Gestalt laws of grouping) " +
                    "are a set of principles in psychology, first proposed by Gestalt " +
                    "psychologists to account for the observation that humans naturally " +
                    "perceive objects as organized patterns and objects, a principle " +
                    "known as Prägnanz. Gestalt psychologists argued that these principles " +
                    "exist because the mind has an innate disposition to perceive patterns in " +
                    "the stimulus based on certain rules. These principles are organized into " +
                    "five categories: Proximity, Similarity, Continuity, Closure, and " +
                    "Connectedness.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Gestalt Principles of Perception",
                        second = "Andy Rutledge",
                        third = "http://www.andyrutledge.com/gestalt-principles-3.html"
                    ),Triple(
                        first = "Laws of Proximity, Uniform Connectedness, and Continuation",
                        second = "Interaction Design Foundation | Mads Soegaard",
                        third = "https://www.interaction-design.org/literature/article/laws-of-" +
                            "proximity-uniform-connectedness-and-continuation-gestalt-principles-2"
                    ),Triple(
                        first = "Design Principles: Visual Perception And The Principles Of " +
                            "Gestalt",
                        second = "Steven Bradley | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2014/03/design-principles-" +
                            "visual-perception-and-the-principles-of-gestalt/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Principles_of_grouping" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "uniform-connectedness-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/yqee5qzembeoojx/" +
                    "AADdsMqvX5PUFqHjztNQ1cmQa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.mental_model,
                localUxLawTitle = "Mental Model",
                localUxLawDescription =
                    "A compressed model based on what we think we know about a system " +
                        "and how it works.",
                localUXLawTakeaways = listOf(
                    "We form a working model in our minds around what we think we know about a " +
                        "system, especially about how it works, and then we apply that model " +
                        "to new situations where the system is similar.",
                    "Match designs to the users’ mental models to improve their experience. " +
                        "This enables them to easily transfer their knowledge from one product " +
                        "or experience to another, without the need to first take the time to " +
                        "understand how the new system works.",
                    "Good user experiences are made possible when the design of a product or " +
                        "service is in alignment with the user’s mental model. Take for " +
                        "example e-commerce websites, which use consistent patterns and " +
                        "conventions such product cards, virtual carts and checkout flows in" +
                        " order to conform to users’ expectations.",
                    "The task of shrinking the gap between our own mental models and those of " +
                        "the users is one of the biggest challenges we face, and to achieve " +
                        "this goal we use a variety of user research methods " +
                        "(e.g. user interviews, personas, journey maps, empathy maps)."
                ),
                localUXLawOrigins = "The notion of a mental model was originally postulated by " +
                    "the psychologist Kenneth Craik in the 1943 book The Nature of Explanation " +
                    "(1943). He proposed that people carry in their minds a small-scale model " +
                    "of how the world works. These models are used to anticipate events, " +
                    "reason, and form explanations.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Mental Models: An Interdisciplinary Synthesis of Theory and " +
                            "Methods",
                        second = "Natalie A. Jones, Helen Ross, Timothy Lynam, Pascal Perez, " +
                            "Anne Leitch | JSTOR",
                        third = "https://www.jstor.org/stable/26268859"
                    ),Triple(
                        first = "Mental Models in User Experience Design",
                        second = "Megan Chan and Jakob Nielsen | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/mental-models/"
                    ),Triple(
                        first = "Familiar vs Novel",
                        second = "Jon Yablonski | Laws of UX",
                        third = "https://lawsofux.com/articles/2024/familiar-vs-novel/"
                    ),Triple(
                        first = "Mental Models",
                        second = "Dr. Lauren Braithwaite | The Decision Lab",
                        third = "https://thedecisionlab.com/reference-guide/design/mental-models"
                    ),
                ),
                localUXLawSource = "https://www.jstor.org/stable/26268859" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "mental-model-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/s4kp67byrn2ta4arhfo2x/" +
                    "AGdDVvlRMqI5O4gIrdHJ7_M?rlkey=pd1e2u90fiw7zu0krersmyd9j&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.millers_law,
                localUxLawTitle = "Miller’s Law",
                localUxLawDescription =
                    "The average person can only keep 7 (plus or minus 2) " +
                        "items in their working memory.",
                localUXLawTakeaways = listOf(
                    "Don’t use the “magical number seven” to justify unnecessary design " +
                        "limitations.",
                    "Organize content into smaller chunks to help users process, understand, " +
                        "and memorize easily.",
                    "Remember that short-term memory capacity will vary per individual, " +
                        "based on their prior knowledge and situational context."
                ),
                localUXLawOrigins = "In 1956, George Miller asserted that the span of " +
                    "immediate memory and absolute judgment were both limited to around 7 " +
                    "pieces of information. The main unit of information is the bit, the " +
                    "amount of data necessary to make a choice between two equally likely " +
                    "alternatives. Likewise, 4 bits of information is a decision between " +
                    "16 binary alternatives (4 successive binary decisions). The point " +
                    "where confusion creates an incorrect judgment is the channel capacity. " +
                    "In other words, the quantity of bits which can be transmitted reliably " +
                    "through a channel, within a certain amount of time.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Miller’s Law, Chunking, and the Capacity of Working Memory",
                        second = "Khan Academy",
                        third = "https://www.khanacademy.org/test-prep/mcat/social-sciences-" +
                            "practice/social-science-practice-tut/e/miller-s-law--chunking--and-" +
                            "the-capacity-of-working-memory"
                    ),Triple(
                        first = "Design Principles for Reducing Cognitive Load",
                        second = "Jon Yablonski | Medium.com",
                        third = "https://blog.prototypr.io/design-principles-for-reducing-" +
                            "cognitive-load-84e82ca61abd"
                    ),Triple(
                        first = "The Magical Mystery Four: How is Working Memory Capacity " +
                            "Limited, and Why?",
                        second = "Nelson Cowan | NCBI",
                        third = "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC2864034/"
                    ),Triple(
                        first = "Miller’s Law on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Miller%27s_law"
                    ),Triple(
                        first = "The Magical Number Seven, Plus or Minus Two: Some Limits on Our " +
                            "Capacity for Processing Information",
                        second = "George A. Miller",
                        third = "http://www2.psych.utoronto.ca/users/peterson/psy430s2001/Miller" +
                            "%20GA%20Magical%20Seven%20Psych%20Review%201955.pdf"
                    ),
                ),
                localUXLawSource = "https://www.khanacademy.org/test-prep/mcat/social-sciences-" +
                    "practice/social-science-practice-tut/e/miller-s-law--chunking--and-the-" +
                    "capacity-of-working-memory" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "millers-" +
                    "law-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/cxqjmcpqxvxhkw5/" +
                    "AACZ2jN5XBrKxM2wbd63V7Zxa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.occams_razor,
                localUxLawTitle = "Occam’s Razor",
                localUxLawDescription =
                    "Among competing hypotheses that predict equally well, " +
                        "the one with the fewest assumptions should be selected.",
                localUXLawTakeaways = listOf(
                    "The best method for reducing complexity is to avoid it in the first place.",
                    "Analyze each element and remove as many as possible, without compromising " +
                        "the " +
                        "overall function.",
                    "Consider completion only when no additional items can be removed."
                ),
                localUXLawOrigins = "Occam’s razor (also Ockham’s razor; Latin: lex parsimoniae " +
                    "\"law of parsimony\") is a problem-solving principle that, when presented " +
                    "with competing hypothetical answers to a problem, one should select the " +
                    "one that makes the fewest assumptions. The idea is attributed to William " +
                    "of Ockham (c. 1287–1347), who was an English Franciscan friar, scholastic " +
                    "philosopher, and theologian.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "How to Use Occam’s Razor Without Getting Cut",
                        second = "Farnam Street",
                        third = "https://fs.blog/occams-razor/"
                    ),Triple(
                        first = "Designing with Occam’s Razor",
                        second = "Jon Yablonski | Medium",
                        third = "https://medium.com/@jonyablonski/designing-with-occams-razor-" +
                            "3692df2f3c7f"
                    ),Triple(
                        first = "Occam’s Razor: The Simplest Solution is Always the Best",
                        second = "Mads Soegaard | Interaction Design Foundation",
                        third = "https://www.interaction-design.org/literature/article/occam-s-" +
                            "razor-the-simplest-solution-is-always-the-best"
                    ),Triple(
                        first = "Complexity Bias: Why We Prefer Complicated to Simple",
                        second = "Farnam Street",
                        third = "https://fs.blog/complexity-bias/"
                    ),Triple(
                        first = "Occam’s Razor: A Great Principle for Designers",
                        second = "Web Designer Depot",
                        third = "https://www.webdesignerdepot.com/2010/07/occams-razor-a-great-" +
                            "principle-for-designers/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Occam%27s_razor" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "occams-razor-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/2rqitd4v0foyxny/" +
                    "AADx_EMskrCtJB2eCNuCnaRMa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.paradox_of_the_active_user,
                localUxLawTitle = "Paradox of the Active User",
                localUxLawDescription =
                    "Users never read manuals but start using the software immediately.",
                localUXLawTakeaways = listOf(
                    "Users are often motivated to complete their immediate tasks and therefore " +
                        "they don't want to spend time up front reading documentation.",
                    "This paradox exist because users will save time in the long term if they " +
                        "take the time to optimize the system and learn more about it.",
                    "Make guidance accessible throughout the product experience and design it to " +
                        "fit within the context of use so that it can help these active new " +
                        "users " +
                        "no matter what path they choose to take (e.g. tooltips with helpful " +
                        "information)."
                ),
                localUXLawOrigins = "This concept was first defined by Mary Beth Rosson and John " +
                    "Carroll in 1987 as part of their larger work on interaction design, " +
                    "Interfacing thought: cognitive aspects of human-computer interaction. " +
                    "Rosson and Carroll found that new users were not reading the manuals " +
                    "supplied with computers and instead would just get started using them, " +
                    "even if it meant getting into errors and running into roadblocks.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Onboarding for Active Users",
                        second = "Jon Yablonski | Laws of UX",
                        third = "https://lawsofux.com/articles/2024/onboarding-for-active-users/"
                    ),Triple(
                        first = "Paradox of the Active User",
                        second = "Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/paradox-of-the-active-user/"
                    ),Triple(
                        first = "Paradox of the Active User [PDF]",
                        second = "ResearchGate",
                        third = "https://www.researchgate.net/publication/262322669_Paradox_of_" +
                            "the_active_user"
                    ),Triple(
                        first = "The Paradox of Active Users [PDF]",
                        second = "ResearchGate",
                        third = "https://www.researchgate.net/publication/285543245_The_" +
                            "paradox_of_active_users"
                    ),
                ),
                localUXLawSource = "https://www.researchgate.net/publication/" +
                    "262322669_Paradox_of_the_active_user" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "paradox-of-the-active-user-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/5fjptcnltdjvvr8uvb6p3/" +
                    "APFDyqWSlY9UBz1HOC8AxKw?rlkey=3asxfczvgqffnkb664hdrux5u&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.pareto_principle,
                localUxLawTitle = "Pareto Principle",
                localUxLawDescription =
                    "The Pareto principle states that, for many events, " +
                        "roughly 80% of the effects come from 20% of the causes.",
                localUXLawTakeaways = listOf(
                    "Inputs and outputs are often not evenly distributed.",
                    "A large group may contain only a few meaningful contributors to the desired " +
                        "outcome.",
                    "Focus the majority of effort on the areas that will bring the largest " +
                        "benefits to the most users."
                ),
                localUXLawOrigins = "Its origins stem back to Vilfredo Pareto, an economist who " +
                    "noticed 80% of Italy’s land was owned by 20% of the population. Though it " +
                    "might seem vague, the 80/20 way of thinking can provide insightful and " +
                    "endlessly applicable analysis of lopsided systems, including user " +
                    "experience strategy.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Good UX is not just about minimizing clicks",
                        second = "Avi Siegel | UX Collective",
                        third = "https://uxdesign.cc/good-ux-is-not-just-about-minimizing-clicks-" +
                            "5504fa2ff430"
                    ),Triple(
                        first = "Prioritize Quantitative Data with the Pareto Principle",
                        second = "Evan Sunwall | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/pareto-principle/"
                    ),Triple(
                        first = "The 80/20 Rule in User Experience",
                        second = "Arin Bhowmick | Medium",
                        third = "https://medium.com/design-ibm/the-80-20-rule-in-user-experience-" +
                            "1695de32aaae"
                    ),Triple(
                        first = "Applying the Pareto Principle to the User Experience",
                        second = "Jeff Sauro | Measuring U",
                        third = "https://measuringu.com/pareto-ux/"
                    ),Triple(
                        first = "The Pareto Principle and Your User Experience Work",
                        second = "Interaction Design Foundation",
                        third = "https://www.interaction-design.org/literature/article/the-pareto-" +
                            "principle-and-your-user-experience-work"
                    ),Triple(
                        first = "Pareto Principle on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Pareto_principle"
                    ),
                ),
                localUXLawSource = "https://medium.com/design-ibm/" +
                    "the-80-20-rule-in-user-experience-1695de32aaae" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "pareto-principle-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/neqxsc8o7iqfbif/" +
                    "AACl_tzKHcSocxhLB1_ZjkHEa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.parkinsons_law,
                localUxLawTitle = "Parkinson's Law",
                localUxLawDescription =
                    "Any task will inflate until all of the available time is spent.",
                localUXLawTakeaways = listOf(
                    "Limit the time it takes to complete a task to what users expect it’ll take.",
                    "Reducing the actual duration to complete a task from the expected " +
                        "duration will improve the overall user experience.",
                    "Leverage features such as autofill to save the user time when providing " +
                        "critical information within forms. This allows for quick completion " +
                        "of purchases, bookings and other such functions while preventing " +
                        "task inflation."
                ),
                localUXLawOrigins = "Articulated by Cyril Northcote Parkinson as part of the first " +
                    "sentence of a humorous essay published in The Economist in 1955 and since " +
                    "republished online, it was reprinted with other essays in the book " +
                    "Parkinson’s Law: The Pursuit of Progress (London, John Murray, 1958). " +
                    "He derived the dictum from his extensive experience in the British Civil " +
                    "Service.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Parkinson’s Law on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Parkinson%27s_law"
                    ),Triple(
                        first = "Parkinson’s Law: Why Constraints Are The Best Thing You Can " +
                            "Work With",
                        second = "Louis Chew | Medium.com",
                        third = "https://medium.com/the-mission/parkinsons-law-why-constraints-" +
                            "are-" +
                            "the-best-thing-you-can-work-with-4fad6e0e91cf"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Parkinson%27s_law" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "parkinsons-law-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/c8o1g01yjzlbtvq/" +
                    "AABAhoTkvu0Bu7U7ON4cTQRra?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.peak_end_rule,
                localUxLawTitle = "Peak-End Rule",
                localUxLawDescription =
                    "People judge an experience largely based on how they felt at " +
                        "its peak and at its end, rather than the " +
                        "total sum or average of every moment of the experience.",
                localUXLawTakeaways = listOf(
                    "Pay close attention to the most intense points and the final moments " +
                        "(the “end”) of the user journey.",
                    "Identify the moments when your product is most helpful, valuable, or " +
                        "entertaining and design to delight the end user.",
                    "Remember that people recall negative experiences more vividly than positive " +
                        "ones."
                ),
                localUXLawOrigins = "A 1993 study titled “When More Pain Is Preferred to Less: " +
                    "Adding a Better End” by Kahneman, Fredrickson, Charles Schreiber, and " +
                    "Donald Redelmeier provided groundbreaking evidence for the peak–end rule. " +
                    "Participants were subjected to two different versions of a single " +
                    "unpleasant experience. The first trial had subjects submerge a hand in " +
                    "14°C water for 60 seconds. The second trial had subjects submerge the " +
                    "other hand in 14°C water for 60 seconds, but then keep their hand " +
                    "submerged for an additional 30 seconds, during which the temperature " +
                    "was raised to 15 °C. Subjects were then offered the option of which " +
                    "trial to repeat. Against the law of temporal monotonicity, subjects " +
                    "were more willing to repeat the second trial, despite a prolonged " +
                    "exposure to uncomfortable temperatures. Kahneman et al. concluded " +
                    "that “subjects chose the long trial simply because they liked the " +
                    "memory of it better than the alternative (or disliked it less)”.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Peak–End Rule",
                        second = "Jon Yablonski",
                        third = "https://lawsofux.com/articles/2020/peak-end-rule/"
                    ),Triple(
                        first = "How Uber uses psychology to perfect their customer experience",
                        second = "Jennifer Clinehens | Medium",
                        third = "https://medium.com/choice-hacking/how-uber-uses-psychology-to-" +
                            "perfect-their-customer-experience-d6c440285029"
                    ),Triple(
                        first = "The Peak–End Rule: How Impressions Become Memories",
                        second = "Lexie Kane | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/peak-end-rule"
                    ),Triple(
                        first = "What is Peak-End Theory? A Psychologist Explains How Our " +
                            "Memory Fools Us",
                        second = "Positive Psychology",
                        third = "https://positivepsychology.com/what-is-peak-end-theory/"
                    ),Triple(
                        first = "How do our memories differ from our experiences?",
                        second = "The Decision Lab",
                        third = "https://thedecisionlab.com/biases/peak-end-rule/"
                    ),Triple(
                        first = "Peak–End Rule",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Peak%E2%80%93end_rule"
                    ),Triple(
                        first = "When More Pain Is Preferred to Less: Adding a Better End",
                        second = "Daniel Kahneman, Barbara L. Fredrickson, Charles A. Schreiber " +
                            "and Donald A. Redelmeier",
                        third = "https://www.jstor.org/stable/40062570"
                    ),Triple(
                        first = "Evaluations of pleasurable experiences: The peak-end rule",
                        second = "Amy M. Do, Alexander V. Rupert & George Wolford",
                        third = "https://link.springer.com/article/10.3758/PBR.15.1.96"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Peak%E2%80%93end_rule" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "peak-end-rule-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/u1xulqfl6njw98t/" +
                    "AADA88Nmae7zJaogeUu3x6lCa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.postels_law,
                localUxLawTitle = "Postel's Law",
                localUxLawDescription =
                    "Be liberal in what you accept, and conservative in what you send.",
                localUXLawTakeaways = listOf(
                    "Be empathetic to, flexible about, and tolerant of any of the various " +
                        "actions " +
                        "the user could take or any input they might provide.",
                    "Anticipate virtually anything in terms of input, access, and capability " +
                        "while providing a reliable and accessible interface.",
                    "The more we can anticipate and plan for in design, the more resilient the " +
                        "design will be.",
                    "Accept variable input from users, translating that input to meet your " +
                        "requirements, defining boundaries for input, and providing clear " +
                        "feedback to the user."
                ),
                localUXLawOrigins = "Postel’s Law (also known as the Robustness Principle) " +
                    "was formulated by Jon Postel, an early pioneer of the Internet. " +
                    "The Law is a design guideline for software, specifically in regards to " +
                    "TCP and networks, and states “TCP implementations should follow a " +
                    "general principle of robustness: be conservative in what you do, be " +
                    "liberal in what you accept from others”. In other words, programs that " +
                    "send messages to other machines (or to other programs on the same machine) " +
                    "should conform completely to the specifications, but programs that " +
                    "receive messages should accept non-conformant input as long as the " +
                    "meaning is clear.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Design Systems and Postel’s Law",
                        second = "Mark Boulton",
                        third = "https://markboulton.co.uk/journal/2016-05-17.design-systems-" +
                            "and-postels-law/"
                    ),Triple(
                        first = "Robustness and Least Power",
                        second = "Adactio",
                        third = "https://adactio.com/journal/14327"
                    ),Triple(
                        first = "Your Website has Two Faces",
                        second = "A List Apart",
                        third = "https://alistapart.com/article/your-website-has-two-faces"
                    ),Triple(
                        first = "Design with Difficult Data",
                        second = "Steven Garrity",
                        third = "https://alistapart.com/article/design-with-difficult-data/"
                    ),Triple(
                        first = "Robustness Principle",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Robustness_principle"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Robustness_principle" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "postels-law-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/zd1p8wtzla8uk9t/" +
                    "AABgL7tfR7YQJnY7ToujjMSta?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.selective_attention,
                localUxLawTitle = "Selective Attention",
                localUxLawDescription =
                    "The process of focusing our attention only to a " +
                        "subset of stimuli in an environment — usually those related to our goals.",
                localUXLawTakeaways = listOf(
                    "People often filter out information that isn’t relevant. This happens in order " +
                        "to maintain focus on information that is important or relevant to the " +
                        "task at hand. Designers must guide users’ attention, prevent them from " +
                        "being overwhelmed or distracted, and help them find relevant " +
                        "information " +
                        "or action.",
                    "Banner Blindness is an example phenomenon of selection attention " +
                        "where visitors to a website consciously or unconsciously ignore " +
                        "banner-like information. Users have learned to ignore content that " +
                        "resembles ads, is close to ads, or appears in locations traditionally " +
                        "dedicated to ads. Avoid confusion by not styling content to look like " +
                        "ads or placing content and ads in the same visual section.",
                    "Change blindness is another example phenomenon of selection attention " +
                        "that occurs when significant changes in an interface go unnoticed " +
                        "because due to the limitations of human attention and the lack of " +
                        "strong cues. Avoid this by analyzing your design for any competing " +
                        "changes that may happen at the same time and that may divert " +
                        "attention from each other."
                ),
                localUXLawOrigins = "Selective Attention Theory originated in the mid-20th " +
                    "century as researchers sought to understand how humans process " +
                    "information from their environment. The theory developed through " +
                    "several key contributions:\n" +
                    "\n" +
                    "1. Donald Broadbent’s Filter Theory (1958): Broadbent proposed the " +
                    "first comprehensive model of selective attention, known as the Filter " +
                    "Theory. He suggested that there is an attentional “bottleneck” that " +
                    "allows only limited information to be processed at a time. " +
                    "According to this model, information is initially filtered based on " +
                    "physical characteristics before semantic processing occurs.\n" +
                    "\n" +
                    "2. Cherry’s Cocktail Party Effect (1953): E. Colin Cherry conducted " +
                    "seminal work on the “cocktail party phenomenon,” using dichotic listening " +
                    "tasks to study how people selectively attend to one auditory stream while " +
                    "ignoring others.\n" +
                    "\n" +
                    "3. Anne Treisman’s Attenuation Model (1960): Treisman refined Broadbent’s " +
                    "theory, proposing that unattended information is not completely blocked " +
                    "but rather attenuated. This allowed for the explanation of how some " +
                    "unattended information could still be processed.\n" +
                    "\n" +
                    "4. Deutsch and Deutsch’s Late Selection Theory (1963): This theory " +
                    "proposed that all sensory information is fully processed for meaning " +
                    "before selection occurs, contrasting with Broadbent’s early selection " +
                    "model.\n" +
                    "\n" +
                    "The development of these theories was driven by both practical concerns" +
                    " and theoretical interests. For instance, Mackworth’s research on " +
                    "vigilance in 1950 was motivated by concerns about radar operators’ " +
                    "performance during World War II. Throughout the 1950s to 1970s, " +
                    "research on attention shifted from primarily auditory tasks to " +
                    "visual tasks. This period also saw the emergence of capacity theories, " +
                    "such as Kahneman’s (1973) model, which viewed attention as a limited " +
                    "resource that could be divided among different tasks. These early " +
                    "theories and experiments laid the foundation for our current " +
                    "understanding of selective attention and continue to influence " +
                    "research in cognitive psychology and neuroscience today.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Change Blindness in UX: Definition",
                        second = "Raluca Budiu | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/change-blindness-definition/"
                    ),Triple(
                        first = "Banner Blindness Revisited: Users Dodge Ads on Mobile and Desktop",
                        second = "Kara Pernice | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/banner-blindness-old-and-new-" +
                            "findings/"
                    ),Triple(
                        first = "How We Use Selective Attention to Filter Information and Focus",
                        second = "Kendra Cherry, MSEd | VerywellMind",
                        third = "https://www.verywellmind.com/what-is-selective-attention-2795022"
                    ),Triple(
                        first = "Tunnel Vision and Selective Attention",
                        second = "Jakob Nielsen | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/tunnel-vision-and-selective-attention/"
                    ),
                ),
                localUXLawSource = "https://www.simplypsychology.org/attention-models.html" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "selective-attention-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/lfidar194goczlstqyy20/" +
                    "AK5TfDy-TBw--a9vUc4Kg34?rlkey=rbh7n1ikivlg7numecgt4eu4m&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.serial_position_effect,
                localUxLawTitle = "Serial Position Effect",
                localUxLawDescription =
                    "Users have a propensity to best remember the first and last items in a " +
                        "series.",
                localUXLawTakeaways = listOf(
                    "Placing the least important items in the middle of lists can be helpful " +
                        "because these items tend to be stored less frequently in long-term " +
                        "and working memory.",
                    "Positioning key actions on the far left and right within elements such " +
                        "as navigation can increase memorization."
                ),
                localUXLawOrigins = "The serial position effect, a term coined by Herman " +
                    "Ebbinghaus, " +
                    "describes how the position of an item in a sequence affects recall accuracy. " +
                    "The two concepts involved, the primacy effect and the recency effect, " +
                    "explains how items presented at the beginning of a sequence and the " +
                    "end of a sequence are recalled with greater accuracy than items in the " +
                    "middle of a list. Manipulation of the serial position effect to create " +
                    "better user experiences is reflected in many popular designs by " +
                    "successful companies like Apple, Electronic Arts, and Nike.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Serial Position Effect: How to Create Better User Interfaces",
                        second = "Euphemia Wong | Interaction Design Foundation",
                        third = "https://www.interaction-design.org/literature/article/serial-" +
                            "position-effect-how-to-create-better-user-interfaces"
                    ),Triple(
                        first = "The Serial Position Effect: Why ABC and XYZ Stand Out the " +
                            "Most Among All the Alphabets",
                        second = "Abhishek Chakraborty | Medium.com",
                        third = "https://medium.com/coffee-and-junk/design-psychology-serial-" +
                            "position-effect-ca0e4cf299cb"
                    ),Triple(
                        first = "Psychology in Design (Part 1)",
                        second = "Andri Budzinskiy | Medium.com",
                        third = "https://blog.prototypr.io/psychology-in-design-part-1-cdc63229cbe4"
                    ),Triple(
                        first = "Serial Position Effect on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Serial-position_effect"
                    ),
                ),
                localUXLawSource = "https://www.interaction-design.org/literature/topics/" +
                    "serial-position-effect" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "serial-position-effect-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/t4q36yusyhnchoh/" +
                    "AADrpJV--n8_DLtaien1RNRRa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.teslers_law,
                localUxLawTitle = "Tesler’s Law",
                localUxLawDescription =
                    "Tesler's Law, also known as The Law of " +
                        "Conservation of Complexity, states that " +
                        "for any system there is a certain amount of " +
                        "complexity which cannot be reduced.",
                localUXLawTakeaways = listOf(
                    "All processes have a core of complexity that cannot be designed away and " +
                        "therefore must be assumed by either the system or the user.",
                    "Ensure as much as possible of the burden is lifted from users by dealing " +
                        "with " +
                        "inherent complexity during design and development.",
                    "Remember to not build products and services for an idealized, rational " +
                        "user, " +
                        "because people don’t always behave rationally in real life.",
                    "Make guidance accessible and fit within the context of use so that it can " +
                        "help these active new users, no matter what path they choose to take " +
                        "(e.g., tooltips with helpful information).\n"
                ),
                localUXLawOrigins = "While working for Xerox PARC in the mid-1980s, Larry Tesler " +
                    "realized that the way users interact with applications was just as important " +
                    "as the application itself. The book Designing for Interaction by Dan Saffer, " +
                    "includes an interview with Larry Tesler that describes the law of " +
                    "conservation of complexity. The interview is popular among user " +
                    "experience and interaction designers. Larry Tesler argues that, in " +
                    "most cases, an engineer should spend an extra week reducing the " +
                    "complexity of an application versus making millions of users spend " +
                    "an extra minute using the program because of the extra complexity. " +
                    "However, Bruce Tognazzini proposes that people resist reductions to " +
                    "the amount of complexity in their lives. Thus, when an application is " +
                    "simplified, users begin attempting more complex tasks.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Tesler’s Law [article]",
                        second = "Jon Yablonski | Laws of UX",
                        third = "https://lawsofux.com/articles/2024/teslers-law/"
                    ),Triple(
                        first = "Why Life Can’t Be Simpler",
                        second = "Farnam Street",
                        third = "https://fs.blog/2020/10/why-life-cant-be-simpler/"
                    ),Triple(
                        first = "8 Design Guidelines for Complex Applications",
                        second = "Kate Kaplan | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/complex-application-design/"
                    ),Triple(
                        first = "Explaining the Law of Conservation of Complexity",
                        second = "Michael Calleia | Humanist.co",
                        third = "http://humanist.co/blog/law-of-conservation-of-complexity/"
                    ),Triple(
                        first = "Controls are Choices",
                        second = "Dan Saffer | Medium.com",
                        third = "https://medium.com/@odannyboy/controls-are-choices-7de90363d0dd"
                    ),Triple(
                        first = "Simplicity is Overrated",
                        second = "Gabriel Colombo | Marvel",
                        third = "https://blog.marvelapp.com/simplicity-is-overrated/"
                    ),Triple(
                        first = "Nobody Wants To Use Your Product",
                        second = "Goran Peuc | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2016/01/nobody-wants-use-your-" +
                            "product/"
                    ),Triple(
                        first = "Law of Conservation of Complexity on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Law_of_conservation_of_complexity"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/" +
                    "Law_of_conservation_of_complexity" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "teslers-law-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/fxi59kq4uhq99v5/" +
                    "AADH5dK7OS38A2yIzmbvXxuSa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.von_restorff_effect,
                localUxLawTitle = "Von Restorff Effect",
                localUxLawDescription =
                    "The Von Restorff effect, also known as The " +
                        "Isolation Effect, predicts that when multiple " +
                        "similar objects are present, the one that differs " +
                        "from the rest is most likely to be remembered.",
                localUXLawTakeaways = listOf(
                    "Make important information or key actions visually distinctive.",
                    "Use restraint when placing emphasis on visual elements to avoid them " +
                        "competing " +
                        "with one another and to ensure salient items don’t get " +
                        "mistakenly identified as ads.",
                    "Don’t exclude those with a color vision deficiency or low vision by " +
                        "relying exclusively on color to communicate contrast.",
                    "Carefully consider users with motion sensitivity when using motion to " +
                        "communicate contrast."
                ),
                localUXLawOrigins = "The theory was coined by German psychiatrist and " +
                    "pediatrician Hedwig von Restorff (1906–1962), who, in her 1933 study, " +
                    "found that when participants were presented with a list of categorically " +
                    "similar items with one distinctive, isolated item on the list, memory for " +
                    "the item was improved.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Psychology in Design (Part 1)",
                        second = "Andri Budzinskiy | Medium.com",
                        third = "https://blog.prototypr.io/psychology-in-design-part-1-cdc63229cbe4"
                    ),Triple(
                        first = "The Psychology Principles Every UI/UX Designer Needs to Know",
                        second = "Thanasis Rigopoulos | Marvel",
                        third = "https://blog.marvelapp.com/psychology-principles-every-uiux-" +
                            "designer-needs-know/"
                    ),Triple(
                        first = "Von Restorff Effect on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Von_Restorff_effect"
                    ),Triple(
                        first = "Superior pattern processing is the essence of the evolved " +
                            "human brain",
                        second = "Mark P. Mattson",
                        third = "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC4141622/"
                    ),Triple(
                        first = "Working Memory and Attention – A Conceptual Analysis and Review",
                        second = "Klaus Oberauer",
                        third = "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6688548/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Von_Restorff_effect" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "von-restorff-effect-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/7l83jqkpd02s4o4/" +
                    "AABH9ZNHqOtLzqbz4hgxvq0Xa?dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.working_memory,
                localUxLawTitle = "Working Memory",
                localUxLawDescription =
                    "A cognitive system that temporarily holds and manipulates " +
                        "information needed to complete tasks.",
                localUXLawTakeaways = listOf(
                    "Working memory is limited to 4-7 chunks of information at any given moment " +
                        "with each chunk fades after 20-30 seconds. We use it to keep track of " +
                        "information in order to achieve tasks but we often have trouble " +
                        "remembering what information we’ve already seen. Designers must be " +
                        "mindful of this limit when displaying information to users and ensure " +
                        "it’s both necessary and relevant.",
                    "Our brains are good at recognizing something we’ve seen before but not " +
                        "at keeping new information ready to be used. We can support " +
                        "recognition over recall by making it clear what information has " +
                        "already been viewed (e.g. visually differentiating visited links " +
                        "and providing breadcrumbs links).",
                    "Place burden of memory on the system, not the user. We can lessen the " +
                        "burden of memorizing critical information by carrying it over from " +
                        "screen to screen when necessary (e.g. comparison tables that make " +
                        "comparing multiple items easy)."
                ),
                localUXLawOrigins = "The term “working memory” was coined by George A. Miller, " +
                    "Eugene Galanter, and Karl H. Pribram, and was used in the 1960s in the " +
                    "context of theories that likened the mind to a computer. In 1968, " +
                    "Richard C. Atkinson and Richard M. Shiffrin used the term to describe " +
                    "their “short-term store”. The term short-term store was the name " +
                    "previously used for working memory. Other suggested names were short-term " +
                    "memory, primary memory, immediate memory, operant memory, and provisional " +
                    "memory. Short-term memory is the ability to remember information over a " +
                    "brief period (in the order of seconds). Most theorists today use the " +
                    "concept of working memory to replace or include the older concept of " +
                    "short-term memory, marking a stronger emphasis on the notion of " +
                    "manipulating information rather than mere maintenance.\n" +
                    "\n" +
                    "The earliest mention of experiments on the neural basis of working memory " +
                    "can be traced back to more than 100 years ago, when Eduard Hitzig and " +
                    "Sir David Ferrier described ablation experiments of the prefrontal " +
                    "cortex (PFC); they concluded that the frontal cortex was important " +
                    "for cognitive rather than sensory processes. In 1935 and 1936, " +
                    "Carlyle Jacobsen and colleagues were the first to show the deleterious " +
                    "effect of prefrontal ablation on delayed response.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "Working Memory and External Memory",
                        second = "Raluca Budiu | Nielsen Norman Group",
                        third = "https://www.nngroup.com/articles/working-memory-external-memory/"
                    ),Triple(
                        first = "Working Memory and External Memory [Video]",
                        second = "Raluca Budiu | Nielsen Norman Group",
                        third = "https://www.youtube.com/watch?v=qV5gSyfi4p8"
                    ),Triple(
                        first = "Reducing Cognitive Overload For A Better User Experience",
                        second = "Danny Halarewich | Smashing Magazine",
                        third = "https://www.smashingmagazine.com/2016/09/reducing-cognitive-" +
                            "overload-for-a-better-user-experience/"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Working_memory" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "working-memory-poster" ,
                localUXLawFreePoster = "https://www.dropbox.com/scl/fo/zmqqlalvn46x08103sjwm/" +
                    "ACkrdAm_RvEOSdMmeXsj9EY?rlkey=iy2r0l7un9qbahvfg71gyyfk9&st=jupqcqt1&dl=0"
            ),
            LocalUXLaw(
                localUxLawThumbnail = R.drawable.zeigarnik_effect,
                localUxLawTitle = "Zeigarnik Effect",
                localUxLawDescription =
                    "People remember uncompleted or interrupted tasks better than completed " +
                        "tasks.",
                localUXLawTakeaways = listOf(
                    "Invite content discovery by providing clear signifiers of additional content.",
                    "Providing artificial progress towards a goal will help to ensure users are " +
                        "more likely to have the motivation to complete that task.",
                    "Provide a clear indication of progress in order to motivate users to " +
                        "complete tasks."
                ),
                localUXLawOrigins = "Bluma Wulfovna Zeigarnik (1900 – 1988) was a Soviet " +
                    "psychologist and psychiatrist, a member of the Berlin School of " +
                    "experimental psychology and Vygotsky Circle. She discovered the " +
                    "Zeigarnik effect and contributed to the establishment of experimental " +
                    "psychopathology as a separate discipline in the Soviet Union in the " +
                    "post-World War II period. In the 1920s she conducted a study on memory, " +
                    "in which she compared memory in relation to incomplete and complete tasks. " +
                    "She had found that incomplete tasks are easier to remember than successful " +
                    "ones. This is now known as the Zeigarnik effect. She later began working " +
                    "at the Institute of Higher Nervous Activity which is where she would " +
                    "meet her next big influence Vygowsky, and become a part of his circle " +
                    "of scientists. It was also there that Zeigarnik founded the Department " +
                    "of Psychology. During that time, Zeigarnik received the Lewin Memorial " +
                    "Award in 1983 for her psychological research.",
                localUXLawFurtherReading = listOf(
                    Triple(
                        first = "How to Use the Zeigarnik Effect in UX",
                        second = "Feifei Liu | Nielsen Norman Group",
                        third = "https://www.nngroup.com/videos/zeigarnik-effect/"
                    ),Triple(
                        first = "Endowed progress effect: Give your users a head start",
                        second = "Canvs Editorial | UX Collective",
                        third = "https://uxdesign.cc/endowed-progress-effect-give-your-users-a-" +
                            "head-start-97d52d8b0396"
                    ),Triple(
                        first = "Moving the Finish Line: The Goal Gradient Hypothesis",
                        second = "Farnam Street",
                        third = "https://fs.blog/2016/10/goal-gradient-hypothesis/"
                    ),Triple(
                        first = "The Zeigarnik Effect: Why it is so hard to leave things " +
                            "incomplete",
                        second = "Abhishek Chakraborty | Medium.com",
                        third = "https://medium.com/coffee-and-junk/design-psychology-zeigarnik-" +
                            "effect-a53688b7f6d1"
                    ),Triple(
                        first = "Zeigarnik Effect",
                        second = "Coglode",
                        third = "http://coglode.com/gem/zeigarnik-effect"
                    ),Triple(
                        first = "Zeigarnik Effect on Wikipedia",
                        second = "Wikipedia",
                        third = "https://en.wikipedia.org/wiki/Bluma_Zeigarnik"
                    ),
                ),
                localUXLawSource = "https://en.wikipedia.org/wiki/Bluma_Zeigarnik" ,
                localUXLawLargeFormatPoster = "https://jonyablonski.bigcartel.com/product/" +
                    "zeigarnik-effect" ,
                localUXLawFreePoster = "https://www.dropbox.com/sh/8sglj3nc2559agp/" +
                    "AADZzy1ylcYXlYCS1a4dTGbpa?dl=0"
            ),
        )

    override suspend fun getAllLocalUXLaws(): Flow<List<LocalUXLaw>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = listOfLocalUXLaws)
        }
    }
}