/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Chamado;
import dao.ChamadoDAO;

import java.util.List;
/**
 *
 * @author Bryan
 */
public class TesteChamadoDAO {

    public static void main(String[] args) {

        try {

            ChamadoDAO dao = new ChamadoDAO();

            // ===== TESTE INSERT =====
            Chamado chamado = new Chamado(
                    "Erro no sistema2",
                    "Sistema não abre",
                    "Alta"
            );

            chamado.setStatus("Aberto");

            dao.salvar(chamado);

            System.out.println("Chamado inserido com sucesso!");



            // ===== TESTE LISTAR =====
            List<Chamado> lista = dao.listar();

            System.out.println("\n--- LISTA DE CHAMADOS ---");

            for (Chamado c : lista) {
                System.out.println("ID: " + c.getId());
                System.out.println("Título: " + c.getTitulo());
                System.out.println("Descrição: " + c.getDescricao());
                System.out.println("Prioridade: " + c.getPrioridade());
                System.out.println("Status: " + c.getStatus());
                System.out.println("------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

