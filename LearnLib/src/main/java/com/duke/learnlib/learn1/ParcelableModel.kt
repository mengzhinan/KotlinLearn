package com.duke.learnlib.learn1

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * author: duke
 * version: 1.0
 * dateTime: 2019-11-22 10:09
 * description:
 *
 */
@Parcelize
@SuppressLint("ParcelCreator")
data class ParcelableModel(
    val firstName: String = "",
    val lastName: String = "",
    val age: Int = 0
) : Parcelable
