package com.example.response;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class SubjectResponse {
    Long id;
    String subject;
    Double marks; // will be float in schema
}
