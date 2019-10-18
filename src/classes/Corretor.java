/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Regis_Maximo
 */
public class Corretor extends Usuario {
    
    private String creci;
    
    
    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }
    
    
    public Corretor(String nome, int cpf, String email, String login) {
        super(nome, cpf, email, login);
    }
    
    
    public void cadastrar(String imovel) {
        
        JOptionPane.showMessageDialog(null, "Cadastrado Com sucesoo!");
        System.out.println("Creci do Corretor: "+getCreci());
        
    }

}
