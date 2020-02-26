package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vector a, b, sum, dif;
        float x1, y1, z1, x2, y2, z2, mul;
        double len_a, len_b, vector_cos;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a.x = ");
        x1 = in.nextFloat();
        System.out.print("Введите a.y = ");
        y1 = in.nextFloat();
        System.out.print("Введите a.z = ");
        z1 = in.nextFloat();
        a = new Vector(x1, y1, z1);
        System.out.print("Введите b.x = ");
        x2 = in.nextFloat();
        System.out.print("Введите b.y = ");
        y2 = in.nextFloat();
        System.out.print("Введите b.z = ");
        z2 = in.nextFloat();
        b = new Vector(x2, y2, z2);
        System.out.println("___________________________________________");
        a.show("a");
        b.show("b");
        System.out.println("___________________________________________");
        sum = VectorTools.sum(a, b);
        dif = VectorTools.dif(a, b);
        mul = VectorTools.mul(a, b);
        len_a = VectorTools.len(a);
        len_b = VectorTools.len(b);
        vector_cos = VectorTools.cos(a, b);
        sum.show("sum");
        dif.show("dif");
        System.out.println("mul = "+mul);
        System.out.println("len_a = " + len_a);
        System.out.println("len_b = " + len_b);
        System.out.println("vector_cos = " + vector_cos);
    }
}
