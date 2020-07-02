package com.captainamericamodule92.demo;

import com.captainamericamodule92.demo.models.Cave;
import com.captainamericamodule92.demo.models.Difficulty;
import com.captainamericamodule92.demo.repository.CaveRepository;
import com.captainamericamodule92.demo.repository.DifficultyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.xmlunit.diff.Diff;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private DifficultyRepository difficultyRepo;
    @Autowired
    private CaveRepository caveRepo;

    @Test
    public void difficultyShouldHaveACollectionOfCaves() {
        Difficulty testDifficulty = new Difficulty("testLevel");
        Cave testCave = new Cave("testCave", "testUrl", "testContinent", testDifficulty);

        difficultyRepo.save(testDifficulty);
        caveRepo.save(testCave);

        entityManager.flush();
        entityManager.clear();

        Optional<Difficulty> retrievedDifficultyOpt = difficultyRepo.findById(testDifficulty.getId());
        Difficulty retrievedDifficulty = retrievedDifficultyOpt.get();
        assertThat(retrievedDifficulty.getCaves()).contains(testCave);
    }

}
