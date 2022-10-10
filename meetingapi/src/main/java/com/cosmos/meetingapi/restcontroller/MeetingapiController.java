package com.cosmos.meetingapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cosmos.meetingapi.model.Decision;
import com.cosmos.meetingapi.model.Meeting;
import com.cosmos.meetingapi.repository.DecisionRepository;
import com.cosmos.meetingapi.repository.MeetingRepository;
import com.cosmos.meetingapi.request.DecisionRequest;
import com.cosmos.meetingapi.request.MeetingRequest;


@RestController
public class MeetingapiController {
	
	@Autowired
	private MeetingRepository meetingrepository;
	
	@Autowired
	private DecisionRepository decisionrepository;
	
	
	@PostMapping("/createDecision")
	public void createDecision(@RequestBody DecisionRequest req)
	{
		decisionrepository.save(new Decision(req));
		
				
	}
	
	@PostMapping("/createMeeting")
	public void createMeeting(@RequestBody MeetingRequest meetingreq)
	{
		meetingrepository.save(new Meeting(meetingreq));
	}
//	
//	@GetMapping("/getMeetingDecisions")
//	{
//		yet to implement it
//	}
	
	
}
