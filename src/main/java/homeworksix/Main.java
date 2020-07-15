package homeworksix;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal [4];
        animals [0]= new Cat("Boris", "Persian");
        animals [1] = new Dog("Tuzik");
        animals [2] = new Bulldog( "Bobik");
        animals [3] = new Pitbul( "Sharik");

        for (int i = 0; i < animals.length ; i++) {
            animals[i].info();
            animals[i].run(500);
            animals[i].swim(8);
            animals[i].jump(1);
            System.out.println();

        }
    }
}
