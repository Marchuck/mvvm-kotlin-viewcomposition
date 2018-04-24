package pl.marczak.mvvmkotlintest

import android.databinding.ObservableField

class BookViewModel(_title: String) {

    val title = ObservableField(_title)

}
