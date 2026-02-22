package com.mycompany.reserva;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ander
 */
public class Hospede {
        public static void main(String[] args) {
            Reserva Hospede = new Reserva();
            
            Hospede.nomeHospede = "Yuri Alberto";
            Hospede.emailHospede = "yurialberto09@gmail.com";
            Hospede.telefoneHospede = "(11) 94002-8922";
            Hospede.diasHospedagem = 7;
            Hospede.valorDiaria = 350.78;
            
           System.out.println("Informações:");
           Hospede.informacoesHospede();
           Hospede.valorTotal();
        }
}
