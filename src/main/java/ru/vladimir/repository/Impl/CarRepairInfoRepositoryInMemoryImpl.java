package ru.vladimir.repository.Impl;

import ru.vladimir.model.CarRepairInfo;
import ru.vladimir.repository.BaseCrudRepository;

import java.util.List;

/**
 * Делаешь все аналогично с CarRepository
 */
public class CarRepairInfoRepositoryInMemoryImpl implements BaseCrudRepository<CarRepairInfo, Long> {
    @Override
    public CarRepairInfo findById(Long aLong) {
        return null;
    }

    @Override
    public List<CarRepairInfo> findAll() {
        return List.of();
    }

    @Override
    public void save(CarRepairInfo carRepairInfo) {

    }

    @Override
    public void delete(CarRepairInfo carRepairInfo) {

    }

    @Override
    public CarRepairInfo update(CarRepairInfo carRepairInfo) {
        return null;
    }
}
