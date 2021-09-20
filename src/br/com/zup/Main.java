package br.com.zup;

public class Main {

    public static void main(String[] args) {
        // Classe Pessoa: Crie uma classe que modele uma pessoa, toda pessoa
        //contém nome, idade, peso e altura. No construtor, o peso é opcional, com
        //valor default (padrão) zero e os demais atributos são obrigatórios.

        //instanciando objeto
        Pessoa ana  = new Pessoa(20, 1.80);
       ana.peso = 3;

        System.out.println(ana.peso);
        System.out.println(ana.idade);
        System.out.println(ana.altura);




        //atributos sem preenchimento
        //ana.altura = 1.50;
        //ana.idade = 20;
        //ana.peso = 55;

    }
}
