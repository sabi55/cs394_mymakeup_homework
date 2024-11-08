package com.example.mymakeup.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Permit(
    val name: String = "",
    val brand: String = "",
    val shade: String = "",
    val price: Double = 0.0,
    val description: String = "",
    val imageResId: Int = 0 // New property for image resource ID
) : Parcelable
