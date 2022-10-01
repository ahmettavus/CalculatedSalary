public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    int totalSalary;

    //Contractor methot Employee
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {

        if (this.salary > 1000) {
            return this.salary * 0.03;

        } else {
            return 0;

        }


    }

    int bonus() {
        if (workHours > 40) {
            return (this.workHours - 40) * 30;

        } else {
            return 0;
        }
    }

    //The employee works more than 19 years, %15
    //The employee works more than 9 years, %10
    //The employee works less than 10 years, %5

    double raisedSalary() {
        if (2021 - this.hireYear > 19) {

            return this.salary * 0.15;

        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {

            return this.salary * 0.10;

        } else if (2021 - this.hireYear > 0 && 2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else {
            return 0;
        }

    }

    void print() {

        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hours : " + this.workHours);
        System.out.println("Work Start Date : " + this.hireYear);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus  : " + this.bonus());
        System.out.println("Raised Salary : " + this.raisedSalary());

        double taxableSalary = salary + bonus() - tax();

        System.out.println("Taxable Salary : " + taxableSalary);
        double totalSalary = salary + bonus() + raisedSalary() - tax();

        System.out.println("Tax and Bonus together calculated new salary : " + totalSalary);

    }


}

