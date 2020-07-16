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

    public void run() {
        boolean isRun = true;
        int distanceToRun=(int)(Math.random()*700);
        if (distanceToRun > this.maxDistanceToRun || distanceToRun < 0) {
            isRun = false;
        }
            System.out.println("run distance: " + distanceToRun+ " "+isRun + "|| max distance for that animal- " +this.maxDistanceToRun );
        }


    public void  swim (){
            boolean isSwim = true;
            int distanceToSwim=(int)(Math.random()*15);
            if (distanceToSwim > this.maxDistanceToSwim || distanceToSwim <= 0) {
                isSwim = false;
                }
                System.out.println("swim distance: " + distanceToSwim+ " " + isSwim + "|| max distance for that animal- " + this.maxDistanceToSwim);
            }

    public void jump (){
        boolean isJump = true;
        double heigthToJump=(double)(Math.random()*2);
        if (heigthToJump > this.maxHeightToJump|| heigthToJump <= 0) {
            isJump = false;
        }
            System.out.printf("jump heigth: " + "%.2f" + " " + isJump + "|| max heigth for that animal- " + this.maxHeightToJump,  heigthToJump );
            System.out.println();
        }


    public void info (){
        System.out.println("status for: " +this.type);
    }
    }

