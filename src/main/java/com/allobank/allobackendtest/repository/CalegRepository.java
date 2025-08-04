
package com.allobank.allobackendtest.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allobank.allobackendtest.model.Caleg;

@Repository
public interface CalegRepository extends JpaRepository<Caleg, UUID> {
	List<Caleg> findByDapil_Id(UUID dapilId);
    List<Caleg> findByPartai_Id(UUID partaiId);
    List<Caleg> findByDapil_IdAndPartai_Id(UUID dapilId, UUID partaiId);

}
