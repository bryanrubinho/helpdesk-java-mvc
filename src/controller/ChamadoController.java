/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ChamadoDAO;
import java.util.List;
import model.Chamado;

/**
 *
 * @author Bryan
 */
public class ChamadoController {
    private ChamadoDAO dao = new ChamadoDAO();
    
    public void salvar(Chamado chamado) throws Exception {
        dao.salvar(chamado);
    }
    
    public List<Chamado> listar() throws Exception{
        return dao.listar();
    }
    
    public Chamado consultar(int id )throws Exception{
        return dao.consultarById(id); 
    }
    
    public void atualizar(Chamado chamado) throws Exception {
        dao.atualizar(chamado);
    }
    
   public void deletar(int id) throws Exception {

    Chamado chamado = new Chamado();
    chamado.setId(id);

    Chamado encontrado = dao.consultarById(id);

    if(encontrado.getId() == 0){
        System.out.println("Chamado não encontrado!");
        return;
    }

    dao.deletar(id);
    System.out.println("Chamado deletado com sucesso!");
}
}
