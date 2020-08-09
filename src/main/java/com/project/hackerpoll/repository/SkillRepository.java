package com.project.hackerpoll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hackerpoll.model.Skills;


public interface SkillRepository extends JpaRepository<Skills, Integer>{

	Skills findById(int id);
	
}
