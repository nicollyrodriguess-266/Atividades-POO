/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

/**
 *
 * @author ander
 */
public class Cliente {
    public static void main (String [] args){
        
        Cadastro Cadastro = new Cadastro();
        
        Cadastro.nomeCliente = "André";
        Cadastro.emailCliente = "andreramalho18.gmail.com";
        Cadastro.telefoneCliente = "(11) 9 4002-8922";
        Cadastro.quantidade = 2;
        Cadastro.valorFinal = 358.28;
        
        System.out.println("Informações:");
        Cadastro.informacoesCliente();
        Cadastro.somaDaCompra();
        Cadastro.informacaoDaCompra();
               
        
    }
}
