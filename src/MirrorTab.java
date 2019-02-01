import java.util.Arrays;
import java.util.Random;

public class MirrorTab {
    private final static int maxRand = 100;
    private final static int N = 10;

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[N];
        int[] tabMirror = new int[2 * N];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(maxRand);
        }

        for (int i = 0; i < tab.length; i++) {
            tabMirror[i] = tab[i];
            tabMirror[tabMirror.length - 1 - i] = tab[i];
        }
//        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tabMirror));
    }

}
