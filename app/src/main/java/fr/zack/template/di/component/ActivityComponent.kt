package fr.zack.template.di.component

import dagger.Component
import fr.zack.template.di.PerActivity
import fr.zack.template.di.module.ActivityModule
import fr.zack.template.ui.main.MainActivity

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}