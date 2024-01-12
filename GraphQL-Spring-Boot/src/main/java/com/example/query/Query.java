package com.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.request.SampleRequest;
import com.example.response.StudentResponse;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	StudentService studentService;

	public String firstQuery () {
		return "First Query";
	}

	public String secondQuery () {
		return "Second Query";
	}

	public String fullName (SampleRequest sampleRequest) {
		return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
	}

	/**
	 * query {
	 *   student(id: 4){
	 *     id
	 *     name
	 *     subjects{
	 *       id
	 *       subject
	 *       marks
	 *     }
	 *   }
	 * }
	 *
	 * Response
	 * {
	 *   "data": {
	 *     "student": {
	 *       "id": 4,
	 *       "name": "pks",
	 *       "subjects": [
	 *         {
	 *           "id": 1,
	 *           "subject": "sub1",
	 *           "marks": 1
	 *         },
	 *         {
	 *           "id": 2,
	 *           "subject": "sub2",
	 *           "marks": 1
	 *         }
	 *       ]
	 *     }
	 *   }
	 * }
	 */
	public StudentResponse getStudent (Long id) {
		return studentService.getStudent(id);
	}
}
