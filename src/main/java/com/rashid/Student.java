package com.rashid;

import java.util.StringJoiner;

public class Student {
    private String name;
    private boolean absent;

    public Student(String name) {
        this.name = name;
        absent = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAbsent() {
        return absent;
    }

    public void setAbsent(boolean absent) {
        this.absent = absent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", absent=" + absent +
                '}';
    }
}
