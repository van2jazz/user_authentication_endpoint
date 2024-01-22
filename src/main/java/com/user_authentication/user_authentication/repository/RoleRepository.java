package com.user_authentication.user_authentication.repository;


import com.user_authentication.user_authentication.models.ERole;
import com.user_authentication.user_authentication.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
