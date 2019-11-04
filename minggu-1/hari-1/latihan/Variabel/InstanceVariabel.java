class InstanceVariabel{
    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in InstanceVariabel class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public InstanceVariabel (String empName) {
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the InstanceVariabel details.
    public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]) {
        InstanceVariabel iv = new InstanceVariabel("Ransika");
        iv.setSalary(1000);
        iv.printEmp();
    }
}