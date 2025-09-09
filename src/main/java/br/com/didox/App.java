package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) throws IOException {
   
BufferedReader reader = new BufferedReader(
    new InputStreamReader(System.in));
    
    System.out.println("Digite  o Numero primerio");

    String numero1 = reader.readLine();

    System.out.println("Digite  o Numero Segundo");

    String numero2 = reader.readLine();



        
       

        System.out.printf("o numero é: %s\n",numero1);
        System.out.printf("A soma do %s e do %s = %s\n", numero1,numero2,numero1+numero2);
        

    }

}
