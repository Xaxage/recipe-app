package com.xaxage.recipeapp.services;

import com.xaxage.recipeapp.commands.RecipeCommand;
import com.xaxage.recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long id);
}
