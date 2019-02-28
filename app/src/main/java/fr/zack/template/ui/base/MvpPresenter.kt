package fr.zack.template.ui.base

interface MvpPresenter<V : MvpView?> {

    fun onAttach(mvpView: V?)

    fun onDetach()

}