package de.maxkorte.employeer.service;

import de.maxkorte.employeer.Unit;
import de.maxkorte.employeer.repository.UnitRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class UnitService {
    private final UnitRepository unitRepository;

    public Unit createUnit(Unit unit) {
        return unitRepository.createUnit(unit);
    }

    public Unit getUnit(UUID id) {
        return unitRepository.getUnitById(id);
    }

    public Unit updateUnit(Unit unit) {
        return unitRepository.updateUnit(unit);
    }

    public void removeUnit(UUID id) {
        unitRepository.removeUnit(id);
    }
}
