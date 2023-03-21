package com.example.pil_hello_world_mvp

class WriterPresenter(view: WriterView): WriterContract.Presenter {

    private val view: WriterView = view
    init {
        view.onButtonClicked({onButtonPressed()})
    }

    override fun onButtonPressed(){
        if(view.getBinding().editText.text.toString() == ""){
            view.showToast("There is an error. Write something")
        }
        else{
            view.showToast(view.getBinding().editText.text.toString())
        }
    }
}