package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Router;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Linksys implements Router {
    @Override
    public void on() {
        System.out.println("Linksys router is ON");
    }

    @Override
    public void off() {
        System.out.println("Linksys router is OFF");
    }

    @Override
    public void checkInternet() {
        System.out.println("Checking internet connection");
        System.out.println("Internet connection is OK");
    }
}
