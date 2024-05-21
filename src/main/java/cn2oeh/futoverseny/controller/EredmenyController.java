package cn2oeh.futoverseny.controller;

import cn2oeh.futoverseny.repository.EredmenyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cn2oeh.futoverseny.model.Eredmeny;

import java.util.List;

@RestController
@RequestMapping("/api/eredmenyek")
public class EredmenyController {

    @Autowired
    EredmenyRepository eredmenyRepository;

    @PostMapping("/addResult")
    public Eredmeny addEredmeny(@RequestBody Eredmeny eredmeny) {
        eredmenyRepository.save(eredmeny);
        return eredmeny;
    }
}
