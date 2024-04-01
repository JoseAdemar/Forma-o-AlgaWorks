package com.cofrinho.moedas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        opcaoCofrinho();
        imprimirQuatroLinhaEmBranco();
        try {
            int opcaoEscolhida = scanner.nextInt();
            final int ADICIONAR_MOEDA = 1;
            final int REMOVER_MOEDA = 2;
            final int REAL = 1;
            final int DOLAR = 2;
            final int EURO = 3;
            final int REMOVER_REAL = 1;
            final int REMOVER_DOLAR = 2;
            final int REMOVER_EURO = 3;
            final int LISTAR_MOEDAS = 3;
            final int TOTAL_DE_MOEDAS_CONVERTIDAS_PARA_REAL = 4;

            while (opcaoEscolhida != 0) {

                switch (opcaoEscolhida) {
                    case ADICIONAR_MOEDA: {
                        imprimirVinteUmaLinhaEmBranco();
                        System.out.println("Opcao escolhida 1 Adicionar 🗳️");
                        opcaoMoeda();
                        opcaoEscolhida = scanner.nextInt();

                        if (opcaoEscolhida == REAL) {
                            imprimirVinteUmaLinhaEmBranco();
                            System.out.println("Você escolheu a opção 1 adicionar real 💸");
                            System.out.println("Digite o valor");
                            imprimirQuatroLinhaEmBranco();
                            opcaoReal(cofrinho, opcaoEscolhida);
                            opcaoEscolhida = scanner.nextInt();
                        } else if (opcaoEscolhida == DOLAR) {
                            imprimirVinteUmaLinhaEmBranco();
                            System.out.println("Você escolheu a opção 2 adicionar dolar 💸");
                            System.out.println("Digite o valor");
                            imprimirQuatroLinhaEmBranco();
                            opcaoDolar(cofrinho, opcaoEscolhida);
                            opcaoEscolhida = scanner.nextInt();
                        } else if (opcaoEscolhida == EURO) {
                            imprimirVinteUmaLinhaEmBranco();
                            System.out.println("Você escolheu a opção 3 adicionar euro 💸");
                            System.out.println("Digite o valor");
                            imprimirQuatroLinhaEmBranco();
                            opcaoEuro(cofrinho, opcaoEscolhida);
                            opcaoEscolhida = scanner.nextInt();
                        }
                        break;
                    }

                    case REMOVER_MOEDA: {
                        imprimirVinteUmaLinhaEmBranco();
                        System.out.println("Opcao escolhida 2 remover moeda");
                        opcaoMoeda();
                        opcaoEscolhida = scanner.nextInt();

                        if (opcaoEscolhida == REMOVER_REAL) {
                            imprimirVinteUmaLinhaEmBranco();
                            System.out.println("Você escolheu a opção 1 remover real");
                            System.out.println("Digite o valor");
                            opcaoRemoverReal(cofrinho);
                            opcaoEscolhida = scanner.nextInt();
                        } else if (opcaoEscolhida == REMOVER_DOLAR) {
                            imprimirVinteUmaLinhaEmBranco();
                            System.out.println("Você escolheu a opção 2 remover dolar");
                            System.out.println("Digite o valor");
                            opcaoRemoverDolar(cofrinho);
                            opcaoEscolhida = scanner.nextInt();
                        } else if (opcaoEscolhida == REMOVER_EURO) {
                            imprimirVinteUmaLinhaEmBranco();
                            System.out.println("Você escolheu a opção 3 remover euro");
                            System.out.println("Digite o valor");
                            opcaoRemoverEuro(cofrinho);
                            opcaoEscolhida = scanner.nextInt();
                        }
                        break;
                    }
                    case LISTAR_MOEDAS: {
                        imprimirVinteUmaLinhaEmBranco();
                        System.out.println("Você escolheu a opção 3 listar moedas");
                        cofrinho.listagemMoedas();
                        opcaoCofrinho();
                        imprimirQuatroLinhaEmBranco();
                        opcaoEscolhida = scanner.nextInt();
                        break;
                    }

                    case TOTAL_DE_MOEDAS_CONVERTIDAS_PARA_REAL: {
                        imprimirVinteUmaLinhaEmBranco();
                        System.out.println("Você escolheu a opção total convertido para real");
                        System.out.println(String.format("Total convertido = %.2f%n", cofrinho.totalConvertido()));
                        opcaoCofrinho();
                        imprimirQuatroLinhaEmBranco();
                        opcaoEscolhida = scanner.nextInt();
                        break;
                    }
                    default: {
                        System.out.println("❌ " + opcaoEscolhida + " é uma opão inválida");
                        opcaoCofrinho();
                        imprimirQuatroLinhaEmBranco();
                        opcaoEscolhida = scanner.nextInt();
                        break;
                    }
                }
            }
            System.out.println("Sistema encerrado 🔐");
            scanner.close();
        } catch (RuntimeException ex) {
            imprimirVinteUmaLinhaEmBranco();
            System.out.println("❌ " + scanner.next() + " é uma opção inválida, deve ser somente números inteiros");
            main(args);
        }
    }

    private static void opcaoRemoverEuro(Cofrinho cofrinho) {
        Scanner scanner = new Scanner(System.in);
        Euro euro = new Euro();
        euro.valor = scanner.nextDouble();
        Moeda moeda = euro;
        if (cofrinho.listagemMoedas().contains(moeda)) {
            cofrinho.remover(moeda);
        }

        opcaoCofrinho();
        imprimirQuatroLinhaEmBranco();
    }

    private static void opcaoRemoverDolar(Cofrinho cofrinho) {
        Scanner scanner = new Scanner(System.in);
        Dolar dolar = new Dolar();
        dolar.valor = scanner.nextDouble();
        Moeda moeda = dolar;
        if (cofrinho.listagemMoedas().contains(moeda)) {
            cofrinho.remover(moeda);
        }

        opcaoCofrinho();
        imprimirQuatroLinhaEmBranco();
    }

    private static void opcaoRemoverReal(Cofrinho cofrinho) {
        Scanner scanner = new Scanner(System.in);
        Real real = new Real();
        real.valor = scanner.nextDouble();
        Moeda moeda = real;
        if (cofrinho.listagemMoedas().contains(moeda)) {
            cofrinho.remover(moeda);
        }
        opcaoCofrinho();
        imprimirQuatroLinhaEmBranco();
    }

    private static void opcaoEuro(Cofrinho cofrinho, int opcaoEscolhida) {
        Scanner scanner = new Scanner(System.in);
        Euro euro = new Euro();
        euro.valor = scanner.nextDouble();
        imprimirVinteUmaLinhaEmBranco();
        cofrinho.adicionar(euro);
        opcaoCofrinho();
        imprimirQuatroLinhaEmBranco();
    }

    private static void opcaoDolar(Cofrinho cofrinho, int opcaoEscolhida) {
        Scanner scanner = new Scanner(System.in);
        Dolar dolar = new Dolar();
        dolar.valor = scanner.nextDouble();
        imprimirVinteUmaLinhaEmBranco();
        cofrinho.adicionar(dolar);
        opcaoCofrinho();
        imprimirQuatroLinhaEmBranco();
    }

    private static void opcaoReal(Cofrinho cofrinho, int opcaoEscolhida) {
        Scanner scanner = new Scanner(System.in);
        Real real = new Real();
        real.valor = scanner.nextDouble();
        imprimirVinteUmaLinhaEmBranco();
        cofrinho.adicionar(real);
        opcaoCofrinho();
        imprimirQuatroLinhaEmBranco();
    }

    private static void opcaoCofrinho() {
        System.out.println();
        System.out.println("COFRINHO💰💰");
        System.out.println("[1] ---> Adicionar");
        System.out.println("[2] ---> Remover Moedas");
        System.out.println("[3] ---> Listar Moedas");
        System.out.println("[4] ---> Calcular total convertido para Real");
        System.out.println("[0] ---> Encerrar");
    }

    private static void opcaoMoeda() {
        System.out.println("Escolha a Moeda:");
        System.out.println("[1] ---> Real:");
        System.out.println("[2] ---> Dolar:");
        System.out.println("[3] ---> Euro:");
        imprimirQuatroLinhaEmBranco();
    }

    private static void imprimirVinteUmaLinhaEmBranco() {
        for (int i = 0; i < 21; i++) {
            System.out.println();
        }
    }

    private static void imprimirQuatroLinhaEmBranco() {
        for (int i = 0; i < 4; i++) {
            System.out.println();
        }
    }
}
