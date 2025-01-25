import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ArrayList<Person> presonList = new ArrayList<>();
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        final int INVALID_VALUE_AGE = -1;

        System.out.println("Для добавления пользователя введите в правильном порядке: имя, фамилию, отчество." +
                " Через пробел");
        String[] personForSplit = sc.nextLine().split(" ");

        if (personForSplit.length < 3) {
            System.out.println("Ошибка добавления. Один из параметров не был задан.");
            return;
        }

        String name = personForSplit[0];
        String familyName = personForSplit[1];
        String middleName = personForSplit[2];

        System.out.println("Введите возраст в числовом формате");
        int age = INVALID_VALUE_AGE; // пришлось ввести константу чтобы понимать удалось ли вычислить возраст.

        String ageString = sc.nextLine(); // Решил получать возраст через строку т.к. намучался
                                          // с некорректным поведением сканера после считывания nextInt

        if (!ageString.isEmpty() && ageString.split(" ").length == 1) {
            try {
                age = Integer.parseInt(ageString);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка присвоения возраста пользователю" + e);
            }
        } else {
            System.out.println("Ошибка присвоения возраста пользователю");
        }

        boolean ageExist = age != INVALID_VALUE_AGE;

        System.out.print("Проверьте введенные данные: "
                + name + " "
                + familyName + " "
                + middleName + " ");

        if (ageExist) {
            System.out.print(age);
        }

        System.out.println("\nЕсли данные верны, введите - \"Да\" для добавления пользователя, " +
                "в противном случае введите - \"Нет\". Комманды вводятся без ковычек.");

        String answer = sc.nextLine();
        if (answer.toLowerCase(Locale.ROOT).equals("да")) {

            person.setName(name);
            person.setFamilyName(familyName);
            person.setMiddleName(middleName);
            if (ageExist) {
                person.setAge(age);
                System.out.println(person.getYearOfBirth(age));
            }
            presonList.add(person);

            if (ageExist) {
                System.out.println("Успешно добавлен " + person);
            } else {
                System.out.println("Успешно добавлен " + person.toStringWhitoutAge());
            }
        } else {
            System.out.println("Программа завершена");
        }
    }
}
