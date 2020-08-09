package com.project.hackerpoll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hackerpoll.model.Candidate;
import com.project.hackerpoll.repository.CandidateRepository;

@Service
public class CandidateService {
	
	@Autowired
	CandidateRepository candidateRepository;

	public Candidate getCandidate(int id) {
		return candidateRepository.findById(id);
	}

	public List<Candidate> getAllCandidate() {
		return candidateRepository.findAll();
	}

	public void saveCandidate(Candidate data) {
		candidateRepository.save(data);
	}

	public void deleteCandidate(int id) {
		candidateRepository.deleteById(id);		
	}

	public boolean castVote(int id) {
		Candidate data = candidateRepository.findById(id);
		data.setVotes(data.getVotes() + 1);
		candidateRepository.save(data);
		return true;
	}

}
