package view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ChamadoView view = new ChamadoView();

        int opcao;

        do {

            System.out.println("\n===== SISTEMA HELP DESK =====");
            System.out.println("1 - Cadastrar Chamado");
            System.out.println("2 - Listar Chamados");
            System.out.println("3 - Atualizar Chamado");
            System.out.println("4 - Deletar Chamado");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    view.cadastrar();
                    break;

                case 2:
                    view.listar();
                    break;

                case 3:
                    view.atualizar();
                    break;

                case 4:
                    view.deletar();
                    break;
            }

        } while (opcao != 0);

        System.out.println("Sistema finalizado.");
    }
}