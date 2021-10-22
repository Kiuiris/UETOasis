public class Staff extends Person {
    private String school;
    private double pay;

    /** Staff constructor. */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /** school getter. */
    public String getSchool() {
        return school;
    }

    /** school setter. */
    public void setSchool(String school) {
        this.school = school;
    }

    /** pay getter. */
    public double getPay() {
        return pay;
    }

    /** pay setter. */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /** Staff toString method. */
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
