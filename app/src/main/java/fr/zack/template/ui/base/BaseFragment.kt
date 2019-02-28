package fr.zack.template.ui.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

abstract class BaseFragment : Fragment(), MvpView {

    private var activity: BaseActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp(view)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity) {
            val activity: BaseActivity? = context
            this.activity = activity
            activity?.onFragmentAttached()
        }
    }

    protected abstract fun setUp(view: View)

    override fun showLoading() {
        hideLoading()
    }

    override fun hideLoading() {
    }

    override fun onDetach() {
        activity = null
        super.onDetach()
    }

    internal interface Callback {

        fun onFragmentAttached()

        fun onFragmentDetached(tag: String)
    }
}