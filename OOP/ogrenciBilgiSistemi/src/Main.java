public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "05462656800");
        Teacher t2 = new Teacher("Seher Hoca",  "FZK",  "06462561566");
        Teacher t3 = new Teacher("Kemal Hoca", "BIO",  "49851661154");



        Course Tarih = new Course("Tarih","101","TRH");
        Tarih.addTeacher(t1);

        Course Fizik = new Course("Fizik","102","FZK");
        Fizik.addTeacher(t2);

        Course Biyo = new Course("Biyo","103","BIO");
        Biyo.addTeacher(t3);




        Student s1 = new Student("Ahmet", "139", "7", Tarih, Fizik,Biyo);
        s1.addBulkExamNote(100,60,80);
        s1.isPass();

        Student s2 = new Student("Burak", "250", "7", Tarih, Fizik, Biyo);
        s2.addBulkExamNote(80,55,90);
        s2.isPass();


    }
}