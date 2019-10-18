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
public class Cliente extends Usuario {

    public Cliente(String nome, int cpf, String email, String login) {
        super(nome, cpf, email, login);
    }
    
    public void reservar(String imovel) {
        
        JOptionPane.showMessageDialog(null, "Reservado o imóvel Com sucesoo!"+imovel);
        
    }
    
}
