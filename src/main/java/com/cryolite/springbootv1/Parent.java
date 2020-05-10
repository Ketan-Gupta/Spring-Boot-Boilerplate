package com.cryolite.springbootv1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Parent {
    private int index;
    private String role;

    public Parent()
    {
        super();
        System.out.println("Constructor Called");
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
