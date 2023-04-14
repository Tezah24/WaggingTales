package com.webapp.WaggingTales.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name="dog_owner_register")
public class RegisterBean {

    private String firstname;
    private String lastname;
    @Id
    private String useremail;

    public RegisterBean(){
        super();
    }
    public RegisterBean(String firstname, String lastname, String useremail){
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.useremail = useremail;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
}

