package com.cosmos.meetingapi.request;

import org.springframework.stereotype.Component;

@Component
public class MeetingRequest {
	
	private String title;
	private String timeStamp;
	private int duration;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timestamp) {
		this.timeStamp = timestamp;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
