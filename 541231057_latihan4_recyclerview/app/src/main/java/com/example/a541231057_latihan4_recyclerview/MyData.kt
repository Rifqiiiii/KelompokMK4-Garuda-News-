package com.example.a541231057_latihan4_recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyData(
    var name: String,
    var description: String,
    var photo: String
) : Parcelable