package persistencia;

import dominio.modelos.UsuarioModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Optional;

@Entity
public class Usuario {


    @Id
    @GeneratedValue
    private Long codigo;
    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario() {
    }

    public Usuario(Long codigo, String usuario, String senha) {
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


    public static Usuario fromUsuarioModel(UsuarioModel pModel){
        return new Usuario(pModel.getCodigo(),pModel.getUsuario(),pModel.getSenha());
    }

    public static UsuarioModel toUsuarioModel(Usuario prod){
        return new UsuarioModel(prod.getCodigo(),prod.getUsuario(),prod.getSenha());
    }
}
