package fr.saidwebdev.demo.service;

import fr.saidwebdev.demo.dao.PersonDao;
import fr.saidwebdev.demo.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
