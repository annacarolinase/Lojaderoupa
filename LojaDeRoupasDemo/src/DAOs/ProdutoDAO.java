package DAOs;

import java.util.ArrayList;
import beans.Produto;

public class ProdutoDAO {

    private ArrayList<Produto> produtos = new ArrayList<>();

    // CREATE
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    // READ
    public ArrayList<Produto> listar() {
        return produtos;
    }

    public Produto buscar(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    // UPDATE
    public boolean atualizar(int id, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                produtos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean remover(int id) {
        Produto produto = buscar(id);

        if (produto != null) {
            produtos.remove(produto);
            return true;
        }

        return false;
    }
}