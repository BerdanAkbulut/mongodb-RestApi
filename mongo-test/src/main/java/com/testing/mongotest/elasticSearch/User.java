package com.testing.mongotest.elasticSearch;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(indexName = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	private String id;
	
	@Field(name = "firstname",type = FieldType.Text)
	private String firstname;
	
	@Field(name = "lastname",type = FieldType.Text)
	private String lastname;
	
	@Field(name = "adress",type = FieldType.Text)
	private String adress;
	
	@Field(name = "birhdate",type = FieldType.Text)
	private Date birthDate;
	
	

}
