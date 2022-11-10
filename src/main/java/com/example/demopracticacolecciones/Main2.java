package com.example.demopracticacolecciones;

import com.example.demopracticacolecciones.model.Employees;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
            Employees employees1 = new Employees("0001", "Miguel", "28", "321", 5);
            Employees employees2 = new Employees("0002", "Matias", "30", "123", 9);
            Employees employees3 = new Employees("0003", "Felipe", "25", "211", 3);
            Employees employees4 = new Employees("0004", "Daniel", "22", "111", 2);
            Employees employees5 = new Employees("0005", "Laura", "27", "222", 6);
            Employees employees6=new Employees("0005","Marcos","30","11111",9);

            //agregamos
            List<Employees> employeesList =new ArrayList<>();
            employeesList.add(employees1);
            employeesList.add(employees2);
            employeesList.add(employees3);
            employeesList.add(employees4);
            employeesList.add(employees5);
            employeesList.add(employees6);

            for (Employees employees:employeesList) {
                System.out.println("ID: "+employees.getId()+" "+"NOMBRE: "+employees.getName()+" "+"EDAD: "+employees.getAge()+" "+"TELEFONO: "+employees.getPhoneNumber()+"AÑOS EXPERIENCIA: "+employees.getYearsOfExperience());
            }
        System.out.println("--------------------------------------------------------- ");
        System.out.println("DATO ELIMINADO");
          eliminar(employeesList);//eliminar
        System.out.println("--------------------------------------------------------");
        System.out.println("los empleado con una experiencia mayor o igual a 6 años son: ");
          empleadoConMasExperiencia(employeesList);
    }
    static List<Employees>eliminar(List<Employees>employeesArr){
        employeesArr.forEach(
                employees -> {
                    if (employees.getName() == "Miguel") {
                        employeesArr.remove(employeesArr);
                        System.out.println("eliminado");
                    }else {
                        //los datos que no se eliminaron
                        System.out.println("ID: "+employees.getId()+" "+"NOMBRE: "+employees.getName()+" "+"EDAD: "+employees.getAge()+" "+"TELEFONO: "+employees.getPhoneNumber()+"AÑOS EXPERIENCIA: "+employees.getYearsOfExperience());
                    }
                }
        );
        return employeesArr;
    }

    static List<Employees>empleadoConMasExperiencia(List<Employees>employeesArr){
        employeesArr.stream().filter(employees -> employees.getYearsOfExperience()>=6).forEach(
                employees -> System.out.println(employees.getName())

        );
        return employeesArr;
    }


}

