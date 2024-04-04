package br.com.senai;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        final double converterEuro = 4.27;
        final double valorVeiculo = 61307;
        int quantidadadeDeParcelas = 0;
        double conversãoReal = valorVeiculo * converterEuro;

        double valorAvista = (conversãoReal - (conversãoReal*0.08));
        double valor4vezes = (conversãoReal - (conversãoReal*0.05));
        double valor8vezes = (conversãoReal - (conversãoReal*0.02));

        int valorDigitado = 0;
        do {
            System.out.println("""
                Olá Antônio Luiz, bem vindo ao sistema integrado da NEWS CARS ZIP
                
                Vimos que voce se interessou pelo nosso Mazda RX 9 saindo por € 61307
                Mas como você é nosso cliente especial, estaremos fazendo uma condição especial para voce!
                
                Digite qual a opção melhor atende sua condição de pagamento:
                1 - A vista, com 8 % de desconto;
                2 - Parcelado em 4 vezes com 5 % de desconto;
                3 - Parcelado em 8 vezes com 2 % de desconto;
                4 - Parcelado em 12 vezes;
                5 - Parcelado em mais vezes, sendo 12 sem juros e as demais recebem 2 % de juros;
                6 - Desistir da compra!
                """);

            valorDigitado = input.nextInt();
            switch (valorDigitado){
                case 1:
                    System.out.println("Ótimo, você deseja pagar a vista.");
                    System.out.println("O valor do carro convertido para Real fica igual a: R$ " + decimal.format(conversãoReal));
                    System.out.println("Como sua compra é à vista, você recebe 8% de desconto, sendo igual a: R$ " + decimal.format(valorAvista));
                    System.out.println("""
                            Deseja prosseguir com a compra?
                            1 - Finalizar compra;
                            2 - Ver outras opções;
                            """);
                    int escolha = input.nextInt();
                    if (escolha == 1) {
                        System.out.println("PARABÉNSSS VOCE ADQUIRIU UM RX-9 Á VISTA");
                        System.exit(0);
                    } else if (escolha == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida, retornando ao menu principal.");
                        break;
                    }
                case 2:
                    System.out.println("Ótimo, você deseja pagar em 4 parcelas");
                    System.out.println("O valor do carro convertido para Real fica igual a: R$ " + decimal.format(conversãoReal));
                    System.out.println("O valor final parcelado em 4 parcelas sera de: R$ " + decimal.format((valor4vezes)));
                    System.out.println("Cada parcela saira por: R$ " + decimal.format((valor4vezes/4)));
                    System.out.println("""
                            Deseja prosseguir com a compra?
                            1 - Finalizar compra;
                            2 - Ver outras opções;
                            """);
                    int escolha2 = input.nextInt();
                    if (escolha2 == 1) {
                        System.out.println("Parabéns, você comprou um Mazda RX-9 em 4 vezes");
                        System.exit(0);
                    } else if (escolha2 == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida, retornando ao menu principal.");
                        break;
                    }
                case 3:
                    System.out.println("Ótimo, você deseja pagar em 8 parcelas");
                    System.out.println("O valor do carro convertido para Real fica igual a: R$ " + decimal.format(conversãoReal));
                    System.out.println("O valor final parcelado em 8 parcelas sera de: R$ " + decimal.format((valor8vezes)));
                    System.out.println("Cada parcela saira por: R$ " + decimal.format((valor4vezes/8)));
                    System.out.println("""
                            Deseja prosseguir com a compra?
                            1 - Finalizar compra;
                            2 - Ver outras opções;
                            """);
                    int escolha3 = input.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("Parabéns, você comprou um Mazda RX-9 em 8 vezes");
                        System.exit(0);
                    } else if (escolha3 == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida, retornando ao menu principal.");
                        break;
                    }
                case 4:
                    System.out.println("Ótimo, você deseja pagar em 12 parcelas");
                    System.out.println("O valor do carro convertido para Real fica igual a: R$ " + decimal.format(conversãoReal));
                    System.out.println("O valor final parcelado em 12 parcelas sera de: R$ " + decimal.format((conversãoReal)));
                    System.out.println("Cada parcela saira por: R$ " + decimal.format((conversãoReal/12)));
                    System.out.println("""
                            Deseja prosseguir com a compra?
                            1 - Finalizar compra;
                            2 - Ver outras opções;
                            """);
                    int escolha4 = input.nextInt();
                    if (escolha4 == 1) {
                        System.out.println("Parabéns, você comprou um Mazda RX-9 em 12 parcelas");
                        System.exit(0);
                    } else if (escolha4 == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida, retornando ao menu principal.");
                        break;
                    }
                case 5:
                    System.out.println("Ótimo, você parcelar o veículo da forma que melhor atender sua compra");
                    System.out.println("O valor do carro convertido para Real fica igual a: R$ " + decimal.format(conversãoReal));
                    System.out.println("Quantas vezes você deseja parcelar? Realizamos parcelamentos em até 48 vezes com 2 % de acréscimo ao mes");
                    int parcelamento = input.nextInt();
                    while (parcelamento < 12 || parcelamento > 48){
                        System.out.println("Digite um valor maior que 12 e menor que 48");
                        parcelamento = input.nextInt();
                    }
                    double valorParcelado= (conversãoReal + ((parcelamento - 12) * (conversãoReal*0.02)));
                    System.out.println("O valor final do veículo será: R$ " + decimal.format(conversãoReal + ((parcelamento - 12) * (conversãoReal*0.02))));
                    System.out.println("Você deseja parcelar em " + parcelamento + " vezes?");
                    System.out.println("Devo informar que cada parcela saiu pelo valor de: " + decimal.format(valorParcelado/parcelamento));
                    System.out.println("""
                            Deseja prosseguir com a compra?
                            1 - Finalizar compra;
                            2 - Ver outras opções;
                            """);
                    int escolha5 = input.nextInt();
                    if (escolha5 == 1) {
                        System.out.println("É isso ai, você comprou um Mazda RX-9 em " + parcelamento + " parcelas");
                        System.exit(0);
                    } else if (escolha5 == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida, retornando ao menu principal.");
                        break;
                    }
                case 6:
                    System.out.println("Que pena Antônio, você acabou desistindo da compra :( Obrigado por visitar nossa loja.");
                    break;
                default:
                    System.out.println("Valor inválido, por favor digite um valor entre 1 e 6");
            }
        } while (valorDigitado != 6);
    }
}
