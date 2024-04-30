package persistencia.Entity;

import dominio.modelos.UsuarioModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private Long codigo;
    private String usuario;
    private String senha;
    public Usuario() {
    }
    public Usuario(long id,String usuario, String senha) {
        this.codigo=id;
        this.usuario = usuario;
        this.senha = senha;
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


    public static Usuario fromUsuarioModel(UsuarioModel uModel){
        return new Usuario(uModel.getCodigo(),uModel.getUsuario(),uModel.getSenha());
    }

    public static UsuarioModel toUsuarioModel(Usuario usua){
        return new UsuarioModel(usua.getCodigo(),usua.getUsuario(),usua.getSenha());
    }
}
