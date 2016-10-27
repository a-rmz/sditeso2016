package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by a-rmz on 10/27/16.
 */
public class BluRay implements Movie {

    String name;

    public BluRay(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing " + name);
    }

    public String getName() {
        return this.name;
    }
}
