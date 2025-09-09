package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        /*
         Exercicio 1
         joão é  um professor de matematica e precisa de um programa
         que faça o calculo da seguinte expressao:
         (x*8 + 1) - x + y /100
         faça um programa que resolva o problema da expressao qu o joao
         precisa
         Lembre-se pense na usabilidade
         
         */
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o valor da Variavel X:");
        var x = Integer.parseInt(entrada.readLine());

        System.out.println("Digite o valor da Variavel Y:");
        var y = Integer.parseInt(entrada.readLine());

        var resultado = (x * 8 + 1) - (x + y) / 100;

        System.out.printf(
    "O resultado da expressao (x * 8 +1) - (x + y)/100 " +
    "usando o valor de x(%d) e y(%d) é %d", 
    x, y, resultado);





                 // BufferedReader reader = new BufferedReader(
                //         new InputStreamReader(System.in));
                // System.out.println("Digite  o seu nome");
                // var nome = reader.readLine();
                // System.out.println("Digite a sua idade");
                // int idade = Integer.parseInt(reader.readLine());
                // System.out.printf("o nome e idade   são: %s e %d\n", nome, idade);

    }

}
