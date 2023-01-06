package de.maxkorte.employeer.database.mapper;

import de.maxkorte.employeer.Unit;
import de.maxkorte.employeer.database.datatransfer.UnitDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = EmployeeMapper.class)
public interface UnitMapper {
    UnitDTO toDTO(Unit unit);
    Set<UnitDTO> toDTOSet(Set<Unit> units);
    Unit toDomain (UnitDTO unitDTO);
    Set<Unit> toDomainSet (Set<UnitDTO> unitDTOs);
}
