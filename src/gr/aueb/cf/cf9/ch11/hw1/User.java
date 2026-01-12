package gr.aueb.cf.cf9.ch11.hw1;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class User {

    //Private Instances
    private long id;
    private String firstname;
    private String lastname;

    //Default Constructor
    public User() {

    }

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString () {
        return "{ " + getId() + ", " + getFirstname() + ", " + getLastname() + " }";
    }
}





