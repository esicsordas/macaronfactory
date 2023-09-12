package com.example.petProject.dao.element;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "filling")
public class Filling extends MacaronElement{

    private ChocolateType chocolate;
    private Flavor flavor;
    public Filling() {
        super();
    }

}
