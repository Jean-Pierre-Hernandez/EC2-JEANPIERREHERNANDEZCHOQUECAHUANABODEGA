package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ClienteDTORequest;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ClienteDTOResponse;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.model.Cliente;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	public ClienteRepository repositorio;

	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c.setNombre(cliente.getNombreDTORe());
		c.setDireccion(cliente.getDireccionDTORe());
		c.setDni(cliente.getDniDTORe());
		
		repositorio.save(c);
	}

	@Override
	public void actualizarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c.setNombre(cliente.getNombreDTORe());
		c.setDireccion(cliente.getDireccionDTORe());
		c.setDni(cliente.getDniDTORe());
		repositorio.saveAndFlush(c);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ClienteDTOResponse> listarCliente() {
		// TODO Auto-generated method stub
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c = null; 
		
		for (Cliente cliente :repositorio.findAll()) {
			c = new ClienteDTOResponse();
			
			c.setNombreDTORes(cliente.getNombre());
			c.setIdClienteDTORes(cliente.getIdCliente());
			c.setDireccionDTORes(cliente.getDireccion());
			c.setDniDTORes(cliente.getDni());
	
			
			lista.add(c);
			
		}
		return lista;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente = repositorio.findById(id).orElse(null);
		ClienteDTOResponse c = new ClienteDTOResponse();
		c.setNombreDTORes(cliente.getNombre());
		c.setIdClienteDTORes(cliente.getIdCliente());
		c.setDireccionDTORes(cliente.getDireccion());
		c.setDniDTORes(cliente.getDni());
		return c;
	}


}
