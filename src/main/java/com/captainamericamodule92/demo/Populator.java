package com.captainamericamodule92.demo;

import com.captainamericamodule92.demo.models.Cave;
import com.captainamericamodule92.demo.models.Difficulty;
import com.captainamericamodule92.demo.models.Feature;
import com.captainamericamodule92.demo.models.Location;
import com.captainamericamodule92.demo.repository.CaveRepository;
import com.captainamericamodule92.demo.repository.DifficultyRepository;
import com.captainamericamodule92.demo.repository.FeatureRepository;
import com.captainamericamodule92.demo.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private DifficultyRepository difficultyRepo;
    @Resource
    private CaveRepository caveRepo;
    @Resource
    private LocationRepository locationRepo;
    @Resource
    private FeatureRepository featureRepo;

    @Override
    public void run(String... args) throws Exception {

        Feature diving = new Feature("Diving");
        Feature wildlife = new Feature("Wildlife");
        Feature stalactites = new Feature("Stalactites");
        Feature stalagmites = new Feature("Stalagmites");

        featureRepo.save(diving);
        featureRepo.save(wildlife);
        featureRepo.save(stalactites);
        featureRepo.save(stalagmites);

        Location africa = new Location("Africa", "images/location_africa.jpg");
        Location asia = new Location("Asia", "images/location_asia.jpg");
        Location europe = new Location("Europe", "images/location_europe.jpg");
        Location northAmerica = new Location("North America", "images/location_north_america.jpg");
        Location southAmerica = new Location("South America", "images/location_south_america.jpg");
        Location australia = new Location("Australia", "images/location_australia.jpg");
        Location antarctica = new Location("Antarctica", "images/location_antarctica.jpg");

        locationRepo.save(africa);
        locationRepo.save(asia);
        locationRepo.save(europe);
        locationRepo.save(northAmerica);
        locationRepo.save(southAmerica);
        locationRepo.save(australia);
        locationRepo.save(antarctica);

        Difficulty beginner = new Difficulty("Beginner");
        Difficulty intermediate = new Difficulty("Intermediate");
        Difficulty expert = new Difficulty("Expert");

        difficultyRepo.save(beginner);
        difficultyRepo.save(intermediate);
        difficultyRepo.save(expert);

        Cave cango = new Cave("Cango Caves", "/images/cango_caves_africa.jpg", africa, expert, stalactites, stalagmites, diving, wildlife);
        Cave echo = new Cave("Echo Caves", "/images/echo_caves_africa.jpg", africa, intermediate, stalactites, stalagmites, wildlife);
        Cave sudwaia = new Cave("Sudwaia Caves", "/images/sudwala_caves_africa.jpg", africa, beginner, stalactites, stalagmites, diving, wildlife);
        Cave sorek = new Cave("Soreq Cave", "/images/sorek_cave_africa.jpg", africa, expert, stalactites, stalagmites);
        Cave grottes = new Cave("Grottes d'Andranoboka Caves", "/images/grottes_d_andranoboka_caves_africa.jpg", africa, intermediate, stalactites, stalagmites, diving, wildlife);
        Cave bohol = new Cave("Bohol Caves", "/images/bohol_caves_asia.jpg", asia, beginner, stalactites, stalagmites, wildlife);
        Cave hang = new Cave("Hang Son Doong", "/images/hang_son_doong_asia.jpg", asia, expert, stalactites, stalagmites, diving, wildlife);
        Cave tempurung = new Cave("Tempurung Cave", "/images/gua_temperung_caves_asia.jpg", asia, intermediate, stalactites, stalagmites);
        Cave meghalaya = new Cave("Meghalaya Caves", "/images/meghalaya_india_caves_asia.jpg", asia, beginner, stalactites, stalagmites, diving);
        Cave tham = new Cave("Tham Phu Kham Caves", "/images/tham_phu_kham_cave_asia.jpg", asia, expert, stalactites, stalagmites, diving, wildlife);
        Cave gouffre = new Cave("Gouffre Gerger Caves", "/images/gouffre_gerger_caves_europe.jpg", europe, intermediate, stalactites, stalagmites, diving);
        Cave holloch = new Cave("Hölloch Caverns", "/images/hölloch_caverns_caves_europe.jpg", europe, beginner, stalactites, stalagmites);
        Cave ease = new Cave("Ease Gill Caves", "/images/ease_gill_caves_europe.jpg", europe, expert, stalactites, stalagmites);
        Cave postojna = new Cave("Postojna Cave", "/images/postojnska_jama_caves_europe.jpg", europe, intermediate, stalactites, stalagmites, wildlife);
        Cave blue = new Cave("Blue Grotto", "/images/blue_grotto_caves_europe.jpg", europe, beginner, stalactites, stalagmites, diving, wildlife);
        Cave ape = new Cave("Ape Cave", "/images/ape_cave_north_america.jpg", europe, expert, stalactites, stalagmites);
        Cave mammoth = new Cave("Mammoth Caves", "/images/mammoth_caves_north_america.jpg", northAmerica, intermediate, stalactites, stalagmites, diving);
        Cave rat = new Cave("Rat's Nest Cave", "/images/rats_nest_cave_north_america.jpg", northAmerica, beginner, stalactites, stalagmites, wildlife);
        Cave marengo = new Cave("Marengo Cave", "/images/marengo_cave_north_america.jpg", northAmerica, expert, stalactites, stalagmites, wildlife);
        Cave moaning = new Cave("Moaning Caverns", "/images/moaning_caverns_north_america.jpg", northAmerica, intermediate, stalactites, stalagmites);
        Cave milodon = new Cave("Cueva del Milodon Caves", "/images/cuevas_del_milodon_caves_south_america.jpg", southAmerica, beginner, stalactites, stalagmites, wildlife);
        Cave gruta = new Cave("Gruta Rei do Mato Caves", "/images/gruta_rei_do_mato_south_america.jpg", southAmerica, expert, stalactites, stalagmites);
        Cave fantasma = new Cave("Cueva del Fantasma Caves", "/images/cueva_del_fantasma_caves_south_america.jpg", southAmerica, intermediate, stalactites, stalagmites, diving, wildlife);
        Cave sima = new Cave("Sima Pumacocha Caves", "/images/sima_caves_south_america.jpg", southAmerica, beginner, stalactites, stalagmites, diving);
        Cave huagapo = new Cave("Huagapo Cave", "/images/huagapo_cave_south_america.jpg", southAmerica, expert, stalactites, stalagmites, diving, wildlife);
        Cave kangaroo = new Cave("Kangaroo Island", "/images/kangaroo_island_caves_australia.jpg", australia, intermediate, stalactites, stalagmites, diving, wildlife);
        Cave ngarua = new Cave("Ngarua Caves", "/images/ngarua_caves_australia.jpg", australia, beginner, stalactites, stalagmites, wildlife);
        Cave naracoorte = new Cave("Naracoorte Caves", "/images/naracoorte_caves_australia.jpg", australia, expert, stalactites, stalagmites, wildlife);
        Cave millennium = new Cave("Millennium Cave", "/images/millennium_cave_australia.jpg", australia, intermediate, stalactites, stalagmites, diving, wildlife);
        Cave ruakuri = new Cave("Ruakuri Cave", "/images/ruakuri_cave_australia.jpg", australia, beginner, stalactites, stalagmites);
        Cave antarcticaCaves = new Cave("Antarctica Caves", "/images/antartica.jpg", antarctica, expert, stalactites, stalagmites);

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
        caveRepo.save(antarcticaCaves);

    }
}