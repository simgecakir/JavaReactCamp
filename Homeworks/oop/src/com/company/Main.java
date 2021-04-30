package com.company;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "Engin Demirog", "ÜCRETSİZ");

        Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "Engin Demirog", "ÜCRETSİZ");

        Course course3 = new Course("Programlamaya Giriş için Temel Kurs",
                "Engin Demirog", "ÜCRETSİZ");

        Course[] courses = {course1,course2,course3};

        for(Course  course: courses){
            System.out.println(course.courseName);
            System.out.println(course.instructer + " " + course.price);
        }

        Category category1 = new Category("Tümü");
        Category category2 = new Category("Programlama");

        Category[] categories = {category1,category2};
        for (Category category: categories){ System.out.println(category.categoryName); }

        CourseManager.RegisterToProgram(course1);
        CourseManager.Send("Özellik nesnesi olarak verdiğim örnekler : kategori ve kurs");
    }
}
