package emmanuelmuturia.lawsofux.commons.dependencyInjection

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val commonsKoinModule = module {
    single<CoroutineDispatcher> {
        Dispatchers.IO
    }
}