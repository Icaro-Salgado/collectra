package com.collectra.backend.infrastructure.repository.collector;

import com.collectra.backend.infrastructure.entity.CollectorEntity;
import com.collectra.backend.infrastructure.repository.CrudRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectorRepository extends CrudRepository<CollectorEntity, UUID> {}
