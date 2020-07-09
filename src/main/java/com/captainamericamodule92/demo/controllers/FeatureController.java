package com.captainamericamodule92.demo.controllers;

import com.captainamericamodule92.demo.models.Feature;
import com.captainamericamodule92.demo.repository.FeatureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class FeatureController {

    @Resource
    private FeatureRepository featureRepo;

    @RequestMapping({"/features"})
    public String displayFeatures(Model model) {
        model.addAttribute("features", featureRepo.findAll());
        return "featuresView";
    }

    @GetMapping("/features/{name}")
    public String displaySingleFeature(@PathVariable String name, Model model) {
        Feature retrievedFeature = featureRepo.findFeatureByName(name);
//        model.addAttribute("location", retrievedFeature);
        model.addAttribute("feature", retrievedFeature);
        return "featureView";
    }
}
