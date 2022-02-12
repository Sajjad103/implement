package com.example.android.modern.androidcomlpetearchitecture.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [EntityModel::class],version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    abstract fun appDatabase() : DAOAccess
    companion object{
        @Volatile
        var INSTANCE:AppDatabase? = null
        fun getDatabaseClient(context: Context): AppDatabase{
            if (INSTANCE != null) return INSTANCE as AppDatabase

            synchronized(this){
                INSTANCE = Room
                    .databaseBuilder(context,AppDatabase::class.java, "AppDatabase")
                    .fallbackToDestructiveMigration()
                    .build()

                return INSTANCE as AppDatabase
            }
        }
    }
}