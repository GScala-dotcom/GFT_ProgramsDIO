import java.util.Scanner;

public class ExercisesDio {

    public static void main (String[] arg) {

        System.out.println("Olá! Aqui você terá acesso aos seguintes programas: ");
        System.out.println("1 - BasicOperations, 2 - TimeDefiner e 3 - BankLoan");
        System.out.println("Digite o numero do programa que deseja acessar:");

        Scanner sc = new Scanner(System.in);

        int program;
        program = sc.nextInt();

        if (program == 1) {
            BasicOperations realizarCalculos = new BasicOperations();
        } else if (program == 2) {
            TimeDefiner definirPeriodo = new TimeDefiner();
        } else if (program == 3) {
            BankLoan verificarEmprestimo = new BankLoan();
        }

        sc.close();

    }
}
