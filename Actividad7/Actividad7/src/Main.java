import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de iteraciones a usar.");
        int n = sc.nextInt();
        ArrayList<Integer> primeNumbers = getPrimeNumbers(n);
        int fibonacciSequence[] = getFibonacciSequence(n);
        System.out.println("-------------------------------");

        System.out.println("Números primos");
        for(int i = 0; i < primeNumbers.size(); i++){
            System.out.print(primeNumbers.get(i) + ", ");
        }
        System.out.println("\n-------------------------------");

        System.out.println("Sucesión de Fibonacci");
        for(int i = 0; i < fibonacciSequence.length; i++){
            System.out.print(fibonacciSequence[i] + ", ");
        }
        System.out.println("\n-------------------------------");
    }

    public static ArrayList<Integer> getPrimeNumbers(int n){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int num){
        if(num == 0 || num == 1 || num == 4){
            return false;
        }
        for(int i = 2; i < num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int[] getFibonacciSequence(int n){
        int fibonacciSequence[] = new int[n];
        for(int i = 1; i <= n; i++){
            fibonacciSequence[i-1] = getFibonacciNumber(i);
        }
        return fibonacciSequence;
    }

    public static int getFibonacciNumber(int n){
        if(n <= 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        }
    }
}