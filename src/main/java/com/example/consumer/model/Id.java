package com.example.consumer.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class Id implements Serializable {
    private String storeId;
    private String skuSeller;
}
