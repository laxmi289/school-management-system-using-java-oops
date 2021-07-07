package school.management.system;

//This class is responsible for keeping track
//of students fees, names, grade.

public class Student {
    private int id;             //Protecting somebody from accessing id from outside student class
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Role of a constructor is to create a new Student object
     * by initialising the values
     * fees for every student is going to be $30000/yr
     * fees paid initially is 0
     * @param id id for the student : unique
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade) {
        this.id = id;               // id from upper Student class = id from this constructor's arguement
        this.name = name;
        this.grade = grade;
        feesPaid = 0;               //since feesPaid is not passed as argument, no need to use this keyword
        feesTotal = 30000;
    }

    //Not going to alter students name so no need to use
    //setName function.

    //Since grade will change as student gets promoted,
    //declare setGrade

    /**
     * used to update students grade
     * @param grade new grade of the student
     */
    public void setGrade (int grade) {     //in setGrade, we r updating the grade of student to the grade that is coming from the argument
        this.grade = grade;
    }

    /**
     * Recieve and keep adding the fees to feesPaid field
     * The school is going to receive the funds
     * @param fees the fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);//initially feesPaid=0
    }

    /**
     * returns id, name, grade, feesPaid and feesTotal of current student
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade () {
        return  grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * return the remaining fees
     * @return
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student name: " +name+ " Total fees paid so far: "+feesPaid;
    }
}
