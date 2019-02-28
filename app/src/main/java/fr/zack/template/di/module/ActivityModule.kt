package fr.zack.template.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import fr.zack.template.di.ActivityContext
import fr.zack.template.ui.base.BaseActivity

@Module
class ActivityModule(val baseActivity: BaseActivity) {

    @Provides
    @ActivityContext
    fun provideContext(): Context {
        return baseActivity
    }

    @Provides
    fun provideActivity(): Activity {
        return baseActivity
    }
}