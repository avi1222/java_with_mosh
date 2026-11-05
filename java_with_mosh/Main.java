package java_with_mosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x=1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        //result is 2 and 1 because x is incremented after y is assigned the value of x
    }    
}
