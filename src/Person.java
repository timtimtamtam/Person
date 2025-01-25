public class Person {

    private String familyName;
    private String middleName;
    private String name;

    public void person(String familyName, String middleName, String name) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.name = name;
    }

    public void person(){}

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getName() {
        return name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пользователь: " + // Решил заменить Человек на Пользовтель, как-то уместнее звучит :)
                "Фамилия " + familyName +
                ", Имя " + name +
                ", Отчество " + middleName;
    }
}
