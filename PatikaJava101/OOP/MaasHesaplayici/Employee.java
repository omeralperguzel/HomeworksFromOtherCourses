package PatikaJava101.OOP.MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax(int salary) {
        int taxint;
        if (salary>1000) {
            taxint = (salary * 3) / 100;
            return taxint;
        }
        else if (this.salary < 1000 && this.salary > 0) {
            taxint = this.salary;
            return taxint;
        } else {
            return 0;
        }
    }

    int bonus(int workHours){
        int bonusprice;
        if(workHours > 40){
            bonusprice = 30*(workHours-40);
            return bonusprice;
        }
        else if (workHours <= 40){
            bonusprice = 0;
            return bonusprice;
        }
        else{
            return 0;
        }
    }

    int raiseSalary(int hireYear){
        int currentyear = 2022;
        int yearsofwork;
        int increment;
        yearsofwork = (currentyear - this.hireYear);
        if (yearsofwork<10 && yearsofwork>0) {
            System.out.println("Alınan zam oranı %5.");
            increment = (salary * 5) / 100;
            return increment;
        } 
        else if (yearsofwork>9 && yearsofwork<20) {
            System.out.println("Alınan zam oranı %10.");
            increment = (salary * 10) / 100;
            return increment;
        } 
        else if (yearsofwork>19) {
            System.out.println("Alınan zam oranı %15.");
            increment = (salary * 15) / 100;
            return increment;
        }
        else {
            return 0;
        }
            

    }
    
    public String toString(){

        int salaryBeforeIncrement = this.salary + bonus(workHours) - tax(salary);
        int topSalary = this.salary + bonus(workHours) + raiseSalary(hireYear) - tax(salary);

        System.out.println("Adı:" + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("----------------");
        System.out.println("Verdiği Vergi: " + tax(salary));
        System.out.println("Alınan Bonus Ücret: " + bonus(workHours));
        System.out.println("Maaş Artışı: " + raiseSalary(hireYear));
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + salaryBeforeIncrement);
        System.out.println("Toplam alınan Maaş: " + topSalary);
        System.out.println("O----------------O");

        return null;
    }
}
