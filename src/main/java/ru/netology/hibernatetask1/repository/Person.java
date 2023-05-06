package ru.netology.hibernatetask1.repository;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;
import org.springframework.data.annotation.Id;



@Table(name="persons")
@Entity
public class Person {
    @Id
    @EmbeddedId
    private NameId id;
    private String phone_number;
    private String city_of_living;


    public Person() {

    }

    public Person(NameId id, String phone_number, String city_of_living) {
        this.id = id;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }
}
