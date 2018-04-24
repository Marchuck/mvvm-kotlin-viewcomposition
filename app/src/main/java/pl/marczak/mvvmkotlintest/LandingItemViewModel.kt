package pl.marczak.mvvmkotlintest

import android.databinding.ObservableField
import android.databinding.ObservableInt

class LandingItemViewModel(val parent: MainViewModel,
                           var item: LandingItem) {

    val drawableRes = ObservableInt(item.imageRes)
    val title = ObservableField(item.name)

    fun onItemClick() {
        parent.onLandingItemClick(item)
    }
}