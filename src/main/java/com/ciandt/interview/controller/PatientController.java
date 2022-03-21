package com.ciandt.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

  @GetMapping("/patient")
  public String get() {
    return "empty";
  }
}

