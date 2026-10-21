package mrb.artmaterials.palettethreadcart.di

import mrb.artmaterials.palettethreadcart.ui.viewmodel.AppViewModel
import mrb.artmaterials.palettethreadcart.ui.viewmodel.CartViewModel
import mrb.artmaterials.palettethreadcart.ui.viewmodel.CheckoutViewModel
import mrb.artmaterials.palettethreadcart.ui.viewmodel.OnboardingViewModel
import mrb.artmaterials.palettethreadcart.ui.viewmodel.OrderViewModel
import mrb.artmaterials.palettethreadcart.ui.viewmodel.ProductDetailsViewModel
import mrb.artmaterials.palettethreadcart.ui.viewmodel.ProductViewModel
import mrb.artmaterials.palettethreadcart.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}