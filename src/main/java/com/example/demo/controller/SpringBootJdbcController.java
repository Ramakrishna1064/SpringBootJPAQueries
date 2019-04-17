package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.EmployeeRecord;
import com.example.demo.repository.QueryRepository1;

@RestController
public class SpringBootJdbcController {

	@Autowired
	QueryRepository1 queryRepository1;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getFilmUSer", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public EmployeeRecord getFilmUser(@RequestBody EmployeeRecord filmDTO) {
		System.out.println("emplooyee id--->"+filmDTO.getId());
		EmployeeRecord record = queryRepository1.findById(filmDTO.getId());
		return record;
	}
}