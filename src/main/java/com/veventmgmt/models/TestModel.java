package com.veventmgmt.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestModel{

    @Id
    private int id;
    private String name;

    

}