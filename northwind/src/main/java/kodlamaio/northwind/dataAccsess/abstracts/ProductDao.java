package kodlamaio.northwind.dataAccsess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer>, List<Product> {

    List<Product> getAll();
}
