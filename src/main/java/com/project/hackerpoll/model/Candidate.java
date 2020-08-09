package com.project.hackerpoll.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="candidate")
public class Candidate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="name")
	private String name;

	@Column(name = "expert_level")
	private String expertiseLevel;

	@Column(name = "challenges")
	private String challengesSolved;
	
	@Column(name = "votes")
	private int votes;
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Candidate candidate;

	public int getId() {
		return id;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpertiseLevel() {
		return expertiseLevel;
	}

	public void setExpertiseLevel(String expertiseLevel) {
		this.expertiseLevel = expertiseLevel;
	}

	public String getChallengesSolved() {
		return challengesSolved;
	}

	public void setChallengesSolved(String challengesSolved) {
		this.challengesSolved = challengesSolved;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", expertiseLevel=" + expertiseLevel + ", challengesSolved="
				+ challengesSolved + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((challengesSolved == null) ? 0 : challengesSolved.hashCode());
		result = prime * result + ((expertiseLevel == null) ? 0 : expertiseLevel.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		if (challengesSolved == null) {
			if (other.challengesSolved != null)
				return false;
		} else if (!challengesSolved.equals(other.challengesSolved))
			return false;
		if (expertiseLevel == null) {
			if (other.expertiseLevel != null)
				return false;
		} else if (!expertiseLevel.equals(other.expertiseLevel))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
}
