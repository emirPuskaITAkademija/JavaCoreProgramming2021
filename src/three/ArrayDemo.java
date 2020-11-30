package three;

public class ArrayDemo {
    public static void main(String[] args) {
        //tip ime = podatak;
        int number = 23;
        number = 34;
        /*
         NIZ -> složeni tip podatka
         <li>1. način
         */
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 34;
        //numbers[2] = 45;
        //2. način
        int[] numbers1 = {23, 34,};
        System.out.println(numbers1[1]);//34
    }
}
