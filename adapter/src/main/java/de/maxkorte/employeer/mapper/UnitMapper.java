package de.maxkorte.employeer.mapper;

import de.maxkorte.employeer.Unit;
import de.maxkorte.employeer.dto.UnitDTO;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper
public interface UnitMapper {
    UnitDTO toDTO(Unit unit);
    Set<UnitDTO> toDTOSet(Set<Unit> units);
    Unit toDomain (UnitDTO unitDTO);
    Set<Unit> toDomainSet (Set<UnitDTO> unitDTOs);
}