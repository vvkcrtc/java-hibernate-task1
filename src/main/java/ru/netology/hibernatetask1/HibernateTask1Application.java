package ru.netology.hibernatetask1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateTask1Application {

    public static void main(String[] args) {
        SpringApplication.run(HibernateTask1Application.class, args);
    }

}
//public class HibernateTask1Application implements CommandLineRunner {
//    @PersistenceContext
//    EntityManager entityManager;
//    public static void main(String[] args) {
//
//        SpringApplication app = new SpringApplication(CommandLineRunner.class);
//        app.run(args);
//    }
//    @Transactional
//    @Override
//    public void run(String... args) {
////          List<City> cities = new ArrayList<>();
////        cities.add(City.builder().name("Moscow").build());
////        cities.add(City.builder().name("Orel").build());
////        cities.add(City.builder().name("Novokuznetsk").build());
//        //entityManager.persist(cities.get(1));
//        //cities.forEach(city -> entityManager.persist(city));
//
//    }
//
//
//}