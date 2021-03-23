package com.example.proareatesttask.model;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Product> products;
    @ManyToOne
    private User user;
}
