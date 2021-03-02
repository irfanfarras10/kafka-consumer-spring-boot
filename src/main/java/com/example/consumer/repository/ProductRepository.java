package com.example.consumer.repository;

import com.example.consumer.model.Id;
import com.example.consumer.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends MongoRepository<Product, Id> {

}
