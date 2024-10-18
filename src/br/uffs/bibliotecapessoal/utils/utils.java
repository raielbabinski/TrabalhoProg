package br.uffs.bibliotecapessoal.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class utils {
    private  static Scanner scanner = new Scanner(System.in);
    
    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal.");
        }
    }

    public static int getInt(){
        int r = 0;
        try{
            r = scanner.nextInt();
        } catch (InputMismatchException e) {
                utils.limparTerminal();
                System.out.println("Erro: Por favor, insira um número.");
                scanner.nextLine();
                scanner.nextLine();
                utils.limparTerminal();
        }
        return r;
    }
    
}
