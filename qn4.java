

public class SwapNums 

{

    public static void main(String[] args) {

        float first = 5.20f, second = 2.65f;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        float temp = first;
        first = second;
        second = temp;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }