package com.api.contactapp.contactapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String firstName;
    private int age;
    private String photo;
    @OneToMany(mappedBy = "user")
    private Collection<Address> addresses;

}
