package com.luciggl.projeto.controller;

import com.luciggl.projeto.DTO.GameMinDTO;
import com.luciggl.projeto.entities.Game;
import com.luciggl.projeto.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {
    @Autowired
    private GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping("/games")
    public List<GameMinDTO> getGames(){
        return service.findAll();
    }
}
