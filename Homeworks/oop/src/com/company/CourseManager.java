package com.company;

public class CourseManager {

    public static void RegisterToProgram(Course course){
        System.out.println(course.courseName + " programına kayıt oldunuz..");
    }

    public static void Send(String post){
        System.out.println(post + " yazınız göderildi.");
    }
}
