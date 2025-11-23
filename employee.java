public class employee {
    private String name;
    private String salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public void increseSalary(double percentage) {
        double currentSalary = Double.parseDouble(salary);
        double increaseAmount = currentSalary * (percentage / 100);
        double newSalary = currentSalary + increaseAmount;
        salary = String.valueOf(newSalary);
    }
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setName("abc");
        e1.setSalary("1000");
        e1.increseSalary(10);
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("increment"+increaseSalary);
    }

}
