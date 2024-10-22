import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);


        String message = "\n\n!Bienvenido a BancoAppÂ¡\n\n";

        message += "1. Retirar Dinero\n";
        message += "2. Depositar Dinero\n";
        message += "3. Transferir Dinero\n";


        System.out.println(message);
        int opcion;
        System.out.println("Elige tu opcion: ");

        opcion = Scanner.nextInt();

        switch (opcion) {
            case 1:
                Scanner Scanner1 = new Scanner(System.in);
                int sueldo = 25000;
                System.out.println("Su sueldo actual es :" + sueldo + "\n");
                System.out.println("Introduce la cantidad de dinero que quieres retirar:");

                try {
                    String input = Scanner1.nextLine();
                    int numero = Integer.parseInt(input);

                    int resultado = sueldo - numero;
                    System.out.println("Te quedo " + resultado + " en la cuenta");

                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un numero entero valido ");
                } catch (ArithmeticException e) {
                    System.out.println("Error: No tienes los fondos suficientes");
                } finally {
                    System.out.println("Gracias por usar el programa");
                    Scanner.close();
                }
                break;


            case 2:
                Scanner Scanner2 = new Scanner(System.in);
                int sueldo1 = 25000;
                System.out.println("Su sueldo actual es :" + sueldo1 + "\n");
                System.out.println("Introduce la cantidad de dinero que quieres Depositar:");

                try {
                    String input = Scanner2.nextLine();
                    int numero = Integer.parseInt(input);

                    int resultado = sueldo1 + numero;
                    System.out.println("Te quedo " + resultado + " en la cuenta");

                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un numero entero valido ");
                } catch (ArithmeticException e) {
                    System.out.println("Error: No tienes los fondos suficientes");
                } finally {
                    System.out.println("Gracias por usar el programa");
                    Scanner.close();
                }
                break;
            case 3:
                Scanner Scanner3 = new Scanner(System.in);
                Scanner Scanner4 = new Scanner(System.in);
                int sueldo2 = 25000;


                System.out.println("Su sueldo actual es :" + sueldo2 + "\n");
                System.out.println("Introduce la cantidad de dinero que quieres transferir");




                try {

                    String input = Scanner3.nextLine();
                    int numero = Integer.parseInt(input);
                    System.out.println("Introduce el nombre de la persona a quien le vas a transferir dinero");
                    String name = Scanner4.nextLine();

                    int resultado = sueldo2 - numero;
                    System.out.println("Te quedo " + resultado + " en la cuenta");
                    System.out.println("Le mandaste "+numero + " a " + name);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un numero entero valido ");
                } catch (ArithmeticException e) {
                    System.out.println("Error: No tienes los fondos suficientes");
                } finally {
                    System.out.println("Gracias por usar el programa");
                    Scanner.close();
                }
                break;
        }

    }}