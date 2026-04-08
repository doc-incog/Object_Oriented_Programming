interface LivingThing {
    void specialFeature();
}

class Fish implements LivingThing {
    public void specialFeature() {
        System.out.println("Fish can swim");
    }
}

class Bird implements LivingThing {
    public void specialFeature() {
        System.out.println("Bird can fly");
    }
}

public class LivingBeing {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = new Bird();
        
        fish.specialFeature();
        bird.specialFeature();
    }
}