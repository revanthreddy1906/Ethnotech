class EmployeeSalary {

    void calculateSalary() {
        System.out.println("Calculating employee salary...");
    }
}
class FullTimeEmployee extends EmployeeSalary {
    @Override
    void calculateSalary() {
        double salary = 40000;
        System.out.println("Full-time employee salary: $" + salary);
    }
}
class Interns extends EmployeeSalary {
    @Override
    void calculateSalary() {
        double salary = 25000;
        System.out.println("Intern employee salary: $" + salary);
    }
}
class RemoteEmployee extends EmployeeSalary {
    @Override
    void calculateSalary() {
        double salary = 30000;
        System.out.println("Remote employee salary: $" + salary);
    }
}
class HybridEmployee extends EmployeeSalary {
    @Override
    void calculateSalary() {
        double salary = 35000;
        System.out.println("Hybrid employee salary: $" + salary);
    }
}
public class polyEmployetest {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        Interns intern = new Interns();
        RemoteEmployee remoteEmployee = new RemoteEmployee();
        HybridEmployee hybridEmployee = new HybridEmployee();
        fullTimeEmployee.calculateSalary();
        intern.calculateSalary();
        remoteEmployee.calculateSalary();
        hybridEmployee.calculateSalary();
    }
}