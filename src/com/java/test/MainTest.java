package com.java.test;

import java.util.List;

import org.junit.Test;

import com.java.entity.Stu;
import com.java.service.StuService;

public class MainTest {
	
	@Test
	public void test() {
		// TODO Auto-generated method stub
		List<Stu> stuList = StuService.getAllByExcel("C://book.xls");
		System.out.println(stuList);
	}
}
