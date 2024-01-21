package com.collectra.backend.infrastructure.mapper.collector;

import com.collectra.backend.core.domain.Collector;
import com.collectra.backend.infrastructure.entity.CollectorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CollectorEntityMapper {
  CollectorEntityMapper INSTANCE = Mappers.getMapper(CollectorEntityMapper.class);

  CollectorEntity fromDomain(Collector domain);

  Collector toDomain(CollectorEntity entity);
}
