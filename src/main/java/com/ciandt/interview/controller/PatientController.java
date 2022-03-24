package com.ciandt.interview.controller;

import com.ciandt.interview.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class PatientController {

  private PatientService patientService;

  @GetMapping("/patient")
  public String get() {
    return patientService.getPatientId();
  }

  @Inject
  public void setPatientService(PatientService patientService) {
    this.patientService = patientService;
  }
}

