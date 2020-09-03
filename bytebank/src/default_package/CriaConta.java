package default_package;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo de sua conta é de " + primeiraConta.saldo + " Reais");

        Conta segundaConta = new Conta();

        segundaConta.saldo = 50;
    }
}
