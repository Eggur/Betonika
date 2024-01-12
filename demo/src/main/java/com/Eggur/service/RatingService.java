package com.Eggur.service;

import com.Eggur.model.Rating;
import com.Eggur.repo.RatingRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class RatingService {

    private final RatingRepository ratingRepository;

    public List<Rating> findAllRating(){
        return ratingRepository.findAll();
    }

}
