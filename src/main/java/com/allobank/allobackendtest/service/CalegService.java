package com.allobank.allobackendtest.service;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.allobank.allobackendtest.model.Caleg;
import com.allobank.allobackendtest.repository.CalegRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CalegService {
	private final CalegRepository repository;
	
	public List<Caleg> getAll(UUID dapilId, UUID partaiId, boolean sortByNomorUrut) {
        List<Caleg> result;

        if (dapilId != null && partaiId != null) {
            result = repository.findByDapil_IdAndPartai_Id(dapilId, partaiId);
        } else if (dapilId != null) {
            result = repository.findByDapil_Id(dapilId);
        } else if (partaiId != null) {
            result = repository.findByPartai_Id(partaiId);
        } else {
            result = repository.findAll();
        }

        if (sortByNomorUrut) {
            result.sort(Comparator.comparing(Caleg::getNomorUrut));
        }

        return result;
    }

}
