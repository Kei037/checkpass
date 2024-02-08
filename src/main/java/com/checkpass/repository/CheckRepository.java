package com.checkpass.repository;

import com.checkpass.domain.CheckPass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<CheckPass, Long> {
}
