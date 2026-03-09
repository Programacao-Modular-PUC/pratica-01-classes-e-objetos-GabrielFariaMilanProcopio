/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class TrianguloRetangulo
{
    private double h;
    private double c1;
    private double c2;

    public void setC1(double c1)
    {
        this.c1 = c1;
    }

    public void setC2(double c2)
    {
        this.c2 = c2;
    }

    public double getH()
    {
        return h;
    }

    public double getC1()
    {
        return c1;
    }

    public double getC2()
    {
        return c2;
    }

    public double calculaHipotenusa()
    {
        this.h = Math.sqrt((this.c1 * this.c1) + (this.c2 * this.c2));
        return this.h;
    }

    public double calculaArea()
    {
        return (this.c1 * this.c2) / 2;
    }
}

