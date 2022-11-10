package com.example.demopracticacolecciones;

import com.example.demopracticacolecciones.DTOs.Dtos;
import com.example.demopracticacolecciones.controllers.NombreComparator;
import com.example.demopracticacolecciones.model.Clients;
import com.example.demopracticacolecciones.service.serviceImpl.ClientsServiceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Main principal utilizando la coleccion List
        //PUNTO
        // Buscar en una lista dado un parámetro (de su elección, nombre, identificación) y retorne el primer elemento encontrado (investigue como puede hacer esto, utilice streams.
        Clients clients1 = new Clients("0001", "Samuel", "17", "3218520520", "samuel@", "computador", 2, 1200);
        Clients clients2 = new Clients("0002", "Mateo", "25", "3208520520", "mateo@", "televisor", 1, 1500);
        Clients clients3 = new Clients("0003", "Isabella", "18", "3197520520", "isabella@", "celular", 1, 2000);
        Clients clients4 = new Clients("0004", "Mariana", "27", "3224520520", "mariana@", "computador", 1, 1200);
        Clients clients5 = new Clients("0005", "Matias", "17", "3207282033", "samuel1@", "lavadora", 3, 1200);
        //metodo para ordenar:


        List<Clients> clientsList = new ArrayList<>();
        clientsList.add(clients1);
        clientsList.add(clients2);
        clientsList.add(clients3);
        clientsList.add(clients4);
        clientsList.add(clients5);
        mostrar(clientsList);//mostrar datos en consola
        System.out.println("-------------------------------------------------------------");
        System.out.println("estos son los clientes que tienen el producto de computador");
        buscar(clientsList);//buscar
        System.out.println("----------------------------------------------------------------");
        System.out.println("organizando los nombres en orden alfabetico");
        Collections.sort(clientsList,new NombreComparator());

        for (Clients clients:clientsList) {
            System.out.println(clients.getName());
        }
        System.out.println("--------------------------------------------------");

        System.out.println("Datos table");
        ClientsServiceImpl clientsService=new ClientsServiceImpl();
        clientsService.listaMostrar(clientsList.get(0).getName(),clientsList.get(0).getAmount(),clientsList.get(0).getPrice());
        for (Dtos clients:clientsService.getClientsTable()) {
            System.out.println("Nombre: "+clients.getName()+"-"+"Cantidad: "+clients.getAmount()+"-"+"Precio: "+clients.getPrice());//se agrego a la tabla

        }

    }
    static List<Clients> mostrar(List<Clients> recorrer) {
        for (Clients clients : recorrer) {
            System.out.println("ID: " + clients.getId() + " " + "NOMBRE: " + clients.getName() + " " + "EDAD: " + clients.getAge() + " " + "TELEFONO: " + clients.getPhoneNumber() + " " + "CORREO: " + clients.getMail() + " "+
                   "PRODUCTO" + clients.getProduct() + " " + " CANTIDAD: " + clients.getAmount() + " " + "PRECIO: " + clients.getPrice());

        }
        return recorrer;
    }
    static List<Clients> buscar(List<Clients> recorrerBuscar) {
        recorrerBuscar.stream().filter(elemento -> elemento.getProduct().equals("computador"))
                .map(clients ->clients.getName()).forEach(System.out::println);
        return recorrerBuscar;
    }


}



