package homeworksix;

public class Dog extends Animal {


    public Dog (String name){
        super(name);
       this.type = "dog";
       this.maxDistanceToRun=500;
       this.maxDistanceToSwim= 10;
       this.maxHeightToJump=0.5;
    }
}
