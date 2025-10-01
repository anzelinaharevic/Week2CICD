package com.example.week2;

public class calculator {
    private String Operation;
    private double total;

    public calculator(String Operation, double total){
        this.Operation = Operation;
        this.total = total;
    }

    public String getOperation() {
        return Operation;
    }

    public double getTotal() {
        return total;
    }
}
