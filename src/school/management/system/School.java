package school.management.system;

import java.util.List;
import java.util.ArrayList;

/**
 *calls the instance from Teacher and Student class
 * school can have many Teachers, many Students
 * Implements Teachers and Students using an arraylist as we do not know how many teacher or students maybe present
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new School object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * getter functions for the 4 parameters
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * setter functions for the 4 params as they tend to change
     * adds teacher, student etc to the school
     * @param teacher
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);

    }

    /**
     * adds the total money by the school
     * @param MoneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * updates money spent by the school i.e., salary given out to teacher
     * @param moneySpent
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
