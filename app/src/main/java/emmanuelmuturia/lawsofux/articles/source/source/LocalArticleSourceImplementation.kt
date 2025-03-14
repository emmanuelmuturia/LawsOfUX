package emmanuelmuturia.lawsofux.articles.source.source

import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.articles.source.model.LocalArticle
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class LocalArticleSourceImplementation(
    private val ioDispatcher: CoroutineDispatcher,
) : LocalArticleSource {
    private val localArticles =
        listOf(
            LocalArticle(
                localArticleTitle = "Familiar vs Novel",
                localArticleDescription =
                    "A look into when it’s acceptable and perhaps even " +
                        "advantageous to design for novelty.",
                localArticleThumbnail = R.drawable.familiar_vs_novel,
            ),
            LocalArticle(
                localArticleTitle = "Onboarding for Active Users",
                localArticleDescription =
                    "Onboarding should be designed with active users in mind, " +
                        "making guidance accessible throughout the product experience.",
                localArticleThumbnail = R.drawable.onboarding_for_active_users,
            ),
            LocalArticle(
                localArticleTitle = "Tesler's Law",
                localArticleDescription =
                    "For any system there is a certain amount of complexity " +
                        "that cannot be reduced.",
                localArticleThumbnail = R.drawable.teslers_law_article,
            ),
            LocalArticle(
                localArticleTitle = "UX Psychology: Google Search",
                localArticleDescription = "A closer look at the ubiquitous search utility.",
                localArticleThumbnail = R.drawable.ux_psychology_google_search,
            ),
            LocalArticle(
                localArticleTitle = "Peak-End Rule",
                localArticleDescription =
                    "Why designers should pay close attention to the key peak " +
                        "moments during an experience.",
                localArticleThumbnail = R.drawable.peak_end_rule_article,
            ),
            LocalArticle(
                localArticleTitle = "The Psychology of Design",
                localArticleDescription =
                    "A look at how designers can leverage psychology to build " +
                        "more intuitive, human-centered products and experiences.",
                localArticleThumbnail = R.drawable.the_psychology_of_design,
            ),
            LocalArticle(
                localArticleTitle = "Designing with Occam's Razor",
                localArticleDescription =
                    "How a classic problem-solving principle can help " +
                        "improve our designs.",
                localArticleThumbnail = R.drawable.designing_with_occams_razor,
            ),
            LocalArticle(
                localArticleTitle = "Design Principles for Reducing Cognitive Load",
                localArticleDescription =
                    "A look at both the causes and ways to reduce " +
                        "extraneous mental processing for the user.",
                localArticleThumbnail = R.drawable.design_principles_for_reducing_cognitive_load,
            ),
        )

    override suspend fun getAllLocalArticles(): Flow<List<LocalArticle>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localArticles)
        }
    }
}