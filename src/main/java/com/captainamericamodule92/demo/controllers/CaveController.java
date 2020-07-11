package com.captainamericamodule92.demo.controllers;

import com.captainamericamodule92.demo.models.Cave;
import com.captainamericamodule92.demo.models.HashTag;
import com.captainamericamodule92.demo.repository.CaveRepository;
import com.captainamericamodule92.demo.repository.FeatureRepository;
import com.captainamericamodule92.demo.repository.HashTagRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class CaveController {

    @Resource
    private CaveRepository caveRepo;
    @Resource
    private FeatureRepository featureRepo;
    @Resource
    private HashTagRepository hashTagRepo;

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
        model.addAttribute("feature", featureRepo.findAll());
        return "caveView";
    }

    @PostMapping("/caves/{id}/add-hashtag")
    public String addHashTagToCave(@RequestParam String hashTagName, @PathVariable long id) {
        HashTag hashTagToAddToCave;
        Optional<HashTag> hashTagToAddOpt = hashTagRepo.findByName(hashTagName);
        if (hashTagToAddOpt.isEmpty()) {
            hashTagToAddToCave = new HashTag(hashTagName);
            hashTagRepo.save(hashTagToAddToCave);
        } else {
            hashTagToAddToCave = hashTagToAddOpt.get();
        }
        Optional<Cave> retrievedCave = caveRepo.findById(id);
        Cave foundCave = retrievedCave.get();
        foundCave.addHashTag(hashTagToAddToCave);
        caveRepo.save(foundCave);
        return "redirect:/caves/" + id;
    }

    @PostMapping("/caves/{id}/delete-hashtag/{hashTagId}")
    public String deleteHashTag(@PathVariable Long id, @PathVariable Long hashTagId) {
        Optional<HashTag> hashTagToRemoveOpt = hashTagRepo.findById(hashTagId);
        HashTag hashTagToRemove = hashTagToRemoveOpt.get();

        for (Cave cave : hashTagToRemove.getCaves()) {
            cave.deleteHashTag(hashTagToRemove);
            caveRepo.save(cave);
        }

        Optional<Cave> caveToRemoveHashTagFromOpt = caveRepo.findById(id);
        Cave caveToRemoveHashTagFrom = caveToRemoveHashTagFromOpt.get();
        caveToRemoveHashTagFrom.deleteHashTag(hashTagToRemove);
        caveRepo.save(caveToRemoveHashTagFrom);
        hashTagRepo.delete(hashTagToRemove);
        return "redirect:/caves/" + id;
    }
}

