package ru.netology.hibernatetask1.repository;
//import javax.persistence.PersistenceContext;
//import javax.persistence.EntityManager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
 public class DataRepository  {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void add() {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(new NameId("name1","surname1",22),"1111111","Moscow"));
        persons.add(new Person(new NameId("name2","surname2",22),"2222222","Moscow"));
        persons.add(new Person(new NameId("name3","surname3",22),"3333333","Moscow"));

        for(Person p : persons) {
            entityManager.persist(p);
        }
        //persons.forEach(person -> entityManager.persist(person));
    }
    public DataRepository() {

        add();
    }


    public List<String> getPersonsByCity(String city) {

//        String sql = "select * from Person where city_of_living=:city";
//        var query = entityManager.createQuery(sql);
//        query.setParameter("city",city);
//        var persons = query.getResultList();
//
//        return persons;
        return null;

    }


}
