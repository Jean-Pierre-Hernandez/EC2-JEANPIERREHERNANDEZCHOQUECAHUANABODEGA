package com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ProductosDTORequest;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.dto.ProductosDTOResponse;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.model.Productos;
import com.idat.EC2JEANPIERREHERNANDEZCHOQUECAHUANABODEGA.repository.ProductosRepository;



@Service
public class ProductosServiceImpl implements ProductosService{
	
	@Autowired
	private ProductosRepository repository;

	@Override
	public void guardarProductos(ProductosDTORequest productos) {
		
		Productos p = new Productos();
		p.setProducto(productos.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());
		repository.save(p);
		
	}

	@Override
	public void actualizarProductos(ProductosDTORequest productos) {
		// TODO Auto-generated method stub
		
		Productos p = new Productos();
		p.setProducto(productos.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());
		
		repository.saveAndFlush(p);
		
	}

	@Override
	public void eliminarProductos(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<ProductosDTOResponse> listarProductos() {
		
		List<ProductosDTOResponse> listar = new ArrayList<>();
		ProductosDTOResponse dto = null;
		
		List<Productos> p = repository.findAll();
		
		for (Productos productos : p) {
			
			dto = new ProductosDTOResponse();
			
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setNombre(productos.getProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setId(productos.getIdProducto());
			
			listar.add(dto);
		
		}
		return listar;
			
	}

	@Override
	public ProductosDTOResponse obtenerProductosId(Integer id) {
		Productos productos = repository.findById(id).orElse(null);
		ProductosDTOResponse dto = new ProductosDTOResponse();
		
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setNombre(productos.getProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setId(productos.getIdProducto());
		
		return dto;
	}

}
