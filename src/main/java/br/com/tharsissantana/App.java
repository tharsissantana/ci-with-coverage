package br.com.tharsissantana;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Hello World!");
        } else {
            System.out.println(String.format("Hello %s! ", args[0]));
        }
    }
}
