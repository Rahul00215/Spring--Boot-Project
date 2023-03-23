package com.rahul.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentMod {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long rollno;
	private String firstname;
	private String lastname;
	private String address;
}
