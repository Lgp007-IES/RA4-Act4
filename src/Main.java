import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        switch (scanner.nextInt()){
            case 1:{
                System.out.println(new miniCalculadora().raizCuadrada(numero));
            }
            case 2:{
                System.out.println(new miniCalculadora().valorAbsoluto(numero));
            }
        }
    }
}