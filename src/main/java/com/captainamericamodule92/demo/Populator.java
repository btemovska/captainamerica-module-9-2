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

        Location africa = new Location("Africa", "/images/location_africa.jpg");
        Location asia = new Location("Asia", "/images/location_asia.jpg");
        Location europe = new Location("Europe", "/images/location_europe.jpg");
        Location northAmerica = new Location("North America", "/images/location_north_america.jpg");
        Location southAmerica = new Location("South America", "/images/location_south_america.jpg");
        Location australia = new Location("Australia", "/images/location_australia.jpg");
        Location antarctica = new Location("Antarctica", "/images/location_antarctica.jpg");

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

        Cave cango = new Cave("Cango Caves", "/images/cango_caves_africa.jpg", africa, "Located in Precambrian limestones at the foothills of the Swartberg range in the Western Cape Province of South Africa. The principal cave is one of the country's finest, best known, and most popular caves and attracts many visitors from overseas. ", expert, stalactites, stalagmites, diving, wildlife);
        Cave echo = new Cave("Echo Caves", "/images/echo_caves_africa.jpg", africa, "In Limpopo, South Africa, caves set in Precambrian dolomite rock, which was first laid down about 3.8 billion years ago, when Africa was still part of Gondwana. The caves are considered some of the oldest in the world.", intermediate, stalactites, stalagmites, wildlife);
        Cave sudwaia = new Cave("Sudwaia Caves", "/images/sudwala_caves_africa.jpg", africa, "In Mpumalanga, South Africa, a set in Precambrian dolomite rock, which was first laid down about 2.8 billion years ago, when Africa was still part of Gondwana. The caves formed about 240 million years ago. They are the oldest caves in the world. ", beginner, stalactites, stalagmites, diving, wildlife);
        Cave sorek = new Cave("Soreq Cave", "/images/sorek_cave_africa.jpg", africa, "Soreq Cave is on the western side of Mt. Ye'ela, in the Judean hills in Israel, unique for its dense concentration of stalactites and other cave formations. The cave has been the focus of paleoclimate research.", expert, stalactites, stalagmites);
        Cave grottes = new Cave("Anjohibe Caves", "/images/grottes_d_andranoboka_caves_africa.jpg", africa, "Anjohibe is the first name of the greatest and easiest to discover cave entrance. This framework has 13 doors and is more than 5 km long with numerous sections.", intermediate, stalactites, stalagmites, diving, wildlife);
        Cave bohol = new Cave("Hinagdanan Cave", "/images/bohol_caves_asia.jpg", asia, "A naturally lighted cavern with a deep lagoon and many large stalactites and stalagmites. The cave is lit by sunlight which filters through holes in the ceiling. The underground lake is a popular swimming spot.", beginner, stalactites, stalagmites, wildlife);
        Cave hang = new Cave("Hang Son Doong", "/images/hang_son_doong_asia.jpg", asia, "The world's largest natural cave, in Phong Nha-Kẻ Bàng National Park in Vietnam. Hang Sơn Đoòng has an internal, fast-flowing subterranean river and the largest cross-section of any cave worldwide.", expert, stalactites, stalagmites, diving, wildlife);
        Cave tempurung = new Cave("Tempurung Cave", "/images/gua_temperung_caves_asia.jpg", asia, "Located in Malaysia. It is popular among spelunkers, or caving enthusiasts. More than 3 km long, it is one of the longest caves in Peninsula Malaysia. A fine river cave, the river passage runs about 1.6 km through the hill.", intermediate, stalactites, stalagmites);
        Cave meghalaya = new Cave("Meghalaya Caves", "/images/meghalaya_india_caves_asia.jpg", asia, "The Caves of Meghalaya comprise a large number of caves, and are amongst the longest caves in the world. Of the ten longest and deepest caves in India, the first nine are in Meghalaya. The longest is 30,957 m (101,600 ft).", beginner, stalactites, stalagmites, diving);
        Cave tham = new Cave("Tham Phu Kham Caves", "/images/tham_phu_kham_cave_asia.jpg", asia, "Tham Phu Kham is a cave to the northwest of Vang Vieng, Laos. Its name means \\\"Blue Lagoon\\\" due to its blue waters. The cave is revered by the locals and contains several Buddha images. The largest is a reclining bronze Thai Buddha in the main cave.", expert, stalactites, stalagmites, diving, wildlife);
        Cave gouffre = new Cave("Gouffre Gerger Caves", "/images/gouffre_gerger_caves_europe.jpg", europe, "From 1953 to 1963, it was regarded as the deepest cave in the world at −1,122 metres (−3,681 ft). The Gouffre Berger is now ranked 28th deepest cave in the world, and the 4th in France. ", intermediate, stalactites, stalagmites, diving);
        Cave holloch = new Cave("Hölloch Caverns", "/images/hölloch_caverns_caves_europe.jpg", europe, "The Hölloch (English: Hellhole) is a 200.4 km (124.5 mi) long cave in Switzerland. In addition to being the second longest cave in Europe, it is also notable for having a depth of 938.6 m (3,079 ft).", beginner, stalactites, stalagmites);
        Cave ease = new Cave("Ease Gill Caves", "/images/ease_gill_caves_europe.jpg", europe, "The longest, and most complex cave system in Britain as of 2011, with around 41 miles (66 km) of passages, including connections only passable by cave diving. It spans the valley between Leck Fell and Casterton Fell. The water resurges into Leck Beck.", expert, stalactites, stalagmites);
        Cave postojna = new Cave("Postojna Cave", "/images/postojnska_jama_caves_europe.jpg", europe, "Postojna Cave is a 24,340 m long karst cave system near Postojna, southwestern Slovenia. It is the second-longest cave system in the country (following the Migovec System] as well as one of its top tourism sites. The caves were created by the Pivka River.", intermediate, stalactites, stalagmites, wildlife);
        Cave blue = new Cave("Blue Grotto", "/images/blue_grotto_caves_europe.jpg", europe, "A sea cave on the coast of the island of Capri, southern Italy. Sunlight passing through an underwater cavity and shining through the seawater creates a blue reflection that illuminates the cavern.", beginner, stalactites, stalagmites, diving, wildlife);
        Cave ape = new Cave("Ape Cave", "/images/ape_cave_north_america.jpg", europe, "Ape Cave, the third longest lava tube in North America, provides moderate to difficult terrain. Visitors to the cave need to be prepared for constant 42 degree F temperature, pitch black conditions and uneven and sometimes slippery surfaces.", expert, stalactites, stalagmites);
        Cave mammoth = new Cave("Mammoth Caves", "/images/mammoth_caves_north_america.jpg", northAmerica, "Mammoth Cave National Park is an American national park in central Kentucky, encompassing portions of Mammoth Cave, the longest cave system known in the world.", intermediate, stalactites, stalagmites, diving);
        Cave rat = new Cave("Rat's Nest Cave", "/images/rats_nest_cave_north_america.jpg", northAmerica, "Rat's Nest Cave is a special place. In 1987 it was designated a Provincial Historic Resource because of its incredible archaeological significance. It is home to ancient pictographs, 7000 year old bones, and beautiful cave formations.", beginner, stalactites, stalagmites, wildlife);
        Cave marengo = new Cave("Marengo Cave", "/images/marengo_cave_north_america.jpg", northAmerica, "Marengo Cave is a privately owned cave located in Marengo, Indiana. One of only four show caves in Indiana, public tours of the cave have been given since 1883. Tours commenced just days after the cave's discovery by two school children.", expert, stalactites, stalagmites, wildlife);
        Cave moaning = new Cave("Moaning Caverns", "/images/moaning_caverns_north_america.jpg", northAmerica, "Moaning Caverns is a solutional cave located in Calaveras County, California, near Vallecito, California in the heart of the state's Gold Country. It is developed in marble of the Calaveras Formation.", intermediate, stalactites, stalagmites);
        Cave milodon = new Cave("Cueva del Milodon Caves", "/images/cuevas_del_milodon_caves_south_america.jpg", southAmerica, "The largest cave in the monument is the 200 metres (660 ft) long Milodón Cave. It was discovered in 1895 by Hermann Eberhard, German explorer of Patagonia. He found a large, seemingly fresh piece of skin of an unidentified animal.", beginner, stalactites, stalagmites, wildlife);
        Cave gruta = new Cave("Gruta Rei do Mato Caves", "/images/gruta_rei_do_mato_south_america.jpg", southAmerica, "The Gruta Rei do Mato is a cave located at the edge of the BR-040 highway, close to the off ramp to the city of Sete Lagoas, in Minas Gerais, Brazil. From Sete Lagoas the cave can easily be reached by bus, taxi or car.", expert, stalactites, stalagmites);
        Cave fantasma = new Cave("Cueva del Fantasma Caves", "/images/cueva_del_fantasma_caves_south_america.jpg", southAmerica, "Cueva del Fantasma is a giant cave in southern Venezuela, located in one of the most biologically rich, geologically ancient parts of the world, along the slopes of Aprada-tepui.", intermediate, stalactites, stalagmites, diving, wildlife);
        Cave sima = new Cave("Sima Pumacocha Caves", "/images/sima_caves_south_america.jpg", southAmerica, "Sima Pumacocha is a limestone cave located in central Peru near the village of Laraos, high in the Andes mountains. At 638 meters deep, it held the record for deepest known cave in South America from 2001 to 2006.", beginner, stalactites, stalagmites, diving);
        Cave huagapo = new Cave("Huagapo Cave", "/images/huagapo_cave_south_america.jpg", southAmerica, "In the Peruvian highlands, a bit off the gringo trail and away from other popular attractions, is Peru’s most famous cave and one of the largest in all the Americas, Gruta de Huagapo, located just outside of Tarma City.", expert, stalactites, stalagmites, diving, wildlife);
        Cave kangaroo = new Cave("Kangaroo Island", "/images/kangaroo_island_caves_australia.jpg", australia, "Kangaroo Island, also known as Karta, is Australia's third-largest island, after Tasmania and Melville Island. Its closest point to the mainland is Snapper Point in Backstairs Passage, which is 13.5 km (8.4 mi) from the Fleurieu Peninsula.", intermediate, stalactites, stalagmites, diving, wildlife);
        Cave ngarua = new Cave("Ngarua Caves", "/images/ngarua_caves_australia.jpg", australia, "The Ngārua Caves are a series of limestone caves in the Takaka Hill range south of Abel Tasman National Park. The caves are located close to Takaka Hill's summit.", beginner, stalactites, stalagmites, wildlife);
        Cave naracoorte = new Cave("Naracoorte Caves", "/images/naracoorte_caves_australia.jpg", australia, "Part of the 800,000 year old Naracoorte East Range. They are World Heritage listed, and one of the world’s most important fossil sites. For half a million years the caves acted as pitfall traps and predator dens.", expert, stalactites, stalagmites, wildlife);
        Cave millennium = new Cave("Millennium Cave", "/images/millennium_cave_australia.jpg", australia, "Millennium Cave The existence of the Cave has been known for many, many years. Ancestors of the present community used the entrance to the cave as a food source. The large numbers of bats and swallows that resided there were a great source of ‘kai kai’.", intermediate, stalactites, stalagmites, diving, wildlife);
        Cave ruakuri = new Cave("Ruakuri Cave", "/images/ruakuri_cave_australia.jpg", australia, "Ruakuri Cave was first discovered by local Maori between 400 and 500 years ago. The name Ruakuri, or \"two dogs\" was created when wild dogs were discovered making their home in the cave entrance some 300 years later.", beginner, stalactites, stalagmites);
        Cave antarcticaCaves = new Cave("Antarctica Caves", "/images/antartica.jpg", antarctica, "Scientists investigating ice caves under Antarctica's glaciers say they are so warm they could support animals and plants. Around Mount Erebus, an active volcano on Ross Island in Antarctica, steam has hollowed out extensive cave systems.", expert, stalactites, stalagmites);

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