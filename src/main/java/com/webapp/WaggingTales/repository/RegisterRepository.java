package com.webapp.WaggingTales.repository;

import com.webapp.WaggingTales.entity.RegisterEntity;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegisterRepository extends JpaRepository<RegisterEntity, String> {
    void deleteById(@NotNull String useremail);
}