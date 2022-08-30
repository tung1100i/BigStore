package com.example.bigstore.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Account")
public class AccountEntity implements Serializable,Comparable<AccountEntity>,Cloneable{

    @Id
    @Column(name = "username")
    private String username;
    private String password;
    private String fullname;
    private int admin;


    @Override
    public int compareTo(AccountEntity o) {
        return this.username.compareTo(o.getUsername());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
