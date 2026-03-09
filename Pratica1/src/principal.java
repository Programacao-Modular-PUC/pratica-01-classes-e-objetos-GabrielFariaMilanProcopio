/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class principal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        TrianguloRetangulo t = new TrianguloRetangulo();

        System.out.print("Digite o cateto 1: ");
        double c1 = sc.nextDouble();

        System.out.print("Digite o cateto 2: ");
        double c2 = sc.nextDouble();

        t.setC1(c1);
        t.setC2(c2);

        double hipotenusa = t.calculaHipotenusa();
        double area = t.calculaArea();

        System.out.printf("Hipotenusa: %.2f\n", hipotenusa);
        System.out.printf("Area: %.2f\n", area);

        sc.close();
    }
}

