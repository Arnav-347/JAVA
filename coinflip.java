import java.util.Random;

public class coinflip {
    public static void main(String[] args) {
        boolean isHeads;
        Random random = new Random();
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
