package mrb.artmaterials.palettethreadcart.di

import mrb.artmaterials.palettethreadcart.data.datastore.OnboardingDataStoreManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { OnboardingDataStoreManager(androidContext()) }
}