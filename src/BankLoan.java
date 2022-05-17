import java.util.Scanner;
public class BankLoan {
    /*
    Calcule o valor final de um emprestimo, a partir do valor solicitado.
    Taxas e parcelas influenciam - Defina arbitrariamente as faixas que influenciam nos valores
     */
    public BankLoan() {

        System.out.println("Olá! Aqui você pode realizar a simulação de um emprestimo! Veja abaixo as regras:");
        System.out.println("1. O valor minimo a ser solicitado é de 1.000,00");
        System.out.println("2. O numero maximo de parcelas em caso de financiamento é de 12x");
        System.out.println("3. Ainda sobre parcelamento, caso dentro dessa condição, será acrescido 10% em cima de cada parcela");
        System.out.println("Lembrando que: Se o valor for maior que 2000,00 a taxa a ser cobrada por parcela passa a ser de 30%");
        System.out.println("Vamos la! Agora me informe o valor a ser solicitado, e o numero de parcelas: ");

        Scanner sc = new Scanner(System.in);

        int valor;
        valor = sc.nextInt();
        int parcelas;
        parcelas = sc.nextInt();

        System.out.println("Voce informou desejar o valor de " + valor + " reais, para pagamento em " + parcelas + " parcelas");

        if (valor <= 2000) {

            int taxa;
            taxa = 10;
            int valorParcelas;
            valorParcelas = valor / parcelas;
            int percentualPorParcelas;
            percentualPorParcelas = valorParcelas * taxa / 100;
            int parcelaTotal;
            parcelaTotal = valorParcelas + percentualPorParcelas;
            int acrescimo;
            acrescimo = percentualPorParcelas * parcelas;
            int total;
            total = valor + acrescimo;

            System.out.println("O valor de seu emprestimo totalizou: " + total);
            System.out.println("O total de acrescimos foi de: " + acrescimo);

        } else if (valor >= 2001) {

            int taxa;
            taxa = 30;
            int valorParcelas;
            valorParcelas = valor / parcelas;
            int percentualPorParcelas;
            percentualPorParcelas = valorParcelas * taxa / 100;
            int parcelaTotal;
            parcelaTotal = valorParcelas + percentualPorParcelas;
            int acrescimo;
            acrescimo = parcelaTotal * parcelas;
            int total;
            total = valor + acrescimo;

            System.out.println("O valor de seu emprestimo totalizou: " + total);
            System.out.println("O total de acrescimos foi de: " + acrescimo);
        }

        sc.close();

    }
}
