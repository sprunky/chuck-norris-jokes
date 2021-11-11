package com.sprunky.chucknorrisjokes.controllers;

import com.sprunky.chucknorrisjokes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("joke")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
