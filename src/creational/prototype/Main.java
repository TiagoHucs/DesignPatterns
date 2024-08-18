package creational.prototype;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando construção de foguete");

        Foguete foguete = new Foguete();

        System.out.print("Nome do foguete: ");
        foguete.setNome(scanner.nextLine());

        System.out.print("Quanto de combustivel: ");
        foguete.setCombustivel(scanner.nextInt());

        Foguete clonado = (Foguete) foguete.clone();

        System.out.println("Este é o foguete: " + foguete.toString());
        System.out.println("Este é 0 clonado: " + clonado.toString());



        scanner.close();
    }
}
