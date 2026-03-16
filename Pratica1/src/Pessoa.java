/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Calendar;

public class Pessoa
{
    private String nome;
    private String sobrenome;
    private Data dataNascimento;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, Data dataNascimento, double altura, double peso)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public Data getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getImc()
    {
        return imc;
    }

    public void calculaIMC()
    {
        this.imc = this.peso / (this.altura * this.altura);
    }

    public int calculaIdade()
    {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);

        return anoAtual - this.dataNascimento.getAno();
    }

    public String informaObesidade()
    {
        if (imc < 18.5)
        {
            return "Abaixo do peso";
        }
        else if (imc < 25)
        {
            return "Peso normal";
        }
        else if (imc < 30)
        {
            return "Sobrepeso";
        }
        else if (imc < 35)
        {
            return "Obesidade grau I";
        }
        else if (imc < 40)
        {
            return "Obesidade grau II";
        }
        else
        {
            return "Obesidade grau III";
        }
    }
}