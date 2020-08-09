package com.project.hackerpoll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hackerpoll.model.Skills;
import com.project.hackerpoll.repository.SkillRepository;

@Service
public class SkillService {

	@Autowired 
	SkillRepository skillRepository;
	
	public void saveSkill(Skills skill) {
		skillRepository.save(skill);
	}
	
	public List<Skills> getAllSkills() {
		return skillRepository.findAll();
	}
	
	public void deleteSkill(int id) {
		skillRepository.delete(skillRepository.findById(id));
	}
}
