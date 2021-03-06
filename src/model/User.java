package model;

import org.hibernate.validator.constraints.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {
    public static String dropSQL = "Drop table user If Exists Cascade";
    public static String createSQL = "Create table user (" +
            "  id Integer Generated By Default As Identity(Start With 1) primary key," +
            "  user_name Varchar(15) Not Null," +
            "  password Varchar(50) Not Null," +
            "  full_name Varchar(50) Not Null," +
            "  email Varchar(50)" +
            ");";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
    @NotNull
    @Size(min = 2, max = 30)
    public String user_name;
    @NotNull
    public String password;
    @NotNull
    @Size(min = 2, max = 30)
    public String full_name;
    @NotNull
    @Email
    public String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
