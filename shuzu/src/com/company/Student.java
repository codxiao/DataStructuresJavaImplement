package com.company;

public class Student {
    private int id;
    private int scors;

    public Student(int id, int scors) {
        this.id = id;
        this.scors = scors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScors() {
        return scors;
    }

    public void setScors(int scors) {
        this.scors = scors;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", scors=" + scors +
                '}';
    }
}
