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
    private boolean isThisBasicMacaron;
    private int price;
    private String upperShellColor;
    private String upperShellFlour;
    private String creamFlavor;
    private String bottomShellColor;
    private String bottomShellFlour;

    public Macaron(Long id, boolean isThisBasicMacaron, String upperShellColor, String upperShellFlour, String creamFlavor, String bottomShellColor, String bottomShellFlour) {
        this.id = id;
        this.isThisBasicMacaron = isThisBasicMacaron;
        this.price = calculatePrice();
        this.upperShellColor = upperShellColor;
        this.upperShellFlour = upperShellFlour;
        this.creamFlavor = creamFlavor;
        this.bottomShellColor = bottomShellColor;
        this.bottomShellFlour = bottomShellFlour;
    }

    private int calculatePrice() {
        return this.isThisBasicMacaron ? 2 : 3 ;
    }
}
