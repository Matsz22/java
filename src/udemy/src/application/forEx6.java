package udemy.src.application;

import java.util.Scanner;
public class forEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to know your dividers");

        int n = sc.nextInt();
            for(int i=1; i<=n; i++){
                if(n % i == 0){
                    System.out.println(i);
                }

            }
    }
}