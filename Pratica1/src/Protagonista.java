/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class Protagonista
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);

        p.calculaIMC();

        System.out.printf("IMC: %.2f\n", p.getImc());
        System.out.println("Classificacao: " + p.informaObesidade());

        sc.close();
    }
}
