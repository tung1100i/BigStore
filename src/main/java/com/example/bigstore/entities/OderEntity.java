package com.example.bigstore.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Oder")
public class OderEntity implements Serializable, Comparable<OderEntity> {
    @Id
    @Column(name = "oderid")
    private Long oderid;

    @Column(name = "createdate")
    private String createdate;

    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn(name = "username",referencedColumnName = "username")
    private AccountEntity username;

    @Override
    public int compareTo(OderEntity o) {
        return (int) (this.oderid-o.getOderid());
    }
}
