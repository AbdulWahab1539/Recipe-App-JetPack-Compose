package com.example.composedemo.di

import com.example.composedemo.network.RecipeService
import com.example.composedemo.network.model.RecipeDtoMapper
import com.example.composedemo.repository.RecipeRepository
import com.example.composedemo.repository.RecipeRepositoryImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponentManager::class)
object RepositoryModule {


    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper,
    ): RecipeRepository{
        return RecipeRepositoryImplementation(recipeService, recipeDtoMapper)
    }
}