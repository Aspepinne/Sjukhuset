package com.company;

public class Patient {

    private String name;
    private String sickness;
    private boolean sickBool = true;

    Patient (String name){
        this.name = name;
    }

    Patient (String name, String sickness){
        this.name = name;
        this.sickness = sickness;
    }

    void takeMedication(Medicine medicine){
        if(medicine.getTreatmentName().equals(sickness)){
            sickness = null;
        }
    }

    String getName(){
        return name;
    }

    String getSickness(){
        return sickness;
    }

    Boolean isSick(){
        return sickness != null;
    }
}