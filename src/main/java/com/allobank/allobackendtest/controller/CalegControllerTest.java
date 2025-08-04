//package com.allobank.allobackendtest.controller;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import java.util.List;
//import java.util.UUID;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.allobank.allobackendtest.model.Caleg;
//import com.allobank.allobackendtest.service.CalegService;
//
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@WebMvcTest(CalegController.class)
//public class CalegControllerTest {
//
//	@Autowired
//    private MockMvc mockMvc;
//	
//	@MockBean
//    private CalegService calegService;
//
////    @Test
////    void testGetCalegs_Return200() throws Exception {
////        mockMvc.perform(get("/api/caleg"))
////               .andExpect(status().isOk())
////               .andExpect(content().contentType(MediaType.APPLICATION_JSON));
////    }
//	
//	private final UUID dapilTangerangId = UUID.fromString("00000000-0000-0000-0000-000000000011");
//    private final UUID dapilJakartaId = UUID.fromString("00000000-0000-0000-0000-000000000012");
//    private final UUID partaiOptimisId = UUID.fromString("00000000-0000-0000-0000-000000000001");
//    private final UUID partaiProgresifId = UUID.fromString("00000000-0000-0000-0000-000000000002");
//
//    @Test
//    void testGetAllCaleg_ReturnsFullList() throws Exception {
//        List<Caleg> calegs = List.of(
//            new Caleg("Joko Harapan", 1),
//            new Caleg("Siti Merdeka", 2)
//        );
//
//        when(calegService.getAll(null, null, true)).thenReturn(calegs);
//
//        mockMvc.perform(get("/api/caleg"))
//               .andExpect(status().isOk())
//               .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//               .andExpect(jsonPath("$.length()").value(2))
//               .andExpect(jsonPath("$[0].nama").value("Joko Harapan"))
//               .andExpect(jsonPath("$[1].nama").value("Siti Merdeka"));
//    }
//    
//    @Test
//    void testFilterByDapilAndPartai_ReturnsOne() throws Exception {
//        List<Caleg> filtered = List.of(
//            new Caleg("Joko Harapan", 1)
//        );
//
//        when(calegService.getAll(dapilTangerangId, partaiOptimisId, true)).thenReturn(filtered);
//
//        mockMvc.perform(get("/api/caleg")
//                .param("dapilId", dapilTangerangId.toString())
//                .param("partaiId", partaiOptimisId.toString()))
//               .andExpect(status().isOk())
//               .andExpect(jsonPath("$.length()").value(1))
//               .andExpect(jsonPath("$[0].nama").value("Joko Harapan"));
//    }
//}
