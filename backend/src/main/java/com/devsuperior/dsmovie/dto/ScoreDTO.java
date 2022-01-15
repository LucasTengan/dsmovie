package com.devsuperior.dsmovie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;
}
