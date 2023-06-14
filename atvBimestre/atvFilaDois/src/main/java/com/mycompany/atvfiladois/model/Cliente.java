/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvfiladois.model;

/**
 *
 * @author igorv
 */
public class Cliente {
    private int senha;
    private String nome;
    public int anoNascimento;
    
    public Cliente(){}
    
    public Cliente(int senha, String nome, int anoNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "senha=" + senha + ", nome=" + nome + ", anoNascimento=" + anoNascimento + '}';
    }
    
 
}
