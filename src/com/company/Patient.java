package com.company;

public class Patient {

    private String name;
    private String sickness;
    private String medicine;
    private boolean sickBool = true;

    Patient (String name) {
        this.name = name;
    }

    Patient (String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    String takeMedication(Medicine medicine){
        sickBool = false;
        return this.medicine;
    }

    String getName(){
        return name;
    }

    String getSickness(){
        return sickness;
    }

    Boolean isSick(){
        return sickBool;
    }
}
