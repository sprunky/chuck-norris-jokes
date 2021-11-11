package com.sprunky.chucknorrisjokes.service;

import com.sprunky.chucknorrisjokes.model.Joke;
import org.springframework.stereotype.Service;

@Service
public interface JokeService {
    Joke getJoke();
}
