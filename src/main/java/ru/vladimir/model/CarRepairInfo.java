package ru.vladimir.model;

public class CarRepairInfo implements BaseEntity<Long> {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }
}
