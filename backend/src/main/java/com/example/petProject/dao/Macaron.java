package com.example.petProject.dao;

import com.example.petProject.dao.element.MacaronComponent;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    @OneToMany(mappedBy = "macaron")
    private List<MacaronComponent> component;

    public Macaron(boolean isThisBasicMacaron, int price, List<MacaronComponent> component) {
        this.isThisBasicMacaron = isThisBasicMacaron;
        this.price = calculatePrice();
        this.component = component;
    }

    private int calculatePrice() {
        return this.isThisBasicMacaron ? 2 : 3 ;
    }
}
