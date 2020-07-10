package com.captainamericamodule92.demo;

import com.captainamericamodule92.demo.models.Cave;
import com.captainamericamodule92.demo.models.Difficulty;
import com.captainamericamodule92.demo.models.Location;
import com.captainamericamodule92.demo.repository.CaveRepository;
import com.captainamericamodule92.demo.repository.DifficultyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {

    @MockBean
    private DifficultyRepository difficultyRepo;

    @MockBean
    private CaveRepository caveRepo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDifficultiesViewWithCaveModelAttribute() throws Exception {
        mockMvc.perform(get("/difficulties"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("difficultiesView"))
                .andExpect(model().attributeExists("difficulties"));
    }

    @Test
    public void cavesShouldBeOkAndReturnCavesViewWithCavesModelAttribute() throws Exception {
        mockMvc.perform(get("/caves"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("cavesView"))
                .andExpect(model().attributeExists("caves"));
    }

    @Test
    public void shouldBeOkForASingleDifficultyEndpointWithDifficultyViewAndDifficultyModelAttribute() throws Exception {
        Difficulty testDifficulty = new Difficulty("Expert");
        when(difficultyRepo.findDifficultyByLevel("Expert")).thenReturn(testDifficulty);
        mockMvc.perform(get("/difficulties/Expert"))
                .andExpect(status().isOk())
                .andExpect(view().name("difficultyView"))
                .andExpect(model().attributeExists("difficulty"));
    }

    @Test
    public void shouldBeOkForASingleCaveEndpointWithCaveViewAndCaveModelAttribute() throws Exception {
        Difficulty testDifficulty = new Difficulty("Expert");
        Location testLocation = new Location("testLocation", "");
        Cave testCave = new Cave("testCave", "testUrl", testLocation, "", testDifficulty);
        when(caveRepo.findById(1L)).thenReturn(java.util.Optional.of(testCave));
        mockMvc.perform(get("/caves/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("caveView"))
                .andExpect(model().attributeExists("cave"));
    }


}