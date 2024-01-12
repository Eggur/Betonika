package com.Eggur.controller;

import com.Eggur.service.RatingService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;

    @GetMapping("/rating")
    public String rating(Model model){
        model.addAttribute("rating", ratingService.findAllRating());
        return "rating";
    }

}
