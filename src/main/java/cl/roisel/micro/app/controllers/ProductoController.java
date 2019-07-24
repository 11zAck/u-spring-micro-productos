package cl.roisel.micro.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.roisel.micro.app.productos.models.entity.Producto;
import cl.roisel.micro.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired private IProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> listar() {
		return productoService.findAll();
	}
	
	@GetMapping("/productos/{id-producto}")
	public Producto detalle( @PathVariable(name = "id-producto") Long id ) {
		return productoService.findById(id);
	}
	
}
