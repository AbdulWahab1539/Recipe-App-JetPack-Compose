package com.example.composedemo.presentation.ui.recipe_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composedemo.domain.model.Recipe
import com.example.composedemo.network.model.RecipeDtoMapper
import com.example.composedemo.repository.RecipeRepository
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named


class RecipeListViewModel @Inject constructor(

    private  val repository: RecipeRepository,
    @Named("auth_token") private val token: String,

    ) : ViewModel() {
     val recipes: MutableState<List<Recipe>> get() =  mutableStateOf(listOf())
//    val recipes: MutableLiveData<List<Recipe>> get() = _recipes

        init {
        viewModelScope.launch {
            val result = repository.search(
                token = token,
                page = 1,
                query = "chicken",
            )
            recipes.value = result
        }
    }


}