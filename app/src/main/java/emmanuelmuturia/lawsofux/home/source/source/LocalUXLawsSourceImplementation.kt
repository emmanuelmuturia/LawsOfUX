package emmanuelmuturia.lawsofux.home.source.source

import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.home.source.model.LocalUXLaw
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class LocalUXLawsSourceImplementation(
    private val ioDispatcher: CoroutineDispatcher
) : LocalUXLawsSource {

    private val listOfLocalUXLaws = listOf(
        LocalUXLaw(
            localUxLawThumbnail = R.drawable.aesthetic_usability_effect,
            localUxLawTitle = "Aesthetic-Usability Effect",
            localUxLawDescription =
                "Users often perceive aesthetically pleasing design as design that’s more usable."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.choice_overload,
            localUxLawTitle = "Choice Overload",
            localUxLawDescription =
                "The tendency for people to get overwhelmed when they are presented with a large number of options, often used interchangeably with the term paradox of choice."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.chunking,
            localUxLawTitle = "Chunking",
            localUxLawDescription =
                "A process by which individual pieces of an information set are broken down and then grouped together in a meaningful whole."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.cognitive_bias,
            localUxLawTitle = "Cognitive Bias",
            localUxLawDescription = "A systematic error of thinking or rationality in judgment that influence our perception of the world and our decision-making ability."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.cognitive_load,
            localUxLawTitle = "Cognitive Load",
            localUxLawDescription =
                "The amount of mental resources needed to understand and interact with an interface."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.doherty_threshold,
            localUxLawTitle = "Doherty Threshold",
            localUxLawDescription =
                "Productivity soars when a computer and its users interact at a pace (<400ms) that ensures that neither has to wait on the other."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.fitts_law,
            localUxLawTitle = "Fitt's Law",
            localUxLawDescription =
                "The time to acquire a target is a function of the distance to and size of the target."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.flow,
            localUxLawTitle = "Flow",
            localUxLawDescription =
                "The mental state in which a person performing some activity is fully immersed in a feeling of energized focus, full involvement, and enjoyment in the process of the activity."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.goal_gradient_effect,
            localUxLawTitle = "Goal-Gradient Effect",
            localUxLawDescription =
                "The tendency to approach a goal increases with proximity to the goal."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.hicks_law,
            localUxLawTitle = "Hick's Law",
            localUxLawDescription =
                "The time it takes to make a decision increases with the number and complexity of choices."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.jakobs_law,
            localUxLawTitle = "Jakob's Law",
            localUxLawDescription =
                "Users spend most of their time on other sites. This means that users prefer your site to work the same way as all the other sites they already know."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.law_of_common_region,
            localUxLawTitle = "Law of Common Region",
            localUxLawDescription =
                "Elements tend to be perceived into groups if they are sharing an area with a clearly defined boundary."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.law_of_proximity,
            localUxLawTitle = "Law of Proximity",
            localUxLawDescription =
                "Objects that are near, or proximate to each other, tend to be grouped together."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.law_of_pragnanz,
            localUxLawTitle = "Law of Prägnanz",
            localUxLawDescription =
                "People will perceive and interpret ambiguous or complex images as the simplest form possible, because it is the interpretation that requires the least cognitive effort of us."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.law_of_similarity,
            localUxLawTitle = "Law of Similarity",
            localUxLawDescription =
                "The human eye tends to perceive similar elements as a complete picture, shape, or group, even if those elements are separated."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.law_of_uniform_connectedness,
            localUxLawTitle = "Law of Uniform Connectedness",
            localUxLawDescription =
                "Elements that are visually connected are perceived as more related than elements with no connection."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.mental_model,
            localUxLawTitle = "Mental Model",
            localUxLawDescription =
                "A compressed model based on what we think we know about a system and how it works."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.millers_law,
            localUxLawTitle = "Miller’s Law",
            localUxLawDescription =
                "The average person can only keep 7 (plus or minus 2) items in their working memory."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.occams_razor,
            localUxLawTitle = "Occam’s Razor",
            localUxLawDescription =
                "Among competing hypotheses that predict equally well, the one with the fewest assumptions should be selected."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.paradox_of_the_active_user,
            localUxLawTitle = "Paradox of the Active User",
            localUxLawDescription =
                "Users never read manuals but start using the software immediately."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.pareto_principle,
            localUxLawTitle = "Pareto Principle",
            localUxLawDescription =
                "The Pareto principle states that, for many events, roughly 80% of the effects come from 20% of the causes."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.parkinsons_law,
            localUxLawTitle = "Parkinson's Law",
            localUxLawDescription =
                "Any task will inflate until all of the available time is spent."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.peak_end_rule,
            localUxLawTitle = "Peak-End Rule",
            localUxLawDescription =
                "People judge an experience largely based on how they felt at its peak and at its end, rather than the total sum or average of every moment of the experience."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.postels_law,
            localUxLawTitle = "Postel's Law",
            localUxLawDescription =
                "Be liberal in what you accept, and conservative in what you send."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.selective_attention,
            localUxLawTitle = "Selective Attention",
            localUxLawDescription =
                "The process of focusing our attention only to a subset of stimuli in an environment — usually those related to our goals."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.serial_position_effect,
            localUxLawTitle = "Serial Position Effect",
            localUxLawDescription =
                "Users have a propensity to best remember the first and last items in a series."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.teslers_law,
            localUxLawTitle = "Tesler’s Law",
            localUxLawDescription =
                "Tesler's Law, also known as The Law of Conservation of Complexity, states that for any system there is a certain amount of complexity which cannot be reduced."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.von_restorff_effect,
            localUxLawTitle = "Von Restorff Effect",
            localUxLawDescription =
                "The Von Restorff effect, also known as The Isolation Effect, predicts that when multiple similar objects are present, the one that differs from the rest is most likely to be remembered."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.working_memory,
            localUxLawTitle = "Working Memory",
            localUxLawDescription =
                "A cognitive system that temporarily holds and manipulates information needed to complete tasks."
        ),LocalUXLaw(
            localUxLawThumbnail = R.drawable.zeigarnik_effect,
            localUxLawTitle = "Zeigarnik Effect",
            localUxLawDescription =
                "People remember uncompleted or interrupted tasks better than completed tasks."
        ),
    )

    override suspend fun getAllLocalUXLaws(): Flow<List<LocalUXLaw>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = listOfLocalUXLaws)
        }
    }
}