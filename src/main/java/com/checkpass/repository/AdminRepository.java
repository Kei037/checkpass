package com.checkpass.repository;

import com.checkpass.domain.Admin;
import com.checkpass.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
