package week03classicmodels.persistence;

import week03classicmodels.business.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAllProducts();
}
