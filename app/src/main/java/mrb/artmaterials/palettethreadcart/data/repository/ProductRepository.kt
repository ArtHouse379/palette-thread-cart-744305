package mrb.artmaterials.palettethreadcart.data.repository

import mrb.artmaterials.palettethreadcart.data.model.Product
import mrb.artmaterials.palettethreadcart.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Watercolor Paint Set",
            description = "A compact set of vivid watercolor pans for studies, cards, and finished paintings. The pigments blend smoothly and reactivate easily with water. Its portable case keeps every color ready for studio sessions or outdoor sketching.",
            category = ProductCategory.PAINTING,
            price = 18.99,
            imageUrl = "https://images.pexels.com/photos/6167807/pexels-photo-6167807.jpeg",
        ),
        Product(
            id = 2,
            title = "Watercolor Paint Box",
            description = "This reusable paint box holds a versatile spectrum for everyday watercolor work. A sturdy case protects the pans and provides space for mixing washes. It suits beginners building a first palette and experienced painters who want a convenient travel set.",
            category = ProductCategory.PAINTING,
            price = 29.50,
            imageUrl = "https://images.pexels.com/photos/7130240/pexels-photo-7130240.jpeg",
        ),
        Product(
            id = 3,
            title = "Colored Pencil Set",
            description = "A balanced range of colored pencils brings rich, layered color to drawings and illustrations. The sharpenable wooden barrels offer comfortable control for fine lines and broad shading. The cores blend well on sketchbook and drawing paper.",
            category = ProductCategory.DRAWING,
            price = 16.95,
            imageUrl = "https://images.pexels.com/photos/4582760/pexels-photo-4582760.jpeg",
        ),
        Product(
            id = 4,
            title = "Hardcover Sketchbook",
            description = "This hardcover sketchbook provides a dependable surface for pencil, charcoal, and light ink. Its sturdy cover protects work between studio visits and daily journeys. The plain pages leave plenty of room for quick ideas, studies, and finished sketches.",
            category = ProductCategory.DRAWING,
            price = 12.50,
            imageUrl = "https://images.pexels.com/photos/6192327/pexels-photo-6192327.jpeg",
        ),
        Product(
            id = 5,
            title = "Acrylic Yarn Skein",
            description = "A soft acrylic yarn skein offers reliable color and easy care for everyday projects. The smooth strand works neatly across knitting and crochet stitches. Use it for scarves, soft toys, accessories, and decorative home crafts.",
            category = ProductCategory.YARN,
            price = 4.75,
            imageUrl = "https://images.pexels.com/photos/2062069/pexels-photo-2062069.jpeg",
        ),
        Product(
            id = 6,
            title = "Knitting Needle Set",
            description = "This knitting needle set covers useful sizes for garments, accessories, and practice swatches. Smooth tips guide yarn without snagging while balanced shafts support even stitches. It is a practical foundation for a new knitting kit or a useful studio backup.",
            category = ProductCategory.YARN,
            price = 9.99,
            imageUrl = "https://images.pexels.com/photos/5660291/pexels-photo-5660291.jpeg",
        ),
        Product(
            id = 7,
            title = "Wooden Embroidery Hoop",
            description = "A wooden embroidery hoop holds fabric taut for clean, controlled stitching. The adjustable fastening makes it easy to secure different fabric weights. Its smooth round frame also works well for displaying completed needlework.",
            category = ProductCategory.SEWING,
            price = 6.50,
            imageUrl = "https://images.pexels.com/photos/14422198/pexels-photo-14422198.jpeg",
        ),
        Product(
            id = 8,
            title = "Sewing Thread Set",
            description = "This sewing thread set includes versatile colors for repairs, garment making, and textile crafts. Each spool supplies a consistent strand for hand stitching or a domestic sewing machine. The varied palette makes matching fabric and decorative details straightforward.",
            category = ProductCategory.SEWING,
            price = 14.99,
            imageUrl = "https://images.pexels.com/photos/7116999/pexels-photo-7116999.jpeg",
        ),
        Product(
            id = 9,
            title = "Self-Healing Cutting Mat",
            description = "A self-healing cutting mat protects tables during paper, fabric, and model-making projects. Its resilient surface closes over light blade marks to stay smooth through repeated use. Printed guides help align materials for accurate measuring and trimming.",
            category = ProductCategory.CRAFTING,
            price = 19.95,
            imageUrl = "https://images.pexels.com/photos/5962630/pexels-photo-5962630.jpeg",
        ),
        Product(
            id = 10,
            title = "Jewelry Bead Mix",
            description = "A colorful jewelry bead mix adds texture and variety to bracelets, necklaces, and decorative crafts. Assorted shapes make it easy to build playful patterns or unique focal details. Pair the beads with elastic, cord, or wire for custom handmade pieces.",
            category = ProductCategory.CRAFTING,
            price = 8.99,
            imageUrl = "https://images.pexels.com/photos/7930581/pexels-photo-7930581.jpeg",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
