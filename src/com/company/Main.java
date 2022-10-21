package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Daniyar");
        Person person1 = new Person("Marat");
        Person person2 = new Person("Samat");

        Person [] persons = new Person[]{person};
        Person [] persons1 = new Person[]{person1};
        Person [] persons2 = new Person[]{person2};

        Family family = new Family(persons);
        System.out.println(family);
        Flat flat = new Flat("Melnikova 3: ", new Family[]{family});
        System.out.print (flat);
        flat.pay();
        System.out.println();

        Family family1 = new Family(persons1);
        System.out.println(family1);
        Hotel hotel = new Hotel("Ordynka 40: ", new Family[]{family1});
        System.out.println(hotel);
        hotel.pay();
        System.out.println();

        Family family2 = new Family(persons2);
        System.out.println(family2);
        Hostel hostel = new Hostel("Volgogradskiy prospekt 111: ", new Family[]{family2});
        System.out.println(hostel);
        hostel.pay();




    }
}