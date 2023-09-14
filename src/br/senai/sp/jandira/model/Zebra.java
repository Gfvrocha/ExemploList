package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Zebra {
    Scanner scanner = new Scanner(System.in);
    String nome, apelido;
    int idade;

    public void cadastrarZebra(){
        System.out.println("=0=0=   ZEBRA   =0=0=");
        System.out.println("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o apelido: ");
        apelido = scanner.nextLine();
        System.out.println("Informe a idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("=0=0= Cadastro Finalizado =0=0=");



    }

}
