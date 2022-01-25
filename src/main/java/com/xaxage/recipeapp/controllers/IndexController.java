package com.xaxage.recipeapp.controllers;

import com.xaxage.recipeapp.domain.Category;
import com.xaxage.recipeapp.domain.UnitOfMeasure;
import com.xaxage.recipeapp.repositories.CategoryRepository;
import com.xaxage.recipeapp.repositories.RecipeRepository;
import com.xaxage.recipeapp.repositories.UnitOfMeasureRepository;
import com.xaxage.recipeapp.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }
}
