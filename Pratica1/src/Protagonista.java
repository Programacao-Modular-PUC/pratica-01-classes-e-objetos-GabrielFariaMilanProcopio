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

        Pessoa pessoas[] = new Pessoa[10];

        int i;

        for (i = 0; i < 10; i++)
        {
            System.out.println("\nCadastro " + (i+1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = sc.nextLine();

            if (i > 0)
            {
                String nomeAnterior = pessoas[i-1].getNome() + pessoas[i-1].getSobrenome();

                if ((nome + sobrenome).equals(nomeAnterior))
                {
                    break;
                }
            }

            System.out.print("Dia nascimento: ");
            int dia = sc.nextInt();

            System.out.print("Mes nascimento: ");
            int mes = sc.nextInt();

            System.out.print("Ano nascimento: ");
            int ano = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            sc.nextLine();

            Data data = new Data(dia, mes, ano);

            pessoas[i] = new Pessoa(nome, sobrenome, data, altura, peso);

            pessoas[i].calculaIMC();
        }

        System.out.println("\nRESULTADOS\n");

        for (int j = 0; j < i; j++)
        {
            System.out.println("Cadastro " + (j+1) + ":");

            System.out.println("Nome completo: " +
                    pessoas[j].getNome() + " " +
                    pessoas[j].getSobrenome());

            System.out.println("Idade: " +
                    pessoas[j].calculaIdade());

            System.out.println("Peso: " +
                    pessoas[j].getPeso());

            System.out.println("Altura: " +
                    pessoas[j].getAltura());

            System.out.printf("IMC: %.2f\n",
                    pessoas[j].getImc());

            System.out.println("Classificacao: " +
                    pessoas[j].informaObesidade());

            System.out.println();
        }

        sc.close();
    }
}