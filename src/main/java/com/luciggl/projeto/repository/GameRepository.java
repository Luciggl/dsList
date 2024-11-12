package com.luciggl.projeto.repository;

import com.luciggl.projeto.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
