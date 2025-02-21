/*
    Written by: Jaylen Small
    Date: 2/20/25
    Output:
        Salaried: John Doe ID: 70730 Annual: 25750.0
        Salaried: Alex Smith ID: 7280 Annual: 50200.0
        Hourly: Tom Slick ID: 67534 Hourly Rate: 7.55
        Hourly: Joe Dunn ID: 70276 Hourly Rate: 6.25
        Hourly: Bob White ID: 18747 Hourly Rate: 7.0
        Employee Tom Slick has dependent Billy
        Employee Joe Dunn has dependent Molly
        Employee Joe Dunn has dependent Sally
*/

// Employee class with all the setters and getters that other employee class will inheret from
class Employee {
    Employee(){
    }
    
    String empName;
    String empID;

    Dependent[] dependents = new Dependent[5];
    int dep = 0;

    Employee(String empName){
        this.empName = empName;
    }

    void setID(){
        empID = Integer.toString((int)(Math.random() * 100000));
    }

    String getID(){
        return empID;
    }

    String getName(){
        return empName;
    }

    void assignDependent(Dependent d){
        dependents[dep] = d;
        dep++;
    }

    void getDependents(){
        if (dep == 0){
            System.out.println("Employee " + getName() + " has no dependents");
        } else {
            for (Dependent dependent : dependents){
                if(dependent == null){
                    break;
                } else {
                    System.out.println("Employee " + getName() + " has dependent " + dependent.getDepName());
                }
            }
        }
    }
}

// Dependent class aggrigated from the Employee class
class Dependent{
    Dependent(){
    }

    String depName;
    String depParent;

    Dependent(String depName, String depParent){
        this.depName = depName;
        this.depParent = depParent;
    }

    String getParentName(){
        return depParent;
    }

    String getDepName(){
        return depName;
    }
}

// Salaried employee class inherited from the Employee class
class SalariedEmp extends Employee{
    double annualSalary;

    SalariedEmp(String empName, double annualSalary){
        this.empName = empName;
        this.annualSalary = annualSalary;
        setID();
    }

    double getSalary(){
        return annualSalary;
    }

    public String toString(){
        return "Salaried: " + getName() + " " + "ID: " + getID() + " " + "Annual: " + annualSalary;
    }
}

// Hourly employee class inherited from the Employee class
class HourlyEmp extends Employee{
    double hourlyRate;

    HourlyEmp(String empName, double hourlyRate){
        this.empName = empName;
        this.hourlyRate = hourlyRate;
        setID();
    }

    double getSalary(){
        return hourlyRate;
    }

    public String toString(){
        return "Hourly: " + getName() + " " + "ID: " + getID() + " " + "Hourly Rate: " + hourlyRate;
    }
}

public class TestEmp {
    public static void main(String[] args) {
        SalariedEmp johnDoe = new SalariedEmp("John Doe", 25750);
        SalariedEmp alexSmith = new SalariedEmp("Alex Smith", 50200);
        HourlyEmp tomSlick = new HourlyEmp("Tom Slick", 7.55);
        HourlyEmp joeDunn = new HourlyEmp("Joe Dunn", 6.25);
        HourlyEmp bobWhite = new HourlyEmp("Bob White", 7.00);

        Dependent molly = new Dependent("Molly", joeDunn.empName);
        joeDunn.assignDependent(molly);
        Dependent sally = new Dependent("Sally", joeDunn.empName);
        joeDunn.assignDependent(sally);
        Dependent billy = new Dependent("Billy", tomSlick.empName);
        tomSlick.assignDependent(billy);

        System.out.println(johnDoe);
        System.out.println(alexSmith);
        System.out.println(tomSlick);
        System.out.println(joeDunn);
        System.out.println(bobWhite);

        tomSlick.getDependents();
        joeDunn.getDependents();
    }
}
