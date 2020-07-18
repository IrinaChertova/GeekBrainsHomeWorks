package homeworkseven;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class Plate {
    private int food;
    private boolean isEat;
    private boolean isIncreased;

    public Plate(int food) {
        this.food = food;
        this.isEat=false;// ели ли из тарелки
        this.isIncreased=false;
    }

    public void info() {
        System.out.println("В тарелке из которой едят котики единиц еды: " + food);
    }

    public void decreaseFood(int appetite) {

        if (appetite > food) {
            isEat=false;
            System.out.println("Котику недостаточно еды и он даже не подойдет к тарелке, добавьте еще еды!");

        } else {
            isEat=true;
            food -= appetite;

        }
    }

    public void increaseFood () {
        Scanner sc = new Scanner(System.in);
        isIncreased=false;
        System.out.println("добавить в тарелку еду? 1 - да, 0- нет");
        if (sc.nextInt() == 1) {
            System.out.println("сколько единиц еды добавить?");
            food = food + sc.nextInt();
            isIncreased=true;
        }
    }


    public int getFood() {

        return food;
    }

    public void setFood(int food) {

        this.food = food;
    }

    public boolean getIsEat() {

        return isEat;
    }
    public boolean getIsInreased() {

        return isIncreased;
    }

}

