package ru.netology.hibernatetask1.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DataRepository implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;

    public DataRepository() {
    }

    @Override
    @Transactional
    public void run(String... args)  {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(new NameId("name1", "surname1", 27), "1111111", "Moscow"));
        persons.add(new Person(new NameId("name2", "surname2", 24), "2222222", "Moscow"));
        persons.add(new Person(new NameId("name3", "surname3", 34), "3333333", "Moscow"));
        persons.add(new Person(new NameId("name4", "surname4", 37), "2223344", "Orel"));
        persons.add(new Person(new NameId("name5", "surname5", 35), "5553333", "Kursk"));
        persons.add(new Person(new NameId("name6", "surname6", 32), "3333333", "Tula"));

        for (Person p : persons) {
            var isExist = entityManager.find(Person.class, p.getId()).equals(p);

            if (!isExist) {
                entityManager.persist(p);
            }
        }

    }


    public List<Person> getPersonsByCity(String city) {
        String jpql = "SELECT p FROM Person p WHERE p.city = :city";
        TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
        query.setParameter("city", city);
        return query.getResultList();
    }


}
