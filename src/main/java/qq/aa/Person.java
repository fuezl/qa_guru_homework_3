package qq.aa;

public class Person {

    String surname;
    char gender = 'M';
    int dateOfBirth = 1;
    int monthOfBirth = 1;
    int yearOfBirth = 1900;

    public Person(String surname, int dateOfBirth, int monthOfBirth, int yearOfBirth) {
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public Person() {
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    String getSurname() {
        return surname;
    }

    void sayBirthday() {
        String date;
        if (this.dateOfBirth < 10) {
            date = String.format("0%s", this.dateOfBirth);
        } else {
            date = String.format("%s", this.dateOfBirth);
        }
        String month;
        if (this.monthOfBirth < 10) {
            month = String.format("0%s", this.monthOfBirth);
        } else {
            month = String.format("%s", this.monthOfBirth);
        }
        String birthday = String.format("%s.%s.%s", date, month, this.yearOfBirth);
        System.out.println(birthday);
    }


}
