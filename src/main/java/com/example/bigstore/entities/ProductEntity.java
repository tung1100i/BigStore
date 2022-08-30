package com.example.bigstore.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class ProductEntity implements Serializable, Comparable<ProductEntity> {
    @Id
    @Column(name = "productid", insertable = false, updatable = false)
    private Long productid;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;

    @ManyToOne()
    @JoinColumn(name = "categoryid",referencedColumnName = "categoryid")
    private CategoryEntity categoryid;

    @Override
    public int compareTo(ProductEntity o) {
        return (int) (this.productid - o.getProductid());
    }

}
