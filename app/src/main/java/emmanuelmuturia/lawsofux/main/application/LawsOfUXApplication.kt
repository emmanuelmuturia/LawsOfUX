package emmanuelmuturia.lawsofux.main.application

import android.app.Application
import emmanuelmuturia.lawsofux.BuildConfig
import emmanuelmuturia.lawsofux.articles.ui.dependencyInjection.articlesUIKoinModule
import emmanuelmuturia.lawsofux.cards.ui.dependencyInjection.cardsUIKoinModule
import emmanuelmuturia.lawsofux.commons.dependencyInjection.commonsKoinModule
import emmanuelmuturia.lawsofux.home.ui.dependencyInjection.homeUIKoinModule
import emmanuelmuturia.lawsofux.info.ui.dependencyInjection.projectInfoUIKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class LawsOfUXApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(tree = Timber.DebugTree())
        startKoin {
            androidContext(androidContext = this@LawsOfUXApplication)
            modules(
                modules =
                    listOf(
                        homeUIKoinModule,
                        commonsKoinModule,
                        articlesUIKoinModule,
                        cardsUIKoinModule,
                        projectInfoUIKoinModule,
                    ),
            )
        }
    }
}