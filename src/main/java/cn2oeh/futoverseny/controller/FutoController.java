package cn2oeh.futoverseny.controller;

import cn2oeh.futoverseny.repository.FutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cn2oeh.futoverseny.model.Futo;

import java.util.List;

@RestController
@RequestMapping("/api/futok")
public class FutoController {

    @Autowired
    FutoRepository futoRepository;

    @GetMapping("/getRunners")
    public List<Futo> getAllFuto() {
        return futoRepository.findAll();
    }
    @PostMapping("/addRunner")
    public Futo addFuto(@RequestBody Futo futo) {
        futoRepository.save(futo);
        return futo;
    }
}