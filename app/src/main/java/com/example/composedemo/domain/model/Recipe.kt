package com.example.composedemo.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe (
    val pk: Int?  = null,
    val title: String?  = null,
    val publisher: String?  = null,
    val featuredImage: String?  = null,
    val sourceUrl: String?  = null,
    val rating: Int?  = 0,
    val description: String?  = null,
    val cookingInstructions: String?  = null,
    val ingredients: List<String>  = listOf(),
    val dataAdded: String?  = null,
    val dataUpdated: String?  = null,
        ): Parcelable