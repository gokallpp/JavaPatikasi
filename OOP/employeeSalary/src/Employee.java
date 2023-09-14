public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double taxCalculator(){
        double tax = 0;
        if (salary >= 1000){
            tax = 0.03 * salary;
            return tax;
        }
        return tax;
    }

    int bonus(){
        int extra = 0;
        if (workHours >= 40){
            extra = (workHours-40) * 30;
            return extra;
        }
        return extra;
    }

    double raiseSalary(){
        double raise = 0;
        if (2021 - hireYear < 10){
            raise += salary * 0.05; //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        }

        if (2021 - hireYear > 9 && 2021 - hireYear < 2020){ //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
            raise += salary * 0.10;
        }

        if (2021 - hireYear > 19){
            raise += salary * 0.15; //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        }
        return raise;

    }

    void Info(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire date: " + this.hireYear);
        System.out.println("Tax: " + this.taxCalculator());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Raise salary: " + this.raiseSalary());
        System.out.println("Total: " + (this.salary - this.taxCalculator() + this.raiseSalary() + this.bonus()));
    }


}
