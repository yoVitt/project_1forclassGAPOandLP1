
package br.com.projeto_1.ctr;

import java.sql.ResultSet;
import br.com.projeto_1.dto.ClienteDTO;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String inserirCliente(ClienteDTO clienteDTO){
        try{
            if(clienteDAO.inserirCliente(clienteDTO)){
                return "Cliente Cadastrado com Sucesso!!";
            }else{
                return "Cliente NÂO Cadastrado.";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO Cadastrado";
        }
    }
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao){
        ResultSet rs = null;
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;
    }
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
    public String alterarCliente(ClienteDTO clienteDTO){
        try{
            if(clienteDAO.alterarCliente(clienteDTO)){
                return "Cliente alterado com Sucesso!!";
            }else{
                return "Cliente NÂO Alterado.";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO Alterado!";
        }
    }
    
    public String excluirCliente(ClienteDTO clienteDTO){
        try{
            if(clienteDAO.excluirCliente(clienteDTO)){
                return "Cliente excluido com Sucesso!!";
            }else{
                return "Cliente NÂO Excluido.";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO Excluido!";
        }
    }
    
    
    public ClienteCTR(){
        
    }
}
