package com.dicoding.picodiploma.dicodingmission4;

import android.view.Display;

import java.util.ArrayList;

public interface LoadMoviesCallback {
    void preExecute();

    void postExecute(ArrayList<Display.Mode> movies);
}


