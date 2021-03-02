package com.example.consumer.listener;

import com.example.consumer.controller.ProductController;
import com.example.consumer.model.Id;
import com.example.consumer.model.Product;
import com.example.consumer.repository.ProductRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    ProductRepository productRepository;

    @KafkaListener(topics = "Kafka_Example_product", groupId = "group_json",
            containerFactory = "productKafkaListenerFactory")
    public void consumeJson(Product product)  {
        productRepository.save(product);
    }

}
