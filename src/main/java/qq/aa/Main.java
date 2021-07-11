package qq.aa;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Ivanov", 12, 6, 1990);
        System.out.println(ivan.getSurname());
        ivan.setGender('M');
        ivan.sayBirthday();
    }
}
