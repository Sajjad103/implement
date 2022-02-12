package com.example.android.modern.androidcomlpetearchitecture.room

import androidx.lifecycle.LiveData
import androidx.room.*
import java.net.IDN

interface DAOAccess {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData()

//    @Query("Select * FROM Login WHERE Username =:username")
//    fun getLoginDetails(username:String) : LiveData<String>
//
//    @Query("Select * FROM Login")
//    fun getLoginDetails(username:String) : LiveData<List<>>

    //    @Query("DELETE * FROM Login WHERE Id =:id")
    //suspend fun removeItem(id: Int)
    @Delete
    suspend fun removeData(id: Int)

    @Update
    suspend fun updateData(id: Int)


}