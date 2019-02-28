package fr.zack.template.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fr.zack.template.MyApplication
import fr.zack.template.di.component.ActivityComponent
import fr.zack.template.di.component.DaggerActivityComponent
import fr.zack.template.di.module.ActivityModule

abstract class BaseActivity : AppCompatActivity(), MvpView, BaseFragment.Callback {

    private var activityComponent: ActivityComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .applicationComponent((application as MyApplication).getComponent())
                .build()

    }

    fun getActivityComponent(): ActivityComponent? {
        return this.activityComponent
    }

    override fun showLoading() {
        hideLoading()
    }

    override fun hideLoading() {
    }
}