package com.project.hackerpoll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hackerpoll.model.Skills;
import com.project.hackerpoll.service.SkillService;


@RestController
@RequestMapping("/info")
public class SkillController {
	
	@Autowired
	SkillService skillService;
	
	@GetMapping("")
	public List<Skills> getAllSkill() {
		return skillService.getAllSkills();
	}
	
	@PostMapping("")
	public void postSkill(@RequestBody Skills skill) {
		skillService.saveSkill(skill);
	}
	
	@DeleteMapping("/{name}")
	public void deleteSkill(@PathVariable("id") int id) {
		skillService.deleteSkill(id);
	}
}
