package homeworksix;

public class Animal {

    public String name;

    public int maxDistanceToRun;
    public int maxDistanceToSwim;
    public double maxHeightToJump;
    String type;

    public Animal(String name) {
        this.name=name;
    }

    public void run(int distanceToRun) {
        boolean isRun = true;
        if (distanceToRun > this.maxDistanceToRun || distanceToRun < 0) {
            isRun = false;
        }
            System.out.println("run: " +isRun + "|| max distance for that animal- " +this.maxDistanceToRun );
        }


    public void  swim (int distanceToSwim){
            boolean isSwim = true;
            if (distanceToSwim > this.maxDistanceToSwim || distanceToSwim <= 0) {
                isSwim = false;
                }
                System.out.println("swim: " + isSwim + "|| max distance for that animal- " + this.maxDistanceToSwim);
            }

    public void jump ( double heigthToJump){
        boolean isJump = true;
        if (heigthToJump > this.maxHeightToJump|| heigthToJump <= 0) {
            isJump = false;
        }
            System.out.println("jump: " + isJump + "|| max heigth for that animal- " + this.maxHeightToJump );
        }


    public void info (){
        System.out.println("status for: " +this.type);
    }
    }

