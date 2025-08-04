package com.allobank.allobackendtest.controller;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.allobank.allobackendtest.model.Caleg;
import com.allobank.allobackendtest.service.CalegService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/caleg")
@RequiredArgsConstructor
public class CalegController {
	
	private final CalegService service;

    // public CalegController(CalegService service) {
	// 	this.service = service;
	// }

	@GetMapping
    public List<Caleg> getCalegs(
        @RequestParam(required = false) UUID dapilId,
        @RequestParam(required = false) UUID partaiId,
        @RequestParam(defaultValue = "true") boolean sortByNomorUrut
    ) {
    	List<Caleg> result = service.getAll(dapilId, partaiId, sortByNomorUrut);
        return (result != null) ? result : Collections.emptyList();
    }
}
