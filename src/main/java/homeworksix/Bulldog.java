package homeworksix;

public class Bulldog extends Dog {
    public int maxDistanceToRun=400;

    public Bulldog(String name) {
        super(name);
        super.type = "dog Bulldog";
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

