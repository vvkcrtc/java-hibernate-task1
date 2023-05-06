create schema if not exists netology;


CREATE TABLE IF NOT EXISTS netology.Persons
(
    name VARCHAR(120),
    surname VARCHAR(120),
    age INTEGER,
    phone_number VARCHAR(40),
    city_of_living VARCHAR(120),
    PRIMARY KEY (name, surname, age)
);

