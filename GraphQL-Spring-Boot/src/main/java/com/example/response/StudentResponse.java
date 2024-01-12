package com.example.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    Long id;
    String name;
    String email;
    List<SubjectResponse> subjects;
}
