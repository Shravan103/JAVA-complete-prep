package com.example.demo;

public class Student {

    private String name;
    private String age;

    public Student() {

    }

    public Student(String name, String age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {

        return "Student{name='" + name + "', age='" + age + "'}";

    }

}

// 	How toString() is called?
//	The println() method has an overload that accepts an Object.
//	So when you write:
//		System.out.println(student);
//
//	Java automatically converts it to:
//		System.out.println(student.toString());
//
//	That's why your overridden toString() method is executed.

