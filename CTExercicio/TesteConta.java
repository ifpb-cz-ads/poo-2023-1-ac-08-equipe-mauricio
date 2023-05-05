package CTExercicio;

import CTExercicio.Contas.Conta;
import CTExercicio.Contas.ContaEspecial;
import CTExercicio.Contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.Scanner;
public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList();

        System.out.println();
        System.out.println("1 - Criar conta;");
        System.out.println("2 - Visualizar saldo de conta");
        System.out.println("3 - Sacar de uma conta");
        System.out.println("4 - Depositar em uma conta");
        System.out.println("0 - Encerra");

        System.out.println();
        System.out.print("Informe a ação desejada: ");
        int controlador = sc.nextInt();

        while (controlador!=0) {
            switch (controlador) {
                case 1:
                    System.out.println();
                    System.out.println("Informe os dados para abertura da conta:");
                    System.out.println();
                    System.out.println("1 - Simples");
                    System.out.println("2 - Poupança");
                    System.out.println("3 - Especial");
                    System.out.print("Informe o tipo da conta: ");
                    int aux = sc.nextInt();

                    System.out.print("Nome do Titular: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println();

                    switch (aux) {
                        case 1:
                            Conta conta = new Conta(contas.size(), nome);
                            System.out.println("Conta criada com sucesso!");
                            System.out.println("Numero da conta criada: " + conta.getNumero());
                            contas.add(conta);
                            break;
                        case 2:
                            ContaPoupanca contaPoupanca = new ContaPoupanca(contas.size(), nome);
                            System.out.println("Conta criada com sucesso!");
                            System.out.println("Numero da conta criada: " + contaPoupanca.getNumero());
                            contas.add(contaPoupanca);
                            break;
                        case 3:
                            System.out.print("Informe o limite da conta:");
                            aux = sc.nextInt();
                            ContaEspecial contaEspecial = new ContaEspecial(contas.size(), nome, aux);
                            System.out.println("Numero da conta criada: " + contaEspecial.getNumero());
                            contas.add(contaEspecial);
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Informe o numero da conta desejada: ");
                    aux = sc.nextInt();
                    System.out.println("Saldo da conta: " + contas.get(aux).getSaldo());
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Informe o numero da conta desejada: ");
                    aux = sc.nextInt();
                    System.out.println();
                    System.out.print("Informe o valor a ser sacado: ");
                    double valor = sc.nextDouble();
                    if (contas.get(aux).sacar(aux) == true) {
                        System.out.println("Saque efetuado com sucesso!");
                        System.out.println("Saldo: " + contas.get(aux).getSaldo());
                    }
                    else {
                        System.out.println("Saque não efetuado!");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Informe o numero da conta desejada: ");
                    aux = sc.nextInt();
                    System.out.println();
                    System.out.print("Informe o valor a ser depositado: ");
                    valor = sc.nextDouble();
                    contas.get(aux).depositar(valor);
                    System.out.println("Deposito efetuado com sucesso!");
                    System.out.println("Saldo: R$ " + contas.get(aux).getSaldo());
                    break;
            }
            System.out.println();
            System.out.println("1 - Criar conta;");
            System.out.println("2 - Visualizar saldo de conta");
            System.out.println("3 - Sacar de uma conta");
            System.out.println("4 - Depositar em uma conta");
            System.out.println("0 - Encerra");

            System.out.println();
            System.out.print("Informe a ação desejada: ");
            controlador = sc.nextInt();
        }

        sc.close();
    }
}
