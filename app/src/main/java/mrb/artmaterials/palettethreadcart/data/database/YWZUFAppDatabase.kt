package mrb.artmaterials.palettethreadcart.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import mrb.artmaterials.palettethreadcart.data.database.dao.CartItemDao
import mrb.artmaterials.palettethreadcart.data.database.dao.OrderDao
import mrb.artmaterials.palettethreadcart.data.database.converter.Converters
import mrb.artmaterials.palettethreadcart.data.entity.CartItemEntity
import mrb.artmaterials.palettethreadcart.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class YWZUFAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}