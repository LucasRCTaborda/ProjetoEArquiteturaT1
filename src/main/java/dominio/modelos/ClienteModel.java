package dominio.modelos;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

    @Override
    public String toString() {
        return "ClienteModel{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
