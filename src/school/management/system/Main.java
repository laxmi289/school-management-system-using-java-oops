package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creating a list of teachers to be added
        Teacher lizzy = new Teacher(1,"Lizzy", 8000);
        Teacher melissa = new Teacher(2, "Melissa",6000);
        Teacher william = new Teacher(3, "William",7000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(william);

        //creating a list of students to be added
        Student samara = new Student(1, "Samara",4);
        Student laxmi = new Student(2, "Laxmi", 12);
        Student sindhu = new Student(3,"Sindhu",10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(samara);
        studentList.add(laxmi);
        studentList.add(sindhu);

        //creating a new School instance
        School sms = new School(teacherList, studentList);

        //creating another new Teacher
        Teacher megan = new Teacher(4, "Megan", 2000);

        //adding the new Teacher to School
        sms.addTeachers(megan);

        // paying and printing of student fees
        samara.payFees(5000);
        laxmi.payFees(6000);
        System.out.println("SMS has earned $" + sms.getTotalMoneyEarned());

        //paying teacher salary and printing the amount spent by School
        System.out.println("--------Making SMS pay salary");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("SMS has spent for salary to " + lizzy.getName() + " and now has $" + sms.getTotalMoneyEarned());

        //printing the details of a student, laxmi and teacher, lizzy using toString method in the respective classes
        System.out.println(laxmi);
        System.out.println(lizzy);
    }
}
