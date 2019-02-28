package fr.zack.template.ui.base

class BasePresenter<V : MvpView?> : MvpPresenter<V> {

    private var mvpView: V? = null

    override fun onAttach(mvpView: V?) {
        this.mvpView = mvpView
    }

    override fun onDetach() {
        mvpView = null
    }

    fun isViewAttached(): Boolean = mvpView != null

    fun getMvpView(): V? = mvpView
}