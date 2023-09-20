package com.example.petProject.service;

import com.example.petProject.controller.dto.NewMacaronDTO;
import com.example.petProject.dao.macaron.MacaronDAO;
import com.example.petProject.dao.model.Macaron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MacaronService {
    private MacaronDAO macaronDAO;

    @Autowired
    public MacaronService(MacaronDAO macaronDAO) {
        this.macaronDAO = macaronDAO;
    }

    public List<Macaron> getAllMacarons() {
        return macaronDAO.findAll();
    }
    public void addNewMacaron (NewMacaronDTO macaron) {
        Macaron newMacaron = Macaron.builder()
                .basicMacaron(macaron.basicMacaron())
                .upperShellColor(macaron.upperShellColor())
                .upperShellFlour(macaron.upperShellFlour())
                .creamFlavor(macaron.creamFlavor())
                .bottomShellColor(macaron.bottomShellColor())
                .bottomShellFlour(macaron.bottomShellFlour())
                .build();
        //Probably not the best solution, needs more thinking
        newMacaron.setPrice(macaron.basicMacaron() ? 2 : 3);
        macaronDAO.save(newMacaron);
    }
}
