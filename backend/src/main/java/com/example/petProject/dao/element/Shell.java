package com.example.petProject.dao.element;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "shells")
public class Shell extends MacaronElement {
    private ShellBase flour;
    private ShellColor color;

    public Shell() {
      super();
    }

}
