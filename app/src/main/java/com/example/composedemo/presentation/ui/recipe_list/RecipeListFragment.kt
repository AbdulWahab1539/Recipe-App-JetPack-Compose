package com.example.composedemo.presentation.ui.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint


//Fragment(R.layout.fragment_recipe_list)
@AndroidEntryPoint
class RecipeListFragment: Fragment() {

//    val viewModel: RecipeListViewModel by activityViewModels ()
val viewModel: RecipeListViewModel by viewModels ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        viewModel.recipes.observe(viewLifecycleOwner) {
//
//        }

//        val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
//        view.findViewById<ComposeView>(R.id.compose_view).setContent {
//            Column(modifier = Modifier.padding(10.dp)) {
//
//            }
//        }
//        return view
        val recipes = viewModel.recipes.value
        for(recipe in recipes){

        }

        return ComposeView(requireContext())
            .apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Hello Fragment view", style = TextStyle(
                        fontSize = TextUnit.Companion.Unspecified.div(21)
                    ))
                    Spacer(modifier = Modifier.padding(10.dp))

                }

            }
        }
    }
}