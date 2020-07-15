package homeworksix;

public class Pitbul extends Dog {

    public int maxDistanceToRun=600;

    public Pitbul (String name) {
        super(name);
        super.type = "dog Pitbul";


    }
    @Override
    public void run(int distanceToRun) {
        boolean isRun = true;
        if (distanceToRun > this.maxDistanceToRun || distanceToRun < 0) {
            isRun = false;
        }
        System.out.println("run: " +isRun + "|| max distance for that animal- " +this.maxDistanceToRun );
    }

}

