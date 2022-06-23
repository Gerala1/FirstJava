package com.example.demo.ENTITIES;

public class SPID {
    private long id;
    private USER user;
    private String description;

    public SPID(int i, USER firstUser, Status pending, String sSspo){

    }

    public SPID(long id, USER user, String description) {
        this.id = id;
        this.user = user;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public USER getUser() {
        return user;
    }

    public void setUser(USER user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status approved) {
    }

    public void setDescripton(String leggo) {
    }

    public String getDescripton() {
        return getDescripton();
    }

    public String getStatus() {
        return getStatus();
    }

}
