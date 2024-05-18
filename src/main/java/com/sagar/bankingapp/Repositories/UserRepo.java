package com.sagar.bankingapp.Repositories;

import com.sagar.bankingapp.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);


    Boolean existsByAccountNumber(String accountNumber);
    User findByAccountNumber(String accountNumber);
}
