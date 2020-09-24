package com.company;

public class Patient {

    private String name;
    private String sickness;
    private String medicine;
    private boolean sickBool = true;

    Patient (String name) {
        this.name = name;
        if (sickness == null) {
            this.sickBool = false;
        }
    }

    Patient (String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
        if (sickness == null) {
            this.sickBool = false;
        }
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
