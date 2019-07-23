package cl.roisel.micro.app.productos.models.service;

import java.util.List;

import cl.roisel.micro.app.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	
}
