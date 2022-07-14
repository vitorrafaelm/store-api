package com.learningSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningSpring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
