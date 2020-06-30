package com.captainamericamodule92.demo.controllers;

import com.captainamericamodule92.demo.models.Cave;
import com.captainamericamodule92.demo.repository.CaveRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class CaveController {

    @Resource
    private CaveRepository caveRepo;

    @RequestMapping("/caves")
    public String finalAllCaves(Model model) {
        model.addAttribute("caves", caveRepo.findAll());
        return "cavesView";
    }

    @RequestMapping("/caves/{id}")
    public String displaySingleCave(@PathVariable long id, Model model) {
        Optional<Cave> retrievedCave = caveRepo.findById(id);
        Cave foundCave = retrievedCave.get();
        model.addAttribute("cave", foundCave);
        return "caveView";
    }
}