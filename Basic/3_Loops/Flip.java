/** Simulate coin flip */

public class Flip {
    public static void main(String[] args) {
        if (Math.random() < 0.5)
            System.out.println("Head");
        else
            System.out.println("Tail");
    }
}