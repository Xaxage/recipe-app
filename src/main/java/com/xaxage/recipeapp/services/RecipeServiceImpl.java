package com.xaxage.recipeapp.services;

import com.xaxage.recipeapp.domain.Recipe;
import com.xaxage.recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().forEach(recipe -> recipeSet.add(recipe));
        return recipeSet;
    }
}
