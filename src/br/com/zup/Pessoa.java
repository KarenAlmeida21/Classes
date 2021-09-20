package br.com.zup;
//criando classe
public class Pessoa {
    //Classe Pessoa: Crie uma classe que modele uma pessoa, toda pessoa
    //contém nome, idade, peso e altura. No construtor, o peso é opcional, com
    //valor default (padrão) zero e os demais atributos são obrigatórios.
    int idade;
    int peso=0;
    double altura;

    public Pessoa(int idade, double altura){
        this.idade=idade;

        this.altura=altura;
    }

}





