package three;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        char[] nizIzKojegKopiramo = {
                'a', 'e', 'c', 'a', 'f',
                'f', 'e', 't', 'i', 'n',
                'w', 'š'};
        char[] copyTo = Arrays.copyOfRange(nizIzKojegKopiramo, 2, 10);
        System.out.println(copyTo);
    }
}
