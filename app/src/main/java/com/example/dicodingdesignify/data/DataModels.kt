package com.example.dicodingdesignify.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataModels(
    val image: Int,
    val title: String,
    val artist: String,
    val year: String,
    val description: String
): Parcelable