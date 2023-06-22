package org.example.base.model;

public class BaseEntity <ID>{

    protected ID id;

    public BaseEntity() {
    }

    public BaseEntity(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }
    public void setId(ID id){
        this.id=id;

    }
}
