package com.project.hackerpoll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hackerpoll.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

	Candidate findById(int id);
}
