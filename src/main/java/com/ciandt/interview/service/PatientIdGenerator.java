package com.ciandt.interview.service;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PatientIdGenerator {

  private String cachedId;

  public String someFancyIdGeneration() {

    if(cachedId == null) {
      cachedId = UUID.randomUUID().toString();
    }
    return cachedId;
  }

}
