package com.example.demopracticacolecciones.controllers;

import com.example.demopracticacolecciones.model.Clients;

import java.util.Comparator;

public class NombreComparator implements Comparator<Clients> {

    @Override
    public int compare(Clients clien1, Clients clien2) {

        return  (clien1.getName().compareTo(clien2.getName()));

    }
}
