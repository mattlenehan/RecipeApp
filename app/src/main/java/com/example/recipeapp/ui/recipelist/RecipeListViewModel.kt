package com.example.recipeapp.ui.recipelist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.domain.model.Recipe
import com.example.recipeapp.repository.RecipeRepository
import kotlinx.coroutines.launch
import javax.inject.Named

class RecipeListViewModel @ViewModelInject constructor(
    private val repository: RecipeRepository,
    @Named("auth_token") private val token: String
): ViewModel() {
    val recipes: MutableState<List<Recipe>> = mutableStateOf(ArrayList())
    val query = mutableStateOf("")

    init {
        newSearch(query.value)
    }

    fun newSearch(query: String) {
        viewModelScope.launch {
            val result = repository.search(
                token = token,
                page = 1,
                query = query
            )
            recipes.value = result
        }
    }

    fun onQueryChanged(query: String) {
        this.query.value = query
    }
}