package com.example;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;

/**
 * Created by fanzhengchen on 2/6/16.
 */
public class Person {

    @Id
    private String id;

    private String firstName;
    private String lastName;

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
}
