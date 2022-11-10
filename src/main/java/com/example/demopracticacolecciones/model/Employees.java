package com.example.demopracticacolecciones.model;

import java.util.Objects;

public class Employees extends Person{
    private int yearsOfExperience;

    public Employees(String id, String name, String age, String phoneNumber,int yearsOfExperience) {
        super(id, name, age, phoneNumber);
        this.yearsOfExperience=yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return getId().equals(employees.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
