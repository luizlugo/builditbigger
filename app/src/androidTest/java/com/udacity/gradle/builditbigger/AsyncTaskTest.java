package com.udacity.gradle.builditbigger;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

@RunWith(AndroidJUnit4ClassRunner.class)
public class AsyncTaskTest {

    @Test
    public void test() throws TimeoutException, ExecutionException, InterruptedException {
        GetJokeAsyncTask getJokeAsyncTask = new GetJokeAsyncTask();
        String joke = getJokeAsyncTask.execute().get(30, TimeUnit.SECONDS);
        assertNotNull(joke );
        assertFalse(joke.isEmpty());
    }
}
