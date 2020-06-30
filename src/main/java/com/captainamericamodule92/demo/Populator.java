package com.captainamericamodule92.demo;


import com.captainamericamodule92.demo.models.Cave;
import com.captainamericamodule92.demo.models.Difficulty;
import com.captainamericamodule92.demo.repository.CaveRepository;
import com.captainamericamodule92.demo.repository.DifficultyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private DifficultyRepository difficultyRepo;
    @Resource
    private CaveRepository caveRepo;

    @Override
    public void run(String... args) throws Exception {

        Difficulty beginner = new Difficulty("Beginner");
        Difficulty intermediate = new Difficulty("Intermediate");
        Difficulty expert = new Difficulty("Expert");

        difficultyRepo.save(beginner);
        difficultyRepo.save(intermediate);
        difficultyRepo.save(expert);

        Cave cango = new Cave("Cango Caves", "", "Africa", expert);
        Cave echo = new Cave("Echo Caves", "", "Africa", expert);
        Cave sudwaia = new Cave("Sudwaia Caves", "", "Africa", expert);
        Cave sorek = new Cave("Sorek Cave", "", "Africa", expert);
        Cave grottes = new Cave("Grottes d'Andranoboka Caves", "", "Africa", expert);
        Cave bohol = new Cave("Bohol Caves", "", "Asia", expert);
        Cave hang = new Cave("Hang Son Doong", "", "Asia", expert);
        Cave tempurung = new Cave("Tempurung Cave", "", "Asia", expert);
        Cave meghalaya = new Cave("Meghalaya Caves", "", "Asia", expert);
        Cave tham = new Cave("Tham Phu Kham Caves", "", "Asia", expert);
        Cave gouffre = new Cave("Gouffre Berger Caves", "", "Europe", expert);
        Cave holloch = new Cave("Hölloch Caverns", "", "Europe", expert);
        Cave ease = new Cave("Ease Gill Caves", "", "Europe", expert);
        Cave postojna = new Cave("Postojna Cave", "", "Europe", expert);
        Cave blue = new Cave("Blue Grotto", "", "Europe", expert);
        Cave ape = new Cave("Ape Cave", "", "North America", expert);
        Cave mammoth = new Cave("Mammoth Caves", "", "North America", expert);
        Cave rat = new Cave("Rat's Nest Cave", "", "North America", expert);
        Cave marengo = new Cave("Marengo Cave", "", "North America", expert);
        Cave moaning = new Cave("Moaning Caverns", "", "North America", expert);
        Cave milodon = new Cave("Cueva del Milodon Caves", "", "South America", expert);
        Cave gruta = new Cave("Gruta Rei do Mato Caves", "", "South America", expert);
        Cave fantasma = new Cave("Cueva del Fantasma Caves", "", "South America", expert);
        Cave sima = new Cave("Sima Pumacocha Caves", "", "South America", expert);
        Cave huagapo = new Cave("Huagapo Cave", "", "South America", expert);
        Cave kangaroo = new Cave("Kangaroo Island", "", "Australia", expert);
        Cave ngarua = new Cave("Ngarua Caves", "", "Australia", expert);
        Cave naracoorte = new Cave("Naracoorte Caves", "", "Australia", expert);
        Cave millennium = new Cave("Millennium Cave", "", "Australia", expert);
        Cave ruakuri = new Cave("Ruakuri Cave", "", "Australia", expert);
        Cave antarctica = new Cave("Antarctica Caves", "", "Antarctica", expert);

        caveRepo.save(cango);
        caveRepo.save(echo);
        caveRepo.save(sudwaia);
        caveRepo.save(sorek);
        caveRepo.save(grottes);
        caveRepo.save(bohol);
        caveRepo.save(hang);
        caveRepo.save(tempurung);
        caveRepo.save(meghalaya);
        caveRepo.save(tham);
        caveRepo.save(gouffre);
        caveRepo.save(holloch);
        caveRepo.save(ease);
        caveRepo.save(postojna);
        caveRepo.save(blue);
        caveRepo.save(ape);
        caveRepo.save(mammoth);
        caveRepo.save(rat);
        caveRepo.save(marengo);
        caveRepo.save(moaning);
        caveRepo.save(milodon);
        caveRepo.save(gruta);
        caveRepo.save(fantasma);
        caveRepo.save(sima);
        caveRepo.save(huagapo);
        caveRepo.save(kangaroo);
        caveRepo.save(ngarua);
        caveRepo.save(naracoorte);
        caveRepo.save(millennium);
        caveRepo.save(ruakuri);
        caveRepo.save(antarctica);
    }
}

