package mrb.artmaterials.palettethreadcart

import android.app.Application
import mrb.artmaterials.palettethreadcart.di.dataModule
import mrb.artmaterials.palettethreadcart.di.dispatcherModule
import mrb.artmaterials.palettethreadcart.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class YWZUFApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@YWZUFApplication)
            modules(appModules)
        }
    }
}
