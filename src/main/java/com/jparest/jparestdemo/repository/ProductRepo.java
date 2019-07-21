package com.jparest.jparestdemo.repository;

import com.jparest.jparestdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
