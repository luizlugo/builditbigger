package com.example.androidjokelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.volcanolabs.jokeslibrary.Joke;

public class JokeDetailActivity extends AppCompatActivity {
    public static final String JOKE_PARAM = "jokeParam";

    TextView tvJoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_detail);

        tvJoke = findViewById(R.id.tv_joke);

        Bundle params = getIntent().getExtras();

        if (params != null && params.containsKey(JOKE_PARAM)) {
            String joke = params.getString(JOKE_PARAM);
            if (joke != null) {
                tvJoke.setText(joke);
            }
        }
    }
}
