package homeworksix;

public class Cat extends Animal {
    String breed;

    public int maxDistanceToRun=200;
    public int maxDistanceToSwim=0;
    public double maxHeightToJump=2.0;

    public Cat (String name, String breed){
        super(name);
        this.breed=breed;
        super.type = "cat";
        super.maxDistanceToRun=maxDistanceToRun;
        super.maxDistanceToSwim= maxDistanceToSwim;
        super.maxHeightToJump=maxHeightToJump;


    }

    @Override
    public void swim (int distanceToSwim){
       super.swim(distanceToSwim);
       System.out.println("Cats can not swim!!!");
    }

    }


