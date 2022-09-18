package PatikaJava101.OOP.OgrenciNotSistemi;

public class Student {

    String name,stuNo;
    int classes;
    Course math;
    Course phys;
    Course chem;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course phys, Course chem) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.phys = phys;
        this.chem = chem;
        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int phys, int chem) {

        if (math >= 0 && math <= 100) {
            this.math.grade = math;
        }

        if (phys >= 0 && phys <= 100) {
            this.phys.grade = phys;
        }

        if (chem >= 0 && chem <= 100) {
            this.chem.grade = chem;
        }

    }

    public void isPass() {
        if (this.math.grade == 0 || this.phys.grade == 0 || this.chem.grade == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println(this.name + " sınıfı geçti.");
            } else {
                System.out.println(this.name + " sınıfta kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.phys.grade + this.chem.grade + this.math.grade) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci Adı: " + this.name);
        System.out.println("Matematik Notu: " + this.math.grade);
        System.out.println("Fizik Notu: " + this.phys.grade);
        System.out.println("Kimya Notu: " + this.chem.grade);
    }
    
}
