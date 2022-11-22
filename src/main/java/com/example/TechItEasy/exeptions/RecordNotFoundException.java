package com.example.TechItEasy.exeptions;

// 11. Extend de klasse met een RunTimeExeption
public class RecordNotFoundException extends RuntimeException {
// 12. Vul de klasse aan a.d.h.v. hfst. 5.11 SP EHub/ Response voor BAD REQUESTS

//Automatische boodschap als id wel of niet wordt gevonden:
//private static final long serialVersionUID = 1L;
public RecordNotFoundException(){
    super();
}
public RecordNotFoundException(String message){
    super(message);
}

}
