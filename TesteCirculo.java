/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circulo;

/**
 *
 * @author ander
 */
public class TesteCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();

        System.out.println("Raio: 5");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}
