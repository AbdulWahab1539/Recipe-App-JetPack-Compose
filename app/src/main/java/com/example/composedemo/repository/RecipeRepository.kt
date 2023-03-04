package com.example.composedemo.repository

import com.example.composedemo.domain.model.Recipe

interface RecipeRepository {
    suspend fun search(
        token: String,
        page: Int,
        query: String
    ): List<Recipe>

    suspend fun get(token: String, id: Int): Recipe
}