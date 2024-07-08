package org.Masri.SimpleRest;

import java.io.Serializable;

public class UserLogin implements Serializable {
    public String name;
    public String Password;
    public String CountryName;
    public int ContactNumber;

    public UserLogin() {

    }

    public UserLogin(String User_Name,String password,String Country,int Contact ) {
        this.name = User_Name;
        this.Password = password;
        this.CountryName = Country;
        this.ContactNumber = Contact;
        System.out.print("Congratulation! Account has been Created\n");

    }

    public void setName(String Name) {
        this.name = Name;
    }
    public String getName() {
        return name;
    }
    public void setCountry(String c) {

        this.CountryName = c;
    }
    public String getCountry() {
        return CountryName;
    }
    public void setContact(int e) {
        this.ContactNumber = e;
    }
    public int getContact() {
        return ContactNumber;
    }
    public void setPassWord(String p) {
        this.Password = p;
    }
    public String getPassword() {
        return Password;
    }
}
