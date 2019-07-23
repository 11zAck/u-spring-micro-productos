package cl.roisel.micro.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;
import cl.roisel.micro.app.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
