package com.example.ReadXLSFile.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Customer {
    @Id
    private Integer ID;
    private String firstName;
    private String lastName;
    private String country;
    private Integer telephone;
}
