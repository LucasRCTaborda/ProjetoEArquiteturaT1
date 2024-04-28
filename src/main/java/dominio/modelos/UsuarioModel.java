package dominio.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class UsuarioModel {
    private Long codigo;
    private String usuario;
    private String senha;

    public UsuarioModel(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public UsuarioModel() {
    }

    public Long getCodigo() {
        return codigo;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" +
                "codigo=" + codigo +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
