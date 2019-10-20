package fr.saidwebdev.demo.dao;

import fr.saidwebdev.demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> DB= new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public int addPerson(Person person) {
        return 0;
    }
}
