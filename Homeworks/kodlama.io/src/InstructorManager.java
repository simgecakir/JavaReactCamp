import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InstructorManager extends UserManager {

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " eğitmeni eklendi.");
    }

    public void addCourse(Instructor instructor,String course){

        int index = instructor.getTotalCourse();
        instructor.getCourses()[index] = course;
        instructor.setTotalCourse(instructor.getTotalCourse() + 1);
    }

    public void deleteCourse(Instructor instructor, String courseName){

        String[] courses = instructor.getCourses();
        String[] temp = new String[courses.length-1];

        for(int i=0; i < courses.length; i++){

            if (courses[i] == courseName) {

                System.arraycopy(courses,0,temp,0,i);
                System.arraycopy(courses,i+1,temp,i,courses.length-i-1);

                instructor.setCourses(temp);
                System.out.println(courseName + " silindi.");
                break;

            } else { continue; }
        }
    }
}
