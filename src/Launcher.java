import java.util.NoSuchElementException;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args){
        System.out.println("coucou");
        Scanner scanner = new Scanner(System.in);

        boolean shouldQuit = false;
        do {
            System.out.println("Please, input a command:");
            String command = scanner.nextLine();
            if ("fibo".equals(command)){
                System.out.println("Input a number:");
                int n = scanner.nextInt();
                scanner.nextLine();
                System.out.println(fibo(n));
            }
            else if ("quit".equals(command)){
                shouldQuit = true;
                break;
            }
            System.out.println("Unknown command");
        }while (!shouldQuit);
    }

    private static int fibo(int n){
        return n == 0 || n== 1 ? n : fibo(n-1) + fibo(n-2);
    }

    /*private static int fibo(int n){
        if (n == 0 || n== 1) {
            return n;
        } else{
            return fibo(n-1) + fibo(n-2);
        }
    }*/
    /*private static void fibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        while (n != 1) {
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        System.out.println(f2);
    }*/
}

        /*System.out.println("ton nom");
        String name = null;
        try {

            name = scanner.nextLine();
        }catch (NoSuchElementException e){
            System.out.println("Nombre svp");
        }*/
        //System.out.println("Bonjour" + name);

        /*
        name.equals("quit") ? continue : System.out.println("Unknown command");
        */
