package com.example.fatimazza.hellokotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item(val name: String?, val desc: String?, val image:Int?) : Parcelable
