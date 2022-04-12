package ru.gb.javaspringboothome.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Integer id;
    private String title;
    private Double price;
}
