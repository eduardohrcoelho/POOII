package ExercicioFixacao.Generics.Parte1.ex2;

import java.util.ArrayList;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }
}

public class Questao2 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Manager manager = new Manager("Carlos");
        
        list.add(manager);
        
        System.out.println("Nenhum erro ocorre ao atribuir/adicionar um objeto Manager a um ArrayList<Employee>. Isso funciona perfeitamente graças ao polimorfismo.");
        
        System.out.println("O erro ocorreria apenas se tentassemos fazer: ArrayList<Employee> list = new ArrayList<Manager>(); pois colecoes genericas sao invariantes.");
    }
}