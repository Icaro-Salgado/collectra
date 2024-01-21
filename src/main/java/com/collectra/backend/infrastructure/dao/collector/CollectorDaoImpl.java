package com.collectra.backend.infrastructure.dao.collector;

import com.collectra.backend.core.dao.collector.CollectorDao;
import com.collectra.backend.core.domain.Collector;
import com.collectra.backend.infrastructure.mapper.collector.CollectorEntityMapper;
import com.collectra.backend.infrastructure.repository.collector.CollectorRepository;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CollectorDaoImpl implements CollectorDao {
  private final CollectorRepository repository;

  @Override
  public Collector create(Collector input) {
    final var saved = repository.save(CollectorEntityMapper.INSTANCE.fromDomain(input));

    return CollectorEntityMapper.INSTANCE.toDomain(saved);
  }

  @Override
  public Optional<Collector> getById(UUID uuid) {
    return repository.findById(uuid).map(CollectorEntityMapper.INSTANCE::toDomain);
  }
}
