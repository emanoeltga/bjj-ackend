package com.correia.bjj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correia.bjj.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	public Users findByLogin(String login);
}
