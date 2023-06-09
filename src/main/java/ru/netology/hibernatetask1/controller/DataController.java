package ru.netology.hibernatetask1.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatetask1.repository.Person;
import ru.netology.hibernatetask1.service.DataService;


import java.sql.SQLException;
import java.util.List;


@RestController
public class DataController {
    DataService service;

    public DataController(DataService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") @Validated String city) throws SQLException {
        return service.getPersonsByCity(city);
    }
}
