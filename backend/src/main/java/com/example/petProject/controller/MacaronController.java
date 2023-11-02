package com.example.petProject.controller;

import com.example.petProject.controller.dto.NewMacaronDTO;
import com.example.petProject.dao.model.Macaron;
import com.example.petProject.service.MacaronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/macaron")
public class MacaronController {
    private final MacaronService macaronService;
    @Autowired
    public MacaronController(MacaronService macaronService) {
        this.macaronService = macaronService;
    }

    @GetMapping()
    public List<Macaron> getAllMacarons() {
        return macaronService.getAllMacarons();
    }
    @PostMapping("/add-macaron")
    public ResponseEntity addNewMacaron(@RequestBody NewMacaronDTO newMacaronDTO) {
        macaronService.addNewMacaron(newMacaronDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
