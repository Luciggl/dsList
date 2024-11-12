package com.luciggl.projeto.services;

import com.luciggl.projeto.DTO.GameMinDTO;

import com.luciggl.projeto.entities.Game;
import com.luciggl.projeto.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

//    public List<GameMinDTO> findAll(){
//        var result = gameRepository.findAll();
//
//    }

    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
