package com.company;

import java.util.Arrays;

public  class Family {

    public Person [] people;

    public Family(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Family " +
                "people - " + Arrays.toString(people);
    }
}
