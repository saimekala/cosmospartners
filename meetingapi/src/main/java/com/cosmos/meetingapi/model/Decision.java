package com.cosmos.meetingapi.model;

import com.cosmos.meetingapi.request.DecisionRequest;
import com.sun.tools.javac.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Decision")
public class Decision {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Text")
	private String decisionText;
	
	@Column(name="TimeStamp")
	private String timeStamp;
	

	
	public Decision(DecisionRequest req)
	{
		this.decisionText = req.getText();
		this.timeStamp = req.getTimeStamp();
		
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDecisionText() {
		return decisionText;
	}

	public void setDecisionText(String decisionText) {
		this.decisionText = decisionText;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	
}
