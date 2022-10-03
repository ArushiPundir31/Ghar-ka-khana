package com.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gharkakhana.entity.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, String>  {

	Admin findBymailId(String mailId);

}
