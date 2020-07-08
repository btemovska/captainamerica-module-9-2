package com.captainamericamodule92.demo;

import com.captainamericamodule92.demo.controllers.DifficultyController;
import com.captainamericamodule92.demo.models.Difficulty;
import com.captainamericamodule92.demo.repository.DifficultyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DifficultyControllerTest {

    @InjectMocks
    private DifficultyController underTest;

    @Mock
    private DifficultyRepository difficultyRepo;

    @Mock
    private Difficulty expert;

    @Mock
    private Difficulty beginner;

    @Mock
    private Model mockModel;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnAllDifficulties() {
        Collection<Difficulty> allDifficulties = Arrays.asList(expert, beginner);
        when(difficultyRepo.findAll()).thenReturn(allDifficulties);
        underTest.displayDifficulties(mockModel);
        verify(mockModel).addAttribute("difficulties", allDifficulties);
    }

}