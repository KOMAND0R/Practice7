package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> firstDeq = new ArrayDeque<>();
        ArrayDeque<Integer> secondDeq = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            firstDeq.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            secondDeq.add(sc.nextInt());
        }

        drinker(firstDeq, secondDeq);
    }

    static void drinker(ArrayDeque<Integer> frstDq, ArrayDeque<Integer> scndDq)
    {
        int turn = 0;

        while (!(frstDq.isEmpty() || scndDq.isEmpty()) && turn < 106)
        {
            if (frstDq.peek() == 0 && scndDq.peek() == 9)
            {
                frstDq.add(frstDq.pop());
                frstDq.add(scndDq.pop());
            }
            else if (scndDq.peek() == 0 && frstDq.peek() == 9)
            {
                scndDq.add(frstDq.pop());
                scndDq.add(scndDq.pop());
            }
            else if (frstDq.peek() > scndDq.peek())
            {
                frstDq.add(frstDq.pop());
                frstDq.add(scndDq.pop());
            }
            else if (scndDq.peek() > frstDq.peek())
            {
                scndDq.add(frstDq.pop());
                scndDq.add(scndDq.pop());
            }
            turn++;
        }

        if (scndDq.isEmpty())
        {
            System.out.print("first " + turn);
        }
        else if (frstDq.isEmpty())
        {
            System.out.print("second " + turn);
        }
        else
        {
            System.out.println("botva");
        }
    }
}
