package ru.netology.hibernatetask1.service;

import org.springframework.stereotype.Service;
import ru.netology.hibernatetask1.repository.DataRepository;
import ru.netology.hibernatetask1.repository.Person;

import java.util.List;

@Service
public class DataService {
    DataRepository repository;

    public DataService(DataRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {

        return repository.getPersonsByCity(city);

    }

}
