package pl.marczak.mvvmkotlintest

import android.databinding.ObservableField

class MainViewModel {

    val firstItem = ObservableField<LandingItemViewModel>(LandingItemViewModel(this, LandingItem(R.drawable.account_circle, "AUDIT PLAN")))
    val secondItem = ObservableField<LandingItemViewModel>(LandingItemViewModel(this, LandingItem(R.drawable.account_circle, "SPECIAL AUDITS")))

    fun onLandingItemClick(item: LandingItem) {
    }
}