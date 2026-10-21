package mrb.artmaterials.palettethreadcart.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Outlined.Star,
        text = "Artist-grade quality",
    ),
    Benefit(
        icon = Icons.Outlined.VerifiedUser,
        text = "30-day guarantee",
    ),
    Benefit(
        icon = Icons.Outlined.CheckCircle,
        text = "Studio essentials",
    ),
)
