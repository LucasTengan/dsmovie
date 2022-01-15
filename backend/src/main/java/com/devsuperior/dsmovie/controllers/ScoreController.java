package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/scores")
public class ScoreController {

    private final ScoreService scoreService;

    @PutMapping()
    public ResponseEntity<MovieDTO> saveScore(@RequestBody ScoreDTO scoreDTO) {
        MovieDTO movieDTO = scoreService.saveScore(scoreDTO);
        return new ResponseEntity<>(movieDTO, HttpStatus.CREATED);
    }
}
