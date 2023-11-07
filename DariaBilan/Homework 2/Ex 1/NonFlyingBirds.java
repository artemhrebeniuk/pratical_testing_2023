package hw_second.first_ex;

public class NonFlyingBirds extends Bird{

    public NonFlyingBirds(String feather, String layEggs){
        this.feather = feather;
        this.layEggs = layEggs;
    }

    public String fly(){
        return "This bird can't fly!";
    }

    @Override
    public String toString() {
        return "This is non flying bird\n" + this.fly() + "\nFeather color is " + this.feather + "\n" + this.layEggs;
    }
}
