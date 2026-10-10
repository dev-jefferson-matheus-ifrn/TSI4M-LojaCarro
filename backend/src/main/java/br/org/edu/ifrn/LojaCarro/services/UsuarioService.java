package br.org.edu.ifrn.LojaCarro.services;

import br.org.edu.ifrn.LojaCarro.UsuarioException;
import br.org.edu.ifrn.LojaCarro.model.Usuario;
import br.org.edu.ifrn.LojaCarro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        validarusuario(usuario);
        return usuarioRepository.save(usuario);
    }

    public void deleteById(Long id) {
        if(id <= 0){
            throw new UsuarioException("O ID do usuário não pode ser negativo. ID fornecido: " + id);
        }
        usuarioRepository.deleteById(id);
    }

    public Optional<Usuario> findById(Long id) {
        if(id <= 0){
            throw new UsuarioException("O ID do usuário não pode ser negativo. ID fornecido: \" + id");
        }

        return usuarioRepository.findById(id);
    }

    public List<Usuario> findAll() {return usuarioRepository.findAll();}

    public Usuario update(Usuario usuario) {
        if (usuario.getId() == null) {
            throw new UsuarioException("O ID do Usuário para atualização não pode ser nulo.");
        }
        if (!usuarioRepository.existsById(usuario.getId())) {
            throw new UsuarioException("Usuário com ID " + usuario.getId() + " não encontrado para atualização.");
        }

        return usuarioRepository.save(usuario);
    }

    private void validarusuario(Usuario usuario) {
        if(usuario.getEmail().isEmpty() || usuario.getNome().isEmpty() || usuario.getCargo().isEmpty()) throw new UsuarioException("Todos os campos devem ser preenchidos");
    }
}
