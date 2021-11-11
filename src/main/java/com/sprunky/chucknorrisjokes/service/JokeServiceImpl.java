package com.sprunky.chucknorrisjokes.service;


import com.sprunky.chucknorrisjokes.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public Joke getJoke() {
     return new Joke(chuckNorrisQuotes.getRandomQuote());
    }
}
