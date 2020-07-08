package com.captainamericamodule92.demo.controllers;

import com.captainamericamodule92.demo.models.Location;
import com.captainamericamodule92.demo.repository.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LocationController {

    @Resource
    private LocationRepository locationRepo;

    @RequestMapping({"/locations"})
//    @RequestMapping({"/locations", "/", ""})
    public String displayLocations(Model model) {
        model.addAttribute("locations", locationRepo.findAll());
        return "locationsView";
    }

    @GetMapping("/locations/{name}")
    public String displaySingleLocation(@PathVariable String name, Model model) {
        Location retrievedLocation = locationRepo.findLocationByName(name);
        model.addAttribute("location", retrievedLocation);
        return "locationView";
    }
}
