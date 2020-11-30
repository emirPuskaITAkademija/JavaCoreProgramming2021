package three;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] nizIzKojegKopiramo = {
                'a', 'e', 'c', 'a', 'f',
                'f', 'e', 't', 'i', 'n',
                'w', 'š'};
        char[] copyTo = new char[8];
       System.arraycopy(nizIzKojegKopiramo, 2, copyTo, 0, copyTo.length);
        System.out.println(copyTo);
    }
}
