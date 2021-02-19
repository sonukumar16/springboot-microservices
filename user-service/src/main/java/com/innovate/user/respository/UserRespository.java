package com.innovate.user.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovate.user.entity.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

	Optional<User> findByUserId(Long userId);
}
