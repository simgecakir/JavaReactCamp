public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor(1,"Engin Demirog","xxx@xxx.com","Asd5R.dfX");
        Student student = new Student(2,"Simge Çakır","simge1@icloud.com","lkjT50?g");

        String[] courses = {"Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)",
                            "Yazılım Geliştirici Yetiştirme Kampı (Java + React)",
                            "Programlamaya Giriş için Temel Kurs",
                            "Yanlış kurs"};


        instructor.setCourses(courses);

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        studentManager.add(student);
        student.setPaymentInfo("creditcard");

        instructorManager.add(instructor);
        instructorManager.deleteCourse(instructor,"Yanlış kurs");

        System.out.println("\n_______KURSLAR_______");
        for(String course: instructor.getCourses()){
            System.out.println(course); }

    }
}
