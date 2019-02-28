package fr.zack.template.di.component

import android.app.Application
import android.content.Context
import dagger.Component
import fr.zack.template.MyApplication
import fr.zack.template.di.ApplicationContext
import fr.zack.template.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun context(): Context

    fun getApplication(): Application
}