package com.captainamericamodule92.demo.controllers;

import com.captainamericamodule92.demo.models.Difficulty;
import com.captainamericamodule92.demo.repository.DifficultyRepository;
import com.captainamericamodule92.demo.repository.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class DifficultyController {

    @Resource
    private DifficultyRepository difficultyRepo;
    @Resource
    private LocationRepository locationRepo;

    @RequestMapping({"/difficulties", "/", ""})
    public String displayDifficulties(Model model) {
        model.addAttribute("difficulties", difficultyRepo.findAll());
        model.addAttribute("locations", locationRepo.findAll());
        return "difficultiesView";
    }

    @GetMapping("/difficulties/{level}")
    public String displaySingleDifficulty(@PathVariable String level, Model model) {
        Difficulty retrievedDifficulty = difficultyRepo.findDifficultyByLevel(level);
        model.addAttribute("difficulty", retrievedDifficulty);
        return "difficultyView";
    }
}