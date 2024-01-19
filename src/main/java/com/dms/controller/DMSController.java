package com.dms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.bean.Doctor;
import com.dms.dao.DoctorDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class DMSController {

	@Autowired
	DoctorDAO dao;
	int operations;
	String result;
	
	@PostMapping("PerformInsert")
	public String performInsert(@RequestBody Doctor doc) {
		dao.save(doc);
		return "Inserted";
	}
	
	@PutMapping("PerformUpdate")
	public String performUpdate(@RequestBody Doctor doc) {
		dao.save(doc);
		return "Updated";
	}
	@DeleteMapping("PerformDelete/{dId}")
	public String performDelete(@PathVariable("dId") int dId) {
		dao.deleteById(dId);
		return "Deleted";
	}
	
	@GetMapping("ViewAll")
	public List<Doctor> viewAllDoctor(){
		Iterator<Doctor> it=dao.findAll().iterator();
		 List<Doctor> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
}
