package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Role;
import com.tracking.model.Users;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
