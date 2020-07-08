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

        Cave cango = new Cave("Cango Caves", "/images/cango_caves_africa.jpg", "Africa", expert);
        Cave echo = new Cave("Echo Caves", "/images/echo_caves_africa.jpg", "Africa", expert);
        Cave sudwaia = new Cave("Sudwaia Caves", "/images/sudwaia_caves_africa.jpg", "Africa", expert);
        Cave sorek = new Cave("Sorek Cave", "/images/sorek_cave_africa.jpg", "Africa", expert);
        Cave grottes = new Cave("Grottes d'Andranoboka Caves", "/images/grottes_d_andranoboka_caves_africa.jpg", "Africa", expert);
        Cave bohol = new Cave("Bohol Caves", "/images/bohol_caves_asia.jpg", "Asia", expert);
        Cave hang = new Cave("Hang Son Doong", "/images/hang_son_doong_asia.jpg", "Asia", expert);
        Cave tempurung = new Cave("Tempurung Cave", "/images/tempurung_cave_asia.jfif", "Asia", expert);
        Cave meghalaya = new Cave("Meghalaya Caves", "/meghalaya_india_caves_asia.jpg", "Asia", expert);
        Cave tham = new Cave("Tham Phu Kham Caves", "/images/tham_phu_kham_cave_asia.jpg", "Asia", expert);
        Cave gouffre = new Cave("Gouffre Gerger Caves", "/images/gouffre_gerger_caves_europe.jpg", "Europe", expert);
        Cave holloch = new Cave("Hölloch Caverns", "/images/hölloch_caverns_caves_europe.jpg", "Europe", expert);
        Cave ease = new Cave("Ease Gill Caves", "/images/ease_gill_caves_europe.jpg", "Europe", expert);
        Cave postojna = new Cave("Postojna Cave", "/images/postojna_jama_caves_europe.jpg", "Europe", expert);
        Cave blue = new Cave("Blue Grotto", "/images/blue_grotto_caves_europe.jpg", "Europe", expert);
        Cave ape = new Cave("Ape Cave", "/images/ape_cave_north_america.jpg", "North America", expert);
        Cave mammoth = new Cave("Mammoth Caves", "/images/mammoth_caves_north_america.jpg", "North America", expert);
        Cave rat = new Cave("Rat's Nest Cave", "/images/rats_nest_cave_north_america.jpg", "North America", expert);
        Cave marengo = new Cave("Marengo Cave", "/images/marengo_cave_north_america.jpg", "North America", expert);
        Cave moaning = new Cave("Moaning Caverns", "/images/moaning_caverns_north_america.jpg", "North America", expert);
        Cave milodon = new Cave("Cueva del Milodon Caves", "/images/cuevas_del_milodon_caves_south_america.jpg", "South America", expert);
        Cave gruta = new Cave("Gruta Rei do Mato Caves", "/images/gruta_rei_do_mato_south_america.jpg", "South America", expert);
        Cave fantasma = new Cave("Cueva del Fantasma Caves", "/images/cueva_del_fantasma_caves_south_america.jpg", "South America", expert);
        Cave sima = new Cave("Sima Pumacocha Caves", "/images/", "South America", expert);
        Cave huagapo = new Cave("Huagapo Cave", "/images/huagapo_cave_south_america.jpg", "South America", expert);
        Cave kangaroo = new Cave("Kangaroo Island", "/images/kangaroo_island_caves_australia.jpg", "Australia", expert);
        Cave ngarua = new Cave("Ngarua Caves", "/images/ngarua_caves_australia.jpg", "Australia", expert);
        Cave naracoorte = new Cave("Naracoorte Caves", "/images/naracoorte_caves_australia.jpg", "Australia", expert);
        Cave millennium = new Cave("Millennium Cave", "/images/millennium_cave_australia.jpg", "Australia", expert);
        Cave ruakuri = new Cave("Ruakuri Cave", "/images/ruakuri_cave_africa.jpg", "Australia", expert);
        Cave antarctica = new Cave("Antarctica Caves", "/images/antartica.jpg", "Antarctica", expert);

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

