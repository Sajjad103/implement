package com.example.android.modern.androidcomlpetearchitecture.room

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Login")
data class EntityModel(
        @ColumnInfo(name = "username")
        var Username:String,

        @ColumnInfo(name = "password")
        var Password:String
    ): Parcelable {

        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        var id: Int = 0
    }
