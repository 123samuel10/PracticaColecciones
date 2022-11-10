package com.example.demopracticacolecciones.model;

public class Clients extends Person{
    private String mail;
    private String product;
    private int amount;
    private int price;
    public Clients(String id,String name,String age,String phoneNumber,String mail, String  product, int amount,int price){
        super(id,name,age,phoneNumber);
        this.mail=mail;
        this.product=product;
        this.amount=amount;
        this.price=price;
    }
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
