package com.example.springdemo.model;

import java.time.LocalDateTime;

public class User {
    private String name;
    private LocalDateTime localDateTime;

    public User() {}

    public User(String name, LocalDateTime localDateTime) {
        this.name = name;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
