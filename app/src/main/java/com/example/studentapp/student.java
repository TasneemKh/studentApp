package com.example.studentapp;

public class student {
    String id ;
    String name ;
    String level;
    String avg;
    public student(String id, String name, String level, String avg) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

}
