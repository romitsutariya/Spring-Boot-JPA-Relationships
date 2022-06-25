package com.example.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateStudentRequest {
	
	private Long id;
	
	private String firstName;

	private String lastName;

	private String email;

}
