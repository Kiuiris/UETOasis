public class Person {
    private String name;
    private String address;

    /** Person constructor. */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /** program getter. */
    public String getName() {
        return name;
    }

    /** program getter. */
    public String getAddress() {
        return address;
    }

    /** program getter. */
    public void setAddress(String address) {
        this.address = address;
    }

    /** program getter. */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
