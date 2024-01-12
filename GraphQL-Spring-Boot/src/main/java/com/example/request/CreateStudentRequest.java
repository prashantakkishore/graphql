package com.example.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateStudentRequest {
    private String name;
    private String email;
    private List<CreateSubjectRequest> subjects;
}
