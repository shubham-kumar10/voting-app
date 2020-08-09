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

import com.project.hackerpoll.model.Candidate;
import com.project.hackerpoll.service.CandidateService;

@RestController
@RequestMapping("/candidates")
public class CandidateController {
	
	@Autowired
	CandidateService candidateService;

	@GetMapping("/{id}")
	public Candidate getCandidate(@PathVariable("id") int id) {
		return candidateService.getCandidate(id);
	}
	
	@GetMapping("")
	public List<Candidate> getAllCandidate() {
		return candidateService.getAllCandidate();
	}
	
	@PostMapping("")
	public void postCandidate(@RequestBody Candidate data) {
		candidateService.saveCandidate(data);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCandidate(@PathVariable("id") int id) {
		candidateService.deleteCandidate(id);
	}
	
	@PostMapping("/{id}")
	public boolean castVote(@PathVariable("id") int id) {
		return candidateService.castVote(id);
	}
}
