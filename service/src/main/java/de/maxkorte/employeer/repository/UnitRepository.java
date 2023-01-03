package de.maxkorte.employeer.repository;

import de.maxkorte.employeer.Unit;

import java.util.UUID;

public interface UnitRepository {
    Unit createUnit(Unit unit);
    Unit getUnitById(UUID id);
    Unit updateUnit(Unit unit);
    void removeUnit(UUID id);
}
