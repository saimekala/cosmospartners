package com.cosmos.meetingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmos.meetingapi.model.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Long>{

}
