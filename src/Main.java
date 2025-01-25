import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ArrayList<Person> presonList = new ArrayList<>();
        Person person = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.println("Для добавления пользователя введите в правильном порядке: имя, фамилию, отчество." +
                " Через пробел");

        String[] personForSplit = sc.nextLine().split(" ");
        String name = personForSplit[0];
        String familyName = personForSplit[1];
        String middleName = personForSplit[2];

        System.out.println("Проверьте введенные данные: "
                + name + " "
                + familyName + " "
                + middleName);
        System.out.println("Если данные верны, введите - \"Да\" для добавления пользователя, " +
                "в противном случае введите - \"Нет\". Комманды вводятся без ковычек.");

        String answer = sc.nextLine();
        if (answer.toLowerCase(Locale.ROOT).equals("да")) {

            person.setName(name);
            person.setFamilyName(familyName);
            person.setMiddleName(middleName);
            presonList.add(person);

            System.out.println("Успешно добавлен " + person);
        } else {
            System.out.println("Проргамма завершена");
        }

    }

}
