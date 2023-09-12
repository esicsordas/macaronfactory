package com.example.petProject.dao.element;

import com.example.petProject.dao.Macaron;
import jakarta.persistence.*;

@Entity
@Table(name = "macaroncomponent")
public class MacaronComponent {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "macaron_id")
    private Macaron macaron;

    @ManyToOne(targetEntity = Shell.class, cascade = CascadeType.ALL)
    private MacaronElement element;
}
