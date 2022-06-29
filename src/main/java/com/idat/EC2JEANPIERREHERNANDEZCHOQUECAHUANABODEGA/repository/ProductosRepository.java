package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{
	

}
