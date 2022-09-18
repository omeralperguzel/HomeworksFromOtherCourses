package PatikaJava101.OOP.OgrenciNotSistemi;

public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int grade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı!");
        } else {
            System.out.println(t.name + " öğretim üyesi bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin öğretim üyesi: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine öğretim üyesi atanmamıştır.");
        }
    }
    
}
