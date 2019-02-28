package fr.zack.template

import android.app.Application
import android.content.Context
import fr.zack.template.di.component.ApplicationComponent
import fr.zack.template.di.component.DaggerApplicationComponent
import fr.zack.template.di.module.ApplicationModule

class MyApplication : Application() {

    private lateinit var applicationComponent: ApplicationComponent

    companion object {

        fun get(context: Context): MyApplication {
            return context.applicationContext as MyApplication
        }
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()

        applicationComponent.inject(this)
    }

    fun getComponent(): ApplicationComponent {
        return applicationComponent
    }

    fun setComponent(applicationComponent: ApplicationComponent) {
        this.applicationComponent = applicationComponent
    }

}