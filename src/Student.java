public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /** Student constructor. */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /** program getter. */
    public String getProgram() {
        return program;
    }

    /** program setter. */
    public void setProgram(String program) {
        this.program = program;
    }

    /** year getter. */
    public int getYear() {
        return year;
    }

    /** year setter. */
    public void setYear(int year) {
        this.year = year;
    }

    /** fee getter. */
    public double getFee() {
        return fee;
    }

    /** fee setter. */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /** Student toString method. */
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
