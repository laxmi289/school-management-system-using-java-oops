package school.management.system;

/**
 * This class is responsible for keeping track of teacher
 * id,name and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new Teacher object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * return the id, name and salary for the current teacher
     * @return
     */
    public int getId() {
        return id;
    }
    public String getName () {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * adds to the salary
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher name: " +name+ " Total salary earned so far: "+salaryEarned;
    }
}
