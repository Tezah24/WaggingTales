package com.webapp.WaggingTales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dog_owner_register")
public class RegisterEntity {
    private String firstname;
    private String lastName;
    @Id
    private String userEmail;

    public RegisterEntity() {
    }

    public RegisterEntity(String firstname, String lastName, String useremail) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.userEmail = useremail;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}

