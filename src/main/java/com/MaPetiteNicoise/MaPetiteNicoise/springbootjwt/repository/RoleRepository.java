package com.MaPetiteNicoise.MaPetiteNicoise.springbootjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MaPetiteNicoise.MaPetiteNicoise.springbootjwt.models.ERole;
import com.MaPetiteNicoise.MaPetiteNicoise.springbootjwt.models.Role;


import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}