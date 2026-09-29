package com.ver3;

public class Student {
	private int id;
	private String name;
	private String course;

//	public Student(int id, String name, String course) {
//		this.id = id;
//		this.name = name;
//		this.course = course;
//	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			System.out.println("Invalid Id");
			System.exit(0);
		} else {
			this.id = id;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.equals("")) {
			System.out.println("Please Enter Valid Name");
			System.exit(0);
		} else {
			this.name = name;
		}
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		if(course==null||course.equals("")) {
			System.out.println("Enter Valid Course");
			System.exit(0);
		}else {
		this.course = course;}
	}

}
