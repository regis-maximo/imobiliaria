/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Regis_Maximo
 */
public class Usuario {
    
    private String nome;
    private int cpf;
    private String email;
    private String login;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Usuario(String nome, int cpf, String email, String login) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
    }
    
    
    
}
