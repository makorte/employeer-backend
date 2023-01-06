package de.maxkorte.employeer.database.implementation;

import de.maxkorte.employeer.Unit;
import de.maxkorte.employeer.database.dataaccess.UnitDAO;
import de.maxkorte.employeer.database.mapper.UnitMapper;
import de.maxkorte.employeer.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UnitRepositoryImpl implements UnitRepository {
    private final UnitDAO unitDAO;
    private final UnitMapper unitMapper;

    @Override
    public Unit createUnit(Unit unit) {
        return unitMapper.toDomain(unitDAO.save(unitMapper.toDTO(unit)));
    }

    @Override
    public Unit getUnitById(UUID id) {
        return unitMapper.toDomain(unitDAO.findById(id).orElse(null));
    }

    @Override
    public Unit updateUnit(Unit unit) {
        return unitMapper.toDomain(unitDAO.save(unitMapper.toDTO(unit)));
    }

    @Override
    public void removeUnit(UUID id) {
        unitDAO.deleteById(id);
    }
}
