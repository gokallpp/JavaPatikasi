public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String branch, String phone){
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon : " + this.phone);
        System.out.println("Bölümü : " + this.branch);
    }
}
