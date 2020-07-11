package homeworkfive;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double selary;
    private int age;

    public Person(String name, String position, String email, String phoneNumber, double selary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.selary = selary;
        this.age = age;
    }

    public void displayInfo() { //public or private
        System.out.println("Name: " + name + " | position: " + position + " | @ " + email + " | tel " + phoneNumber + " | selary: " + selary + " | Age: " + age);
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) { // добавить форматирование
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivanov Ivan", "manager", "ivanov@mail.ru",
                "89265555551", 100000, 35);
        personArray[1] = new Person("Petrov Petr", "driver", "petrov@mail.ru",
                "89265555552", 30000, 45);
        personArray[2] = new Person("Sidorov Sidor", "buyer", "sidorov@mail.ru",
                "89265555553", 150000, 25);
        personArray[3] = new Person("Alekseev Aleksey", "engineer", "alekseev@mail.ru",
                "89265555554", 70000, 41);
        personArray[4] = new Person("Sergeev Sergey", "programmer", "sergeev@mail.ru",
                "89265555555", 200000, 50);

   System.out.println("сотрудники старше 40 лет: ");
        for (Person i : personArray) {
            if (i.getAge() > 40) {
                i.displayInfo();
            }
        }
    }
}
