package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.BodegaDTORequest;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.BodegaDTOResponse;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.model.Bodega;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.repository.BodegaRepository;


@Service
public class BodegaServiceImpl implements BodegaService{
	
	@Autowired
	public BodegaRepository repositorio;

	@Override
	public void guardarBodega(BodegaDTORequest bodega) {
		// TODO Auto-generated method stub
		Bodega b = new Bodega();
		b.setNombre(bodega.getNombreDTORe());
		b.setDireccion(bodega.getDireccionDTORe());
	
		repositorio.save(b);
	}

	@Override
	public void actualizarBodega(BodegaDTORequest bodega) {
		// TODO Auto-generated method stub
		Bodega b = new Bodega();
		b.setNombre(bodega.getNombreDTORe());
		b.setDireccion(bodega.getDireccionDTORe());
		repositorio.saveAndFlush(b);
	}

	@Override
	public void eliminarBodega(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<BodegaDTOResponse> listarBodega() {
		// TODO Auto-generated method stub
		List<BodegaDTOResponse> lista = new ArrayList<BodegaDTOResponse>();
		BodegaDTOResponse b = null; 

		for (Bodega bodega :repositorio.findAll()) {
			b = new BodegaDTOResponse();
			
			b.setNombreDTORes(bodega.getNombre());
			b.setIdBodegaDTORes(bodega.getIdBodega());
			b.setDireccionDTORes(bodega.getDireccion());
			lista.add(b);
		}
		return lista;
	}

	@Override
	public BodegaDTOResponse obtenerBodegaId(Integer id) {
		// TODO Auto-generated method stub
		Bodega bodega = repositorio.findById(id).orElse(null);
		BodegaDTOResponse b = new BodegaDTOResponse();
		b.setNombreDTORes(bodega.getNombre());
		b.setIdBodegaDTORes(bodega.getIdBodega());
		b.setDireccionDTORes(bodega.getDireccion());
		return b;
	}	
}
