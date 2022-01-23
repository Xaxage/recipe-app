package com.xaxage.recipeapp.domain;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //We don't assign cascade, because we want Recipe to own notes, so when notes are deleted Recipe will stay.
    //When Recipe is deleted notes will be deleted as well.
    @OneToOne
    private Recipe recipe;

    @Lob//Is kinda another type of field in SQL , which has more space than default SQL String
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
