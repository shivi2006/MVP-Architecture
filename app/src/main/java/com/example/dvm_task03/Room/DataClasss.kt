package com.example.dvm_task03.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataClasss(
    @PrimaryKey
    var id: String,
    var date: String
)

