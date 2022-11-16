package com.example.TechItEasy.controllers;

import com.example.TechItEasy.exeptions.RecordNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//-  4-6 Maak klasse aan voor TelevisionController en voorzie deze van annotatie, requests en response entities.
//-  Je mag de volgende ResponseEntiteiten als return waardes gebruiken:
//ResponseEntiteit.ok("television")
//ResponseEntiteit.created(null).body("television")
//ResponseEntiteit.noContent().build()

@RestController
public class TelevisionController {

    //GET voor alle televisies (vraag alle tv's op)
    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelevisions() {
        return ResponseEntity.ok("televisions");
    }
    //alternatief: return new ResponseEntity<>(body:"televisions", HttpStatus.OK);

    //GET voor 1 televisie (vraag 1 tv op bij id)
    @GetMapping("televisions/{id}")
    public ResponseEntity<Object> getTelevision(@PathVariable int id) {
        if (id <10) {
            return ResponseEntity.ok("televisie " + id + " gevonden!");
        }else{
            throw new RecordNotFoundException("ID helaas niet gevonden!");
        }
    }
    //alternatief:
    //public ResponsEntity<String> getTelevision(@PathVariable int id){
    //return new ResponsEntity<>(body:"television"+ id, HttpStatus.ok);

    //POST voor 1 televisie (voeg 1 tv toe) Hfst. 5.6 EHub
    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision (@RequestBody String television) {
       return ResponseEntity.created(null).body("television");
    }

    //PUT Request voor 1 televisie (update 1 tv)
    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(){
        //je wijzigt iets, je vraagt niets op .noContent
        return ResponseEntity.noContent().build();
    }

    //DELETE request voor 1 televisie
    @DeleteMapping("/televisions")
    public ResponseEntity<Object> deleteTelevision(){
       return ResponseEntity.noContent().build();
    }


}
