package Step.OOP.inkopsulation.Group;

import java.util.GregorianCalendar;


/**
 *
 3.	Реализовать класс Student, который содержит поля для хранения фамилии, имени, отчества, даты рождения,
 домашнего адреса, телефонного номера.
 Также за каждым студентом закреплены 3 массива оценок – зачёты, курсовые работы, экзамены.
 Обязательные методы: 2-3 версии конструктора с параметрами, геттеры и сеттеры для всех полей, показ всех данных о студенте.

 */
class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String nubmer;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNubmer() {
        return nubmer;
    }

    public void setNubmer(String nubmer) {
        this.nubmer = nubmer;
    }
}

public class Student {
    private String firmname;
    private String lastname;
    private String fathername;

    private GregorianCalendar birthdate;
    private Adress address;
    String telnubmer;

    public String getFirmname() {
        return firmname;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public GregorianCalendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(GregorianCalendar birthdate) {
        this.birthdate = birthdate;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }


    public static void main(String[] args) {
        Adress a = new Adress();
        a.setCity("Odessa");
        a.setCountry("Ukrain");
        a.setNubmer("3");
        a.setRegion("Odesskaya");
        Student s = new Student();

    }
}