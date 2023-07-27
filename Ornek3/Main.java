package Ornek3;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Meryem", "Aydın", "123", "sultangazi", 85);
        Student st2 = new Student("Mustafa", "Çetindağ", "345", "Beyoğlu", 85);
        Student st3 = new Student("İbrahim", "Aydın", "567", "Gaziosmanpaşa", 85);

        Instructor teacher = new Instructor("Mahmut", "Çetindağ","CENG");
        //composition , aggregation
        //Course has a Instructor
        Course mat = new Course("MAT101", "MAT",teacher);
        System.out.println(mat.getInstructor().getName());

        Student[] stu = {st1, st2, st3};

        System.out.println("ortalama "+ mat.calcAverage(stu));

    }
}
