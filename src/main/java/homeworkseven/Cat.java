package homeworkseven;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name) {
        this.name = name;
        this.appetite = (int)(Math.random()*15+1);
        this.isFull=false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAppetite() {

        return appetite;
    }

    public void setAppetite(int appetite) {

        this.appetite = appetite;
    }
    public boolean getIsFull() {

        return isFull;
    }

    public void setIsFull (boolean isFull) {
        this.isFull=isFull;
    }
}
