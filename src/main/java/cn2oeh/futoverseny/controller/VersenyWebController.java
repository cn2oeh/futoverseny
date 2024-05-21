package cn2oeh.futoverseny.controller;

import cn2oeh.futoverseny.repository.VersenyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class VersenyWebController {

    @Autowired
    VersenyRepository versenyRepository;

    @GetMapping ("/versenyek")
    public String ListVerseny(Model model) {
        model.addAttribute("verseny", versenyRepository.findAll() );
        return "versenyek";

    }
}