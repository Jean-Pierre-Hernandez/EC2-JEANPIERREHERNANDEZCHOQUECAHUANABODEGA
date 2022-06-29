package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.service;

import java.util.List;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ProductosDTORequest;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ProductosDTOResponse;

public interface ProductosService {
	
	void guardarProductos(ProductosDTORequest productos);
	void actualizarProductos(ProductosDTORequest productos);
	void eliminarProductos(Integer id);
	List<ProductosDTOResponse> listarProductos();
	ProductosDTOResponse obtenerProductosId(Integer id);

}
