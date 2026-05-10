/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bryan
 */
public class Chamado {
    private int id;
    private String titulo;
    private String descricao;
    private String prioridade;
    private String status;
    
    
    public Chamado(){
        
    }
    
    public Chamado(String titulo, String descricao, String prioridade ){
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }  

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getStatus() {
        return status;
    }
    
}
