package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.model.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer>{

}
