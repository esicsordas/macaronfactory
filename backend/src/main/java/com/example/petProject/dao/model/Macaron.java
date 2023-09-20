package com.example.petProject.dao.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "macarons")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Macaron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean basicMacaron;
    private String upperShellColor;
    private String upperShellFlour;
    private String creamFlavor;
    private String bottomShellColor;
    private String bottomShellFlour;
    private int price;


    public Macaron(boolean basicMacaron, String upperShellColor, String upperShellFlour, String creamFlavor, String bottomShellColor, String bottomShellFlour) {
        this.id = id;
        this.basicMacaron = basicMacaron;
        this.upperShellColor = upperShellColor;
        this.upperShellFlour = upperShellFlour;
        this.creamFlavor = creamFlavor;
        this.bottomShellColor = bottomShellColor;
        this.bottomShellFlour = bottomShellFlour;
    }
}
