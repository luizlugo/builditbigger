package com.volcanolabs.jokeslibrary;

public class JokesFactory {
    private static JokesFactory instance = null;
    private Joke[] jokes = {
            new Joke("How many times can you subtract 10 from 100?\n Once. The next time you would be subtracting 10 from 90.\n"),
            new Joke("Why did the chicken go to the séance?\n To get to the other side."),
            new Joke("Where are average things manufactured?\n The satisfactory.\n"),
            new Joke("How do you drown a hipster?\n Throw him in the mainstream.\n"),
            new Joke("What sits at the bottom of the sea and twitches?\n A nervous wreck.\n")};

    public static JokesFactory getInstance() {
        if (instance == null) {
            instance = new JokesFactory();
        }
        return instance;
    }

    public Joke getJoke() {
        int position = (int) (Math.random() * jokes.length - 1);
        return jokes[position];
    }
}
