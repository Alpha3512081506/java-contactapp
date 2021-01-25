package com.api.contactapp.contactapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ville;
    private String province;
    private String email;
    private String telephone;
    private String via;
    @ManyToOne
    private User user;
}