package com.abhay.sfgdi1.controller;

import com.abhay.sfgdi1.service.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String getJoke() {
        return this.jokeService.getJoke();
    }
}
