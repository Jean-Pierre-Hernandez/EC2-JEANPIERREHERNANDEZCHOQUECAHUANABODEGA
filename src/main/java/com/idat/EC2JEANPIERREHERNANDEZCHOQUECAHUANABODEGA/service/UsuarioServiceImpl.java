package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.UsuarioDTORequest;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.UsuarioDTOResponse;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.model.Usuario;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public void guardarUsuario(UsuarioDTORequest usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuario(UsuarioDTORequest usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UsuarioDTOResponse> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTOResponse obtenerUsuarioId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


}
