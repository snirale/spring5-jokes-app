package com.snirale.jokeapp.services;

import com.snirale.jokeapp.ChuckNorrishQuotes.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}