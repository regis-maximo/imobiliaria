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
public class Endereco {
    
    private String logradoro;
    private int numero;
    private int cep;

    public Endereco(String logradoro, int numero, int cep) {
        this.logradoro = logradoro;
        this.numero = numero;
        this.cep = cep;
    }
    

    public String getLogradoro() {
        return logradoro;
    }

    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
   
}
