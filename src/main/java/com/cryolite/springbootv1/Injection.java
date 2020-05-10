package com.cryolite.springbootv1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inject")
public class Injection {
    private int tracker;
    private String value;

    public Injection() {
        super();
    }

    public int getTracker() {
        return tracker;
    }

    public void setTracker(int tracker) {
        this.tracker = tracker;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Injection{" +
                "tracker=" + tracker +
                ", value='" + value + '\'' +
                '}';
    }
}
