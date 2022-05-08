package com.wipro.Epassport.Entity;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "email" })})
public class Epassport {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private long telephoneNumber;
    @Column(nullable = false)
    private String email;
    private String password;

    public Epassport(String firstName, String lastName, long telephoneNumber, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.password = password;
    }

    public Epassport()
    {

    }

    public Epassport(String email, String password) {
        this.email = email;
        this.password = password;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
