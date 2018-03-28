package com.example.guest.chatapp.models;

import org.parceler.Parcel;

/**
 * Created by Guest on 3/28/18.
 */
@Parcel
public class Users {
    String name;
    String id;
    String email;



    public Users() {}

    public Users(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
