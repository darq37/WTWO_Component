package com.umcs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer implements Nagroda {
    private String name;
    private String surname;
    private Long pesel;
    private double[] przychody;
    private double[] dochody;
    private String[] miejscaPracy;
    private List<Customer> lista =new ArrayList<>();

    public Customer(String name, String surname, Long pesel, double[] przychody, double[] dochody, String[] miejscaPracy) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.przychody = przychody;
        this.dochody = dochody;
        this.miejscaPracy = miejscaPracy;
    }

    public String getName() {
        return name;
    }

    public String[] getMiejscaPracy() {
        return miejscaPracy;
    }

    public String getSurname() {
        return surname;
    }

    public Long getPesel() {
        return pesel;
    }

    public double[] getPrzychody() {
        return przychody;
    }

    public double[] getDochody() {
        return dochody;
    }

    @Override
    public double obliczNagrode(Customer customer) {
        return 0;
    }

    public void wyswietlDane() {
        System.out.println("Informacje o kliencie: " + getName() + " " + getSurname());
        System.out.println("Pesel: " + getPesel());
        System.out.println("Dochody: " + Arrays.toString(getDochody()));
        System.out.println("Przychody: " + Arrays.toString(getPrzychody()));
        System.out.println("Miejsca pracy: " + Arrays.toString(getMiejscaPracy()));
    }
}

