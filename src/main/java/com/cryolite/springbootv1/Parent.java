package com.cryolite.springbootv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Parent {
    @Autowired
    @Qualifier("inject")
    // For Injection the component tag was given "inject" as the name of the object that we want.
    // Qualifier will have to be used to procure the object with that name, since default autowiring
    // will search for object of default name i.e injection with first letter small i.
    private Injection injection;

    private int index;
    private String role;

    public Injection getInjection() {
        return injection;
    }

    public void setInjection(Injection injection) {
        this.injection = injection;
    }

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

    public void runner(){
        injection.setTracker(20);
        System.out.println("Parent Runner-Triggered");
        System.out.println(injection.toString());
    }

}
