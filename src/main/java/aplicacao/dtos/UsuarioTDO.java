package aplicacao.dtos;

import dominio.modelos.UsuarioModel;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class UsuarioTDO {
    @Id
    @GeneratedValue
    private Long codigo;
    private String usuario;
    private String senha;

    public UsuarioTDO(long id ,String usuario, String senha) {
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

    public String getSenha() {
        return senha;
    }

    public static UsuarioTDO fromModel(UsuarioModel usuario){
        return new UsuarioTDO(usuario.getCodigo(), usuario.getUsuario(), usuario.getSenha());
    }
}
