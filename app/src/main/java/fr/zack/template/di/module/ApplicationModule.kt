package fr.zack.template.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import fr.zack.template.di.ApplicationContext

@Module
class ApplicationModule(val application: Application) {

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return application
    }

    @Provides
    internal fun provideApplication(): Application {
        return application
    }

}