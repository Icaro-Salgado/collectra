package com.collectra.backend.core.dao;

import java.util.Optional;

public interface BaseDao<T, ID> {
  T create(T input);

  Optional<T> getById(ID id);
}
