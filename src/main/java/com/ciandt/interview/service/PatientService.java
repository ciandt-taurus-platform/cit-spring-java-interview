package com.ciandt.interview.service;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class PatientService {

  @Inject
  private PatientIdGenerator patientIdGenerator;

  public String getPatientId() {
    return this.patientIdGenerator.someFancyIdGeneration();
  }

  public void setPatientIdGenerator(PatientIdGenerator patientIdGenerator) {
    this.patientIdGenerator = patientIdGenerator;
  }
}
