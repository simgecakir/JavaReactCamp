public class Instructor extends User {

    private String[] courses;
    private int totalCourse;

    public Instructor(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {

        this.courses = courses;
        totalCourse = courses.length;

    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }
}
