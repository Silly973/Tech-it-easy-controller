package com.example.TechItEasy.controllers;

import com.example.TechItEasy.exeptions.RecordNotFoundException;
import com.example.TechItEasy.models.Television;
import com.example.TechItEasy.repositories.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

//-  4-6 Maak klasse aan voor TelevisionController en voorzie deze van annotatie, requests en response entities.
//-  Je mag de volgende ResponseEntiteiten als return waardes gebruiken:
//ResponseEntiteit.ok("television")
//ResponseEntiteit.created(null).body("television")
//ResponseEntiteit.noContent().build()

@RestController
@RequestMapping(path="television")
public class TelevisionController {

    private final TelevisionRepository televisionRepository;

    @Autowired
    public TelevisionController(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    @GetMapping("")
    public ResponseEntity<Object> getAllTelevisions() {
        return ResponseEntity.ok(televisionRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getTelevision(@PathVariable Long id) {
        Optional<Television> television = televisionRepository.findById(id);

        if (television.isEmpty()) {
            throw new RecordNotFoundException("No television found with id " + id);
        } else {
            Television television1 = television.get();

            return ResponseEntity.ok("Television " + id);
        }
    }

    @PostMapping("")
    public ResponseEntity<Object> addTelevision(@RequestBody Television television) {
        televisionRepository.save(television);
        URI uri = URI.create(
                       ServletUriComponentsBuilder
                                 .fromCurrentContextPath()
                                  .path("/Television/" + television.getId()).toUriString());

        return ResponseEntity.created(uri).body("Television is added!");

       // return ResponseEntity.ok("Television added");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTelevision (@PathVariable("id") Long id){
        televisionRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable Long id, @RequestBody Television television) {
        Optional<Television> optionalTelevision = televisionRepository.findById((Long) id);
        if (optionalTelevision.isEmpty()) {
            throw new RecordNotFoundException("No television found with id " + id);
        } else {
            Television updateTelevision = optionalTelevision.get();
            updateTelevision.setType(television.getType());
            updateTelevision.setBrand(television.getBrand());
            updateTelevision.setName(television.getName());
            updateTelevision.setPrice(television.getPrice());
            updateTelevision.setAvailableSize(television.getAvailableSize());
            updateTelevision.setRefreshRate(television.getRefreshRate());
            updateTelevision.setScreenType(television.getScreenType());
            updateTelevision.setScreenQuality(television.getScreenQuality());
            updateTelevision.setSmartTv(television.getSmartTv());
            updateTelevision.setWifi(television.getWifi());
            updateTelevision.setVoiceControl(television.getVoiceControl());
            updateTelevision.setHdr(television.getHdr());
            updateTelevision.setBluetooth(television.getBluetooth());
            updateTelevision.setAmbiLight(television.getAmbiLight());
            updateTelevision.setOriginalStock(television.getOriginalStock());
            updateTelevision.setSold(television.getSold());

            televisionRepository.save(updateTelevision);
            return ResponseEntity.ok(updateTelevision);

        }



    }
}



