package de.maxkorte.employeer.database.dataaccess;

import de.maxkorte.employeer.database.datatransfer.UnitDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UnitDAO extends JpaRepository<UnitDTO, UUID> {
}
