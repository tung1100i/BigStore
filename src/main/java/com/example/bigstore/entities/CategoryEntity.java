package com.example.bigstore.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Category")
public class CategoryEntity  implements Serializable,Comparable<CategoryEntity> {
    @Id
    @Column(name = "categoryid")
    private String categoryid;
    private String name;

    @Override
    public int compareTo(CategoryEntity o) {
        return  (this.categoryid.compareTo(o.getCategoryid()));
    }
}
