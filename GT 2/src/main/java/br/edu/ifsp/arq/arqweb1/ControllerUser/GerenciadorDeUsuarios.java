package br.edu.ifsp.arq.arqweb1.ControllerUser;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.arq.arqweb1.Model.Usuario;

// Classe responsável por gerenciar os usuários do sistema
public class GerenciadorDeUsuarios {
    // Lista estática de usuários
    private static List<Usuario> listaDeUsuarios = new ArrayList<>();

    // Método para obter a lista de usuários
    public static List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    // Método para adicionar um novo usuário
    public static boolean adicionarUsuario(Usuario usuario) {
        // Verifica se já existe um usuário com o mesmo email
        for (Usuario u : listaDeUsuarios) {
            if (u.getEmail().equals(usuario.getEmail())) {
                return false; // Retorna falso se o email já estiver em uso
            }
        }
        // Adiciona o usuário à lista e retorna verdadeiro
        return listaDeUsuarios.add(usuario);
    }

    // Método para buscar um usuário por email e senha
    public static boolean buscarUsuario(String email, String senha) {
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return true; // Retorna verdadeiro se encontrar o usuário
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }

    // Método para buscar um usuário por ID
    public static boolean buscarUsuario(int id) {
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.getId() == id) {
                return true; // Retorna verdadeiro se encontrar o usuário
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }

    // Método para atualizar a senha de um usuário
    public static boolean atualizarUsuario(String email, String senha, String novaSenha, String novoE) {
        for (Usuario u : listaDeUsuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                if(verificaEmail(novoE)) {
                	u.setSenha(novaSenha);// Atualiza a senha do usuário
                	u.setEmail(novoE);
                	return true;
                }else {
                	return false;
                }
                
                 
            }
        }
        return false; // Retorna falso se o usuário não for encontrado ou a senha não puder ser atualizada
    }

    // Método para excluir um usuário por email e senha
    public static boolean excluirUsuario(String email, String senha) {
        for (Usuario u : listaDeUsuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return listaDeUsuarios.remove(u); // Remove o usuário da lista e retorna verdadeiro
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }

    // Método para excluir um usuário por ID
    public static boolean excluirUsuario(int id) {
        for (Usuario u : listaDeUsuarios) {
            if (u.getId() == id) {
                return listaDeUsuarios.remove(u); // Remove o usuário da lista e retorna verdadeiro
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }

    // Método para buscar um usuário por ID em uma lista específica de usuários
    public static Usuario buscarUsuario(int id, List<Usuario> listaDeUsuarios) {
        for (Usuario t : listaDeUsuarios) {
            if (t.getId() == id) {
                return t; // Retorna o usuário se encontrado na lista especificada
            }
        }
        return null; // Retorna null se o usuário não for encontrado na lista especificada
    }
    private static boolean verificaEmail(String email) {
    	boolean verifica = true;
    	
    	for (Usuario u : listaDeUsuarios) {
             if (u.getEmail().equals(email)) {
                 verifica = false;
        
             } 
             
         }
    	 
    	 
         return verifica; 
    }
}
