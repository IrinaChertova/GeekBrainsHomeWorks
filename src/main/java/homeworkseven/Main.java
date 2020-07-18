package homeworkseven;

public class Main {
    public static void main(String[] args) {
        int foodCount =25;

        Cat [] cats = new Cat [5];
        cats[0] = new Cat( "Barsik");
        cats[1] = new Cat( "Murzik");
        cats[2] = new Cat( "Findus");
        cats[3] = new Cat( "Leopold");
        cats[4] = new Cat( "Boris");


        Plate plate = new Plate(foodCount);

        for (int i = 0; i <cats.length; i++) {
            plate.info();
            System.out.println(cats[i].getName()+ ": аппетит - "+ " "+ cats[i].getAppetite());
            cats[i].eat(plate);
            cats[i].setAppetite(plate.getIsEat()==true ? 0 : cats[i].getAppetite());
            cats[i].setIsFull(cats[i].getAppetite() == 0 ? true : false);
            System.out.println(cats[i].getName()+ " поел и сытый: " + cats[i].getIsFull() + " | аппетит котика: " + cats[i].getAppetite());
            if (cats[i].getIsFull()==false){
                plate.increaseFood();
                if (plate.getIsInreased()==true){
                    i--;
                }

            }

            System.out.println();
        }
    }
}

//Урок 7. Практика ООП и работа со строками
//1. Расширить задачу про котов и тарелки с едой
//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
//3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
//4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку