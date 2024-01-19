package com.dms;

import static org.testng.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dms.bean.Doctor;
import com.dms.controller.DMSController;
import com.dms.dao.DoctorDAO;

@SpringBootTest
class SbDcmsApplicationTests {
	@Autowired

	DMSController controller;
	DoctorDAO dao;
	Doctor doctor;
	 String insert;
	    String update;
	    String delete;
	    String result;
	    String result1;
	List<Doctor> list = new ArrayList<Doctor>();
	List<Doctor> list1 = new ArrayList<Doctor>();
	Doctor dc = new Doctor(111, "Jeban", 24, "jeban@gmail.com", "Ortho", 98765, "Delhi");
	Doctor dc1 = new Doctor(112, "Sara", 24, "sara@gmail.com", "Ortho", 988765, "mumbai");
	Doctor dc2;
	Doctor dc3;

//	@Test
//	@Order(1)
//	void contextLoads() {
//     asser
//	}

	@Test
	@Order(2)
	 void testPerformInsert() {
		insert = "Inserted";
		result = controller.PerformInsert(dc);
		assertEquals(insert, result);
	}

	@Test
	@Order(3)
	 void testPerformUpdate() {
		update = "Updated";
		result = controller.PerformUpdate(dc1);
		assertEquals(update, result);
	}
	@Test
    @Order(4)
     void testPerformDelete() {
        delete="Deleted";
        result=controller.performDelete(201);
        result1=controller.performDelete(301);
        assertEquals(delete,result);
    }
    
//    @Test
//    @Order(5)
//     void testGetAllDoctorDetails() {
//        list=controller.viewAllDoctor();
//        dc2 = new Doctor(122, "Aravind", 24, "aravind@gmail.com", "Ortho", 9876345, "madurai");
//        dc3 = new Doctor(123,"Shiva", 24, "shiva@gmail.com", "Ortho", 98764345, "madurai");
//        list1.add(dc2);
//        list1.add(dc3);
//        list.equals(list1);
//    }

}
