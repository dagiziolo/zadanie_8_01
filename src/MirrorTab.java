import java.util.Random;

public class MirrorTab {
    private final static int maxRand = 10;
    private final static int N = 10;

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[N];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(maxRand);
        }

        for (int i = 0; i < tab.length*2; i++) {
            if (i<tab.length){
                System.out.print(tab[i]+", ");
            } else if (i < tab.length*2 - 1){
                System.out.print(tab[2*N-i-1]+", ");
            } else
                System.out.print(tab[2*N-i-1]);
        }
    }

}
