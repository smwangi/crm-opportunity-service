package com.samtec.crm.opportunityservice.common;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
    List<T> fetchAll();
    Optional<T> findById(long id);
    T save(T t);
    void delete(long id);
}
