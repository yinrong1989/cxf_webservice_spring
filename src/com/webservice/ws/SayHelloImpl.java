package com.webservice.ws;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService	
public class SayHelloImpl implements SayHelloWS {
Map<String,Student> students=new HashMap<String,Student>();
public SayHelloImpl() {
 Student student1=new Student("1","殷荣1");
 Student student2=new Student("2","殷荣2");
 Student student3=new Student("3","殷荣3");
 Student student4=new Student("4","殷荣4");
 Student student5=new Student("5","殷荣5");
 Student student6=new Student("6","殷荣6");
	this.students.put("1", student1);
	this.students.put("2", student2);
	this.students.put("3", student3);
	this.students.put("4", student4);
	this.students.put("5", student5);
	this.students.put("6", student6);

}


public String sayHello() {
		// TODO Auto-generated method stub
		return "你好啊";
	}

	public String sayHello2SomeOne(String name) {
		// TODO Auto-generated method stub
		return "你好啊"+name+"同学";
	}

	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
		return students.get(id);
	}

}
