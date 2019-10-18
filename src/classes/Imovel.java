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
public class Imovel extends Usuario {
    
    private String endereco;
    private int codigo;
    private Double valorVenda;

    public Imovel(String nome, int cpf, String email, String login) {
        super(nome, cpf, email, login);
    }

    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public void mostrarInformacoes(Endereco endd) {
        System.out.println("INFORMAÇÕES");
        System.out.println("Nome "+getNome());
        System.out.println("Código "+getCodigo());
        System.out.println("cpf "+getCpf());
        System.out.println("valor "+getValorVenda());
        
       
        System.out.println("Logradoro "+endd.getLogradoro());
        System.out.println("Numero do imóvel "+endd.getNumero());
        System.out.println("CEP "+endd.getCep());
    }

    
}
