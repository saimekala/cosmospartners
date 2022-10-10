package com.cosmos.meetingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmos.meetingapi.model.Decision;

public interface DecisionRepository extends JpaRepository<Decision, Long> {

}
