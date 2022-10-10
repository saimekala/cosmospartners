package com.cosmos.meetingapi.model;

import com.cosmos.meetingapi.request.MeetingRequest;
import com.sun.tools.javac.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Meeting")
public class Meeting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="title")
	private String meetingTitle;
	
	@Column(name="timestamp")
	private String timeStamp;
	
	@Column(name="duration")
	private int duration;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "meeting_Id",referencedColumnName = "id")
	private List<Decision> decisions;
		

	public List<Decision> getDecisions() {
		return decisions;
	}

	public void setDecisions(List<Decision> decisions) {
		this.decisions = decisions;
	}

	public Meeting(MeetingRequest req) {
		
		this.meetingTitle = req.getTitle();
		this.timeStamp = req.getTimeStamp();
		this.duration = req.getDuration();
	}

	public String getMeetingTitle() {
		return meetingTitle;
	}

	public void setMeetingTitle(String meetingTitle) {
		this.meetingTitle = meetingTitle;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
