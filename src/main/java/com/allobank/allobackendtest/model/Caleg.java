package com.allobank.allobackendtest.model;

import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Data
//@Getter
//@Setter
public class Caleg {
	
	@Id
    @GeneratedValue
    private UUID id;
	
	@ManyToOne
    private Dapil dapil;
	
	@ManyToOne
    private Partai partai;
	
    private Integer nomorUrut;
    private String nama;
    
    @Enumerated(EnumType.STRING)
    private JenisKelamin jenisKelamin;
}
