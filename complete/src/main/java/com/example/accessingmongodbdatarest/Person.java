package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;
//POJO class

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@Id private String id;

	private String firstName;
	private String lastName;
}
