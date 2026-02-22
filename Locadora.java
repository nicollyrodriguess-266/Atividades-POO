/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author ander
 */
public class Locadora{
    public static void main(String[] args) {
        Veiculos carro = new Veiculos();
        carro.modelo = "Toyota Corolla";
        carro.valorDiaria = 150.0;

        Locacao locacao = new Locacao();
        locacao.veiculo = carro;
        locacao.dias = 5;

        locacao.mostrarResumo();
    }

}
