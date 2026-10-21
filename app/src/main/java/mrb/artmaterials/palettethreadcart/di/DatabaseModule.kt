package mrb.artmaterials.palettethreadcart.di

import androidx.room.Room
import mrb.artmaterials.palettethreadcart.data.database.YWZUFAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "ywzuf_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = YWZUFAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<YWZUFAppDatabase>().cartItemDao() }

    single { get<YWZUFAppDatabase>().orderDao() }
}