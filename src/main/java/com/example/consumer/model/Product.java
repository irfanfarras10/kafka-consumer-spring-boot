package com.example.consumer.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Document
public class Product{
	private Id _id;
	private String createdDate;
	private String	 updateDate;
	private boolean active;
	private int stockAvailable;
}
