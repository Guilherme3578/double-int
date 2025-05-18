import java.util.Scanner;

public class flajs {
    public static void main (String [] args) {
        
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    double num1 = entrada.nextDouble();

     System.out.println("Digite o operador:('-','+','*','/')");
     char operador = entrada.next().charAt(0);

     System.out.println("Digite o segundo valor: ");
    double num2 = entrada.nextDouble();

    double resultado  = 0;
    boolean operacaoValida = true;

    if (operador == '+') {
       resultado = num1 + num2;
    }else if (operador  == '-') {
        resultado = num1 - num2;
    }else if (operador == '*') {
        resultado = num1 * num2;
    }else if (operador == '/') {
        if (num2 !=0){
            resultado = num1 / num2;
        } else {
        System.out.println("Erro na equação");
        operacaoValida = false;
        }
    } else {
        System.out.println("Operador inválido!");
        operacaoValida = false;
    }
    if (operacaoValida) {
        if (resultado % 1 == 0) {
            System.out.println("Resultado: " + (int) resultado); 
        } else {
            System.out.println("Resultado: " + resultado); 
        }
    }

    entrada.close();
}

}
