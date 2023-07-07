package com.example.api.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name="products")
@EqualsAndHashCode(of="id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String title;
    private String image;
    private Integer price;

    public Product(RequestProduct requestProduct){
        this.title = requestProduct.title();
        this.image = requestProduct.image();
        this.price = requestProduct.price();
    }

}
