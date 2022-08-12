package com.testcases.demo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vfislk.training.InvalidNumException;
import com.vfislk.training.Student;

class StudentTest {
Student student = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Test@DisplayName("Testing calcTotal")
	void testCalcTotal() throws  InvalidNumException, com.vfislk.training.NegValueException  {
		assertEquals(100,student.calcTotal(33,34,33));
	}
//	@Test@DisplayName("Testing negative value ")
//	void testNegTotal() {
//		assertThrows(NegValueException.class,()->student.calcTotal(-33, -34, -33));
//	}
	@Test@DisplayName("Testing marks greater than 100")
	void testGreaterTotal() {
	assertThrows(InvalidNumException.class,()->{
			student.calcTotal(33, 34, 673);
		});
	}
	@Test@DisplayName("Grade A")
	void testGradeA() {
		int[] marks = {96,90};
		assertEquals("A",student.getGrade(marks));
	}
	@Test@DisplayName("Grade B")
	void testGradeB() {
		int[] marks = {87,85};
		assertEquals("B",student.getGrade(marks));
	}
	@Test@DisplayName("Grade c")
	void testGradeC() {
		int[] marks = {75,77};
		assertEquals("C",student.getGrade(marks));
	}
	@Test@DisplayName("Grade D")
	void testGradeD() {
		int[] marks = {65,67};
		assertEquals("D",student.getGrade(marks));
	}
	@Test@DisplayName("Grade E")
	void testGradeE() {
		int[] marks = {58,55};
		assertEquals("E",student.getGrade(marks));
	}
	@Test@DisplayName("Grade fail")
	void testGradeFail() {
		int[] marks = {46,45};
		assertEquals("fail",student.getGrade(marks));
	}
	@Test@DisplayName("for null")
	void testGradeNull() {
		int[] marks = null;
		assertEquals(null,student.getGrade(marks));
	}
	@Test@DisplayName("Greater")
	void testGradeGreater() {
		int[] marks = {101,109};
		assertThrows(InvalidNumException.class,()->student.getGrade(marks));
	}
	@Test@DisplayName("Negative")
	void testGradeNegative() {
		int[] marks = {-101,10,20};
		assertThrows(InvalidNumException.class,()->student.getGrade(marks));
	}
}

