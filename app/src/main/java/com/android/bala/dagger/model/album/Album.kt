package com.android.bala.dagger.model.album

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Album(var userId : Int, var id : Int, var title : String) : Parcelable{}