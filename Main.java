import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        System.out.print("Введите число: ");
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(consoleReader.readLine());
        long fact = 1;
        for(; num1 > 0; fact *= num1, --num1);
        System.out.println("Факториал = " + fact);

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        do
        {
            System.out.print("Введите число: ");
        }
        while(Integer.parseInt(consoleReader.readLine()) < 0);

        System.out.println("********************");
        System.out.println("Задача 3");
        System.out.println("********************");
        System.out.print("Введите число N: ");
        num1 = Integer.parseInt(consoleReader.readLine());
        int counter = 0;
        long sum = 0;
        while(counter++ < num1)
            if (((counter % 3) == 0) || ((counter % 5) == 0))
                sum += counter;
        System.out.println("Сумма чисел от 1 до " + num1 + ", делящихся на 3 или 5 = " + sum);
    }
}