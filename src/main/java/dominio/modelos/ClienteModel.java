package dominio.modelos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ClienteModel {


    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    private String Email;

    public ClienteModel() {
    }

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
}
