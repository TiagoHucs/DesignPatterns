package creational.builder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando construção de foguete");

        System.out.print("Nome do foguete: ");
        String nome = scanner.nextLine();

        System.out.print("Será tripulado? (S)im (N)ão: ");
        String tripulado = scanner.nextLine();

        Foguete foguete = FogueteBuilder.builder()
                .nome(nome)
                .tripulado(tripulado.equals("S"))
                .build();

        System.out.println("Foguete " + foguete.getNome() + " tripulado: " + foguete.isTripulado() + " construido!");
        scanner.close();
    }
}
