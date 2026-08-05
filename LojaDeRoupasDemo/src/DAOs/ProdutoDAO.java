package DAOs;

import java.util.ArrayList;
import beans.Produto;

public class ProdutoDAO {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }
 
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
    public boolean atualizar(int id, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                produtos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id) {
        Produto produto = buscar(id);

        if (produto != null) {
            produtos.remove(produto);
            return true;
        }

        return false;
    }
}
