import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[1000];

        Random random = new Random();
        int maxnum1 = 0;
        int maxnum2 = 0;
        int maxnum7 = 0;
        int maxnum14 = 0;
        int otvet1 = -1;
        int otvet2 = -1;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);

            if (array[i] > maxnum1) {
                maxnum1 = array[i];
            }
            if ((array[i] % 2 == 0) && (array[i] > maxnum2)) {
                maxnum2 = array[i];
                }
            if ((array[i] % 7 == 0) && (array[i] > maxnum7)) {
                maxnum7 = array[i];
            }
            if ((array[i] % 14 == 0) && (array[i] > maxnum14)) {
                maxnum14 = array[i];
            }
        }
        otvet1 = maxnum1 * maxnum14;
        otvet2 = maxnum2 * maxnum7;
        if(otvet1 == 0 && otvet2 == 0){System.out.println(-1);}
        else if(otvet1>otvet2){System.out.println(otvet1);} else if (otvet2>otvet1) {System.out.println(otvet2);

        }
        }
}