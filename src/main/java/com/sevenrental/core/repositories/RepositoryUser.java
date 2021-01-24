package com.sevenrental.core.repositories;

import com.sevenrental.core.models.users.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RepositoryUser extends CrudRepository<User, Long> /* or extends JpaRepository */{
    Optional<User> findByEmail(String email);
}
