package week02classicmodels.persistence;

import week02classicmodels.business.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAllProducts();
}
