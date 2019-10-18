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
public class TestImobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("qual o NOME?");
        String creci = JOptionPane.showInputDialog("qual o CRECI?");
        int cpf = Integer.parseInt(JOptionPane.showInputDialog("qual o CPF"));
        String email = JOptionPane.showInputDialog("qual o EMAIL?");
        String login = JOptionPane.showInputDialog("qual o LOGIN?");
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Imovel?"));
        // Usuario String nome, int cpf, String endereco, String email, String login
        
        Corretor novo = new Corretor(nome, cpf, email, login);
        novo.setCreci(creci);
        novo.cadastrar(nome);
        
        Cliente reservar = new Cliente(nome, cpf, email, login);
        reservar.reservar(nome);
        
        Imovel mostrar = new Imovel(nome, cpf, email, login);
        mostrar.setValorVenda(valor);
        
        
        int cep = Integer.parseInt(JOptionPane.showInputDialog("qual o CEP"));
        int num = Integer.parseInt(JOptionPane.showInputDialog("qual o NUMERO"));
        String logradouro = JOptionPane.showInputDialog("qual o LOGRADOURO?");
        Endereco end = new Endereco(logradouro, num, cep);
        
        mostrar.mostrarInformacoes(end);
        
        end.setCep(cep);
        end.setLogradoro(logradouro);
        end.setNumero(num);
    }
    
}
