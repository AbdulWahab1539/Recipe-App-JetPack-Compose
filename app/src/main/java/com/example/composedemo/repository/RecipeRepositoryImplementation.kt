package com.example.composedemo.repository

import com.example.composedemo.domain.model.Recipe
import com.example.composedemo.network.RecipeService
import com.example.composedemo.network.model.RecipeDtoMapper
import javax.inject.Inject
import javax.inject.Singleton

//@Singleton
class RecipeRepositoryImplementation
//    @Inject constructor
    (
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper,
) : RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}