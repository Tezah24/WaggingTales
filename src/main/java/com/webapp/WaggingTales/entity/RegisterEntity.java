package com.webapp.WaggingTales.entity;
//
//
import jakarta.persistence.*;
//
//@Entity
//@Table(name = "register")
//public class RegisterEntity {
//
//    @Id
//    @Column(name = '')
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column()
//    private String firstname;
//
//    private String lastname;
//
//    private String emailname;
//
//    // Constructors, getters, and setters
//}

//package com.webapp.WaggingTales.entity;

       // import jakarta.persistence.*;

//@Entity
//@Table(name = "register")
//public class RegisterEntity {
//
//    @Id
//    @Column(name = "")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column()
//    private String firstname;
//
//    @Column()
//    private String lastname;
//
//    @Column()
//    private String emailname;
//
//    public RegisterEntity() {}
//
//    public RegisterEntity(String firstname, String lastname, String emailname) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.emailname = emailname;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getEmailname() {
//        return emailname;
//    }
//
//    public void setEmailname(String emailname) {
//        this.emailname = emailname;
//    }
//
//    @Override
//    public String toString() {
//        return "RegisterEntity{" +
//                "id=" + id +
//                ", firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", emailname='" + emailname + '\'' +
//                '}';
//    }
//}



//vishnu code
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//////last code
//@Entity
//@Table(name = "dog_owner_register")
//
//public class RegisterEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "first_name")
//    @JsonProperty("firstName")
//    private String firstName;
//
//    @Column(name = "last_name")
//    @JsonProperty("lastName")
//    private String lastName;
//
//    @Column(name = "user_email")
//    @JsonProperty("userEmail")
//    private String userEmail;
//
//
//    public RegisterEntity() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getUserEmail() {
//        return userEmail;
//    }
//
//    public void setUserEmail(String userEmail) {
//        this.userEmail = userEmail;
//    }
//
//}
//
//@Entity
//@Table(name = "dog_owner_register")
//public class RegisterEntity {
//
//    @Id
//    @Column(name = "user_email")
//    private String userEmail;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;
//
//    @Column(name = "register_password")
//    private String registerPassword;
//
//    public RegisterEntity() {}
//
//    public RegisterEntity(String userEmail, String firstName, String lastName, String registerPassword) {
//        this.userEmail = userEmail;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.registerPassword = registerPassword;
//    }
//
//    public String getUserEmail() {
//        return userEmail;
//    }
//
//    public void setUserEmail(String userEmail) {
//        this.userEmail = userEmail;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getRegisterPassword() {
//        return registerPassword;
//    }
//
//    public void setRegisterPassword(String registerPassword) {
//        this.registerPassword = registerPassword;
//    }
//
//    @Override
//    public String toString() {
//        return "RegisterEntity{" +
//                "userEmail='" + userEmail + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", registerPassword='" + registerPassword + '\'' +
//                '}';
//    }
//}


