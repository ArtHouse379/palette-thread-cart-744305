package mrb.artmaterials.palettethreadcart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mrb.artmaterials.palettethreadcart.ui.composable.approot.AppRoot
import mrb.artmaterials.palettethreadcart.ui.theme.YWZUFAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YWZUFAppTheme {
                AppRoot()
            }
        }
    }
}
