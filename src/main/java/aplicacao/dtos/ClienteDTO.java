package aplicacao.dtos;



import dominio.modelos.ClienteModel;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class ClienteDTO {


    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    private String Email;



    public ClienteDTO(long codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        Email = email;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setEmail(String email) {
        Email = email;
    }
    @Override
    public String toString() {
        return "ClienteDTO{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
    public static ClienteDTO fromModel(ClienteModel cliente){
        return new ClienteDTO(cliente.getcodigo(), cliente.getNome(), cliente.getEmail());
    }
}
