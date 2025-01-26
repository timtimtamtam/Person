import java.time.LocalDate;
import java.util.stream.IntStream;

public class Person {

    private String familyName;
    private String middleName;
    private String name;
    private int age;

    public void person(String familyName, String middleName, String name, int age) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.name = name;
        this.age = age;
    }


    public void person() {
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getYearOfBirth(int age) {
        if ((age > 0) && (age < 110)) {
            LocalDate now = LocalDate.now();
            int year = now.minusYears(age).getYear();
            return String.valueOf(year);
        } else {
            return "Ошибка получения года рождения";
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 110)) {
            this.age = age;
            System.out.println("Успешно установлено значение поля возраст");
        } else {
            System.out.println("Поле возраст не было изменено, введено недопустимое значение.");
        }
    }

    public void setFamilyName(String familyName) {
        if (!familyName.isEmpty()) {
            this.familyName = familyName;
            System.out.println("Успешно установлено значение поля фамилия");
        } else {
            System.out.println("Поле фамилия не было изменено");
        }
    }

    public void setMiddleName(String middleName) {
        if (!middleName.isEmpty()) {
            this.middleName = middleName;
            System.out.println("Успешно установлено значение поля отчество");
        } else {
            System.out.println("Поле отчество не было изменено");
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            System.out.println("Успешно установлено значение поля имя");
        } else {
            System.out.println("Поле имя не было изменено");
        }
    }

    public String toStringWhitoutAge() {
        return "Пользователь: " +
                "Фамилия " + familyName +
                ", Имя " + name +
                ", Отчество " + middleName;
    }

    @Override
    public String toString() {
        return "Пользователь: " +
                "Фамилия " + familyName +
                ", Имя " + name +
                ", Отчество " + middleName +
                ", Возраст " + age;
    }
}
