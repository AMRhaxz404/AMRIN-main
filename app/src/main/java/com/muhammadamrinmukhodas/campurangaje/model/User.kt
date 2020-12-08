package com.muhammadamrinmukhodas.campurangaje.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    val nama : String,
    val email : String,
    val age : String
        ) : Parcelable