package ru.vladimir.repository.Impl;

import ru.vladimir.model.Car;
import ru.vladimir.repository.BaseCrudRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryInMemoryImpl implements BaseCrudRepository<Car, Long> {

    private static long id = 0;
    private static final List<Car> cars = new ArrayList<>();


    @Override
    public Car findById(Long id) {
        return cars.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void save(Car car) {
        car.setId(++id);
        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        if (!cars.contains(car)) {
            // в идеале здесь свое исключение EntityNotFoundExecption
            throw new RuntimeException("Автомобиль %s не найден".formatted(car));
        }
        cars.remove(car);
    }

    @Override
    public Car update(Car car) {
        Car carInDB = findById(car.getId());
        if (carInDB == null) {
            // в идеале здесь свое исключение EntityNotFoundExecption
            throw new RuntimeException("Автомобиль %s не найден".formatted(car));
        }

        carInDB.setBrand(car.getBrand());
        carInDB.setModel(car.getModel());
        carInDB.setColor(car.getColor());
        carInDB.setReleaseDate(car.getReleaseDate());

        return carInDB;
    }
}
