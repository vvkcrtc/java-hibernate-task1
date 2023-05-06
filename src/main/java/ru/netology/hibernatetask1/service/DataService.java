package ru.netology.hibernatetask1.service;

import org.springframework.stereotype.Service;
import ru.netology.hibernatetask1.repository.DataRepository;


import java.sql.SQLException;
import java.util.List;

@Service
public class DataService {
    DataRepository repository;

    public DataService(DataRepository repository) {
        this.repository = repository;
    }

    public List<String> getOrders(String city) throws SQLException {
        System.out.println("Customer : " + city);
        return repository.getPersonsByCity(city);

    }

}
