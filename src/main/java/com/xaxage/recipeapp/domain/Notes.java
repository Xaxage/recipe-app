package com.xaxage.recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
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

}
