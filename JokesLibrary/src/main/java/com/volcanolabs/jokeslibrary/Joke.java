package com.volcanolabs.jokeslibrary;

import java.io.Serializable;

public class Joke implements Serializable {
    private String jokeString;

    public Joke(String jokeString) {
        this.jokeString = jokeString;
    }

    public String getJokeString() {
        return jokeString;
    }

    public void setJokeString(String jokeString) {
        this.jokeString = jokeString;
    }
}
