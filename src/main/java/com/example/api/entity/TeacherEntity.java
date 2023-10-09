package com.example.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name="teachers")
@Entity(name="teachers")
@EqualsAndHashCode(of="id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = true)
    private String entoll; //Matricula

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String avatar;


//    public Product(ProductResponseDTO requestProduct){
//        this.title = requestProduct.title();
//        this.image = requestProduct.image();
//        this.price = requestProduct.price();
//    }

}
