package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.service;

import java.util.List;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ClienteDTORequest;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ClienteDTOResponse;

public interface ClienteService {
	
	void guardarCliente(ClienteDTORequest cliente);
	void actualizarCliente(ClienteDTORequest cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarCliente();
	ClienteDTOResponse obtenerClienteId(Integer id);

}
