package com.xaxage.recipeapp.controllers;

import com.xaxage.recipeapp.domain.Category;
import com.xaxage.recipeapp.domain.UnitOfMeasure;
import com.xaxage.recipeapp.repositories.CategoryRepository;
import com.xaxage.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is:" + categoryOptional.get().getId());
        System.out.println("UOM id is:" + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
