package hw_second.first_ex;


public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("dark grey", "It lays about 2-4 eggs.");
        eagle.fly();
        Swallow swallow = new Swallow("blackish", "It lays about 3-5 eggs.");
        Penguin penguin = new Penguin("black & white", "It lays about 2 eggs at once.");
        Chicken chicken = new Chicken("white", "It lays about 300 per year.");

        Bird birds[] = new Bird[]{eagle, swallow, penguin, chicken};

        System.out.println("\n");
        for (Bird i: birds) {
            System.out.println(i+"\n--------------------------\n");
        }

    }



}
