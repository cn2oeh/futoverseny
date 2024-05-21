package cn2oeh.futoverseny.controller;

import cn2oeh.futoverseny.repository.VersenyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cn2oeh.futoverseny.model.Verseny;

import java.util.List;

@RestController
@RequestMapping("/api/verseny")
public class VersenyController {

    @Autowired
    VersenyRepository versenyRepository;

    @GetMapping("/getAllVerseny")
    public List<Verseny> getAllVerseny() {
        return versenyRepository.findAll();
    }

    @PostMapping("/addVerseny")
    public Verseny addVerseny(@RequestBody Verseny verseny) {
        versenyRepository.save(verseny);
        return verseny;
    }
}