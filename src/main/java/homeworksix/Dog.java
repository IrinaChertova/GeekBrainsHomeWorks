package homeworksix;

public class Dog extends Animal {

    public int maxDistanceToRun=500;
    public int maxDistanceToSwim=10;
    public double maxHeightToJump=0.5;

    public Dog (String name){
        super(name);
        super.type = "dog";
       super.maxDistanceToRun=maxDistanceToRun;
       super.maxDistanceToSwim= maxDistanceToSwim;
       super.maxHeightToJump=maxHeightToJump;
    }
}
