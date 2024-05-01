package dominio.modelos;


import persistencia.ClienteRepJpa;
import persistencia.Entity.Cliente;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class ClienteModel {


    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    private String Email;

    public ClienteModel(long codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        Email = email;
    }

    public long getcodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    private final ClienteRepJpa clienteRepJpa = null;

    public ClienteModel encontrCliente(long codigoCliente) {
        ClienteModel modelCliente = null;

        List<ClienteModel> todosClientes = clienteRepJpa.todos();
        for (ClienteModel umcliente : todosClientes) {
            long codx = umcliente.getcodigo();

            if (codx == codigoCliente) {
                modelCliente = umcliente;
                break;
            }
        }

        return modelCliente;
    }

    @Override
    public String toString() {
        return "ClienteModel{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }


}
