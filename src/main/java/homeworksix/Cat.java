package homeworksix;

public class Cat extends Animal {
    String breed;

    public Cat (String name, String breed){
        super(name);
        this.breed=breed;
        this.type = "cat";
        this.maxDistanceToRun=200;
        this.maxDistanceToSwim=0;
        this.maxHeightToJump=2.0;

    }

    @Override
    public void swim (){
       super.swim();
       System.out.println("Cats can not swim!!!");
    }

    }


