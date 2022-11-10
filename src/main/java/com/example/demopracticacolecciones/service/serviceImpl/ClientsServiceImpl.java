package com.example.demopracticacolecciones.service.serviceImpl;

import com.example.demopracticacolecciones.DTOs.Dtos;
import com.example.demopracticacolecciones.service.ClientsService;

import java.util.ArrayList;
import java.util.List;

public class ClientsServiceImpl implements ClientsService {
    List<Dtos>clientsTable=new ArrayList<>();
    @Override
    public boolean listaMostrar(String name, int amount, int price) {
        clientsTable.add(new Dtos(name,amount,price));
    return true;
    }

    public List<Dtos> getClientsTable() {
        return clientsTable;
    }
}
