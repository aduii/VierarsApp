package com.opensource.vierarsapp.models;

import java.io.Serializable;

public class Userlogin implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;



    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Userlogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    


}
