package hw_second.first_ex;

public class FlyingBirds extends Bird{

    public FlyingBirds(String feather, String layEggs){
        this.feather = feather;
        this.layEggs = layEggs;
    }
    public String fly(){
        return "This bird can fly!";
    }

    @Override
    public String toString() {
        return "This is flying bird\n" + this.fly() + "\nFeather color is " + this.feather + "\n" + this.layEggs;
    }
}
