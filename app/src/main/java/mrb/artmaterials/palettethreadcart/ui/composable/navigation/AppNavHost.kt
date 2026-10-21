package mrb.artmaterials.palettethreadcart.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import mrb.artmaterials.palettethreadcart.ui.composable.screen.cart.YWZUFCartScreen
import mrb.artmaterials.palettethreadcart.ui.composable.screen.checkout.YWZUFCheckoutScreen
import mrb.artmaterials.palettethreadcart.ui.composable.screen.home.YWZUFHomeScreen
import mrb.artmaterials.palettethreadcart.ui.composable.screen.onboarding.YWZUFOnboardingScreen
import mrb.artmaterials.palettethreadcart.ui.composable.screen.order.YWZUFOrdersScreen
import mrb.artmaterials.palettethreadcart.ui.composable.screen.productdetails.YWZUFProductDetailsScreen
import mrb.artmaterials.palettethreadcart.ui.composable.screen.settings.YWZUFSettingsScreen
import mrb.artmaterials.palettethreadcart.ui.composable.screen.splash.YWZUFSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            YWZUFSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            YWZUFOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            YWZUFHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            YWZUFProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            YWZUFCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            YWZUFCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            YWZUFOrdersScreen()
        }

        composable<NavRoute.Settings> {
            YWZUFSettingsScreen()
        }
    }
}