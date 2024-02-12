package org.guru.fakestore.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    Long id;
    String title;
    int price;
    String description;
    String category;
    String image;

}
