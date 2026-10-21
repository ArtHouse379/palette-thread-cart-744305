package mrb.artmaterials.palettethreadcart.data.model

import androidx.annotation.StringRes
import mrb.artmaterials.palettethreadcart.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    PAINTING(R.string.product_category_painting_title),
    DRAWING(R.string.product_category_drawing_title),
    YARN(R.string.product_category_yarn_title),
    SEWING(R.string.product_category_sewing_title),
    CRAFTING(R.string.product_category_crafting_title),
}
