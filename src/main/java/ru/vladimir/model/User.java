package ru.vladimir.model;

public class User implements BaseEntity<Long> {
    private Long id;

    @Override
    public Long getId() {
        return id;
    }
}
