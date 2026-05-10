
package view;

import controller.ChamadoController;
import model.Chamado;
import java.util.List;
import java.util.Scanner;

public class ChamadoView {

    private Scanner sc = new Scanner(System.in);
    private ChamadoController controller = new ChamadoController();

    // ================= CADASTRAR =================
    public void cadastrar() throws Exception {

        Chamado chamado = new Chamado();

        System.out.print("Titulo: ");
        chamado.setTitulo(sc.nextLine());

        System.out.print("Descricao: ");
        chamado.setDescricao(sc.nextLine());

        System.out.print("Prioridade: ");
        chamado.setPrioridade(sc.nextLine());

        System.out.print("Status: ");
        chamado.setStatus(sc.nextLine());

        controller.salvar(chamado);

        System.out.println("Chamado cadastrado!");
    }

    // ================= LISTAR =================
    public void listar() throws Exception {

        List<Chamado> lista = controller.listar();

        System.out.println("\n--- CHAMADOS ---");

        for (Chamado c : lista) {
            System.out.println("ID: " + c.getId());
            System.out.println("Titulo: " + c.getTitulo());
            System.out.println("Descricao: " + c.getDescricao());
            System.out.println("Prioridade: " + c.getPrioridade());
            System.out.println("Status: " + c.getStatus());
            System.out.println("-----------------------");
        }
    }

    // ================= ATUALIZAR =================
    public void atualizar() throws Exception {

        Chamado chamado = new Chamado();

        System.out.print("ID do chamado: ");
        chamado.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Novo titulo: ");
        chamado.setTitulo(sc.nextLine());

        System.out.print("Nova descricao: ");
        chamado.setDescricao(sc.nextLine());

        System.out.print("Nova prioridade: ");
        chamado.setPrioridade(sc.nextLine());

        System.out.print("Novo status: ");
        chamado.setStatus(sc.nextLine());

        controller.atualizar(chamado);

        System.out.println("Chamado atualizado!");
    }

    // ================= DELETAR =================
    public void deletar() throws Exception {

        System.out.print("ID do chamado: ");
        int id = sc.nextInt();
        sc.nextLine();

        controller.deletar(id);

        System.out.println("Chamado Deletado");
    }
}
