package br.unifip.com.teste.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/pedidos")

public class controller {

    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    int id = 0;

    // CADASTRAR PEDIDOS:
    @PostMapping(path = { "", "/" })
    public String cadastroPedido(@RequestBody Pedido valores) {
        // incrementando o ID:
        id++;
        // cria um novo objeto do tipo pedido com as infos que vieram no body
        Pedido p1 = new Pedido(id, valores.getDescricao(),
                valores.getValor(), "PENDENTE");
        // adiciona o objeto na lista de pedidos:
        pedidos.add(p1);
        return "Pedido cadastrado com sucesso!";
    }

    // DELETAR PEDIDOS:
    @DeleteMapping(path = "/{id}")
    public String deletaPedido(@PathVariable int id) {
        // percorre toda a lista:
        for (Pedido item : pedidos) {
            // encontra o ID:
            if (item.getId() == id) {
                // seta o novo status:
                item.setStatus("EXCLUÍDO");
                return "Pedido deletado com sucesso!";
            }
        }
        // caso o ID não seja encontrado na lista:
        return "ID inexistente.";
    }

    // EFETIVAR PEDIDOS:
    @PutMapping(path = "/{id}/efetiva")
    public Pedido efetivaPedido(@PathVariable int id) {
        for (Pedido item : pedidos) {
            if (item.getId() == id) {
                item.setStatus("EFETIVADO");
                // retona o pedido atualizado:
                return item;
            }
        }
        // caso o ID não seja encontrado na lista:
        return null;
    }

    // CANCELAR PEDIDO:
    @PutMapping(path = "/{id}/cancela")
    public Pedido cancelaPedido(@PathVariable int id) {
        for (Pedido item : pedidos) {
            if (item.getId() == id) {
                item.setStatus("CANCELADO");
                return item;
            }
        }
        return null;
    }

    // BUSCAR PEDIDO POR ID:
    @GetMapping(path = "/{id}")
    public Pedido buscaPedido(@PathVariable int id) {
        for (Pedido item : pedidos) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    // LISTAR PEDIDOS:
    @GetMapping(path = { "", "/" })
    public ArrayList<Pedido> mostrarPedidos() {
        return pedidos; // retorna a lista de objetos do tipo Pedido
    }

}