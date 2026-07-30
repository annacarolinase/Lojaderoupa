package DAOs;

import java.util.ArrayList;
import beans.Usuario;

public class UsuarioDAO {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // CREATE
    public void adicionar(Usuario usuario) {
        usuarios.add(usuario);
    }

    // READ
    public ArrayList<Usuario> listar() {
        return usuarios;
    }

    public Usuario buscar(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null;
    }

    // UPDATE
    public boolean atualizar(String cpf, Usuario novoUsuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCpf().equals(cpf)) {
                usuarios.set(i, novoUsuario);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean remover(String cpf) {
        Usuario usuario = buscar(cpf);

        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }

        return false;
    }
}