package com.kaua.productapi.service;


import java.util.List;


import org.springframework.stereotype.Service;
import com.kaua.productapi.model.*;
import com.kaua.productapi.repository.*;



@Service
public class ProdutoService{
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto criarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos (){
        return produtoRepository.findAll();
    }

    public Produto exibirProduto(Long id){
        return produtoRepository.findById(id).orElseThrow(()-> new RuntimeException("produto não encontrado")) ;
    
    }

    public void deletaProduto(Long id){
        Produto produto = exibirProduto(id);
        produtoRepository.delete(produto);
    }


    public Produto atualizarProduto(Long id,Produto produtoNovo){
        Produto antigo=exibirProduto(id);
        produtoNovo.setId(id);
        produtoNovo.setDataCriacao(antigo.getDataCriacao());
        return produtoRepository.save(produtoNovo);
    }

    public Produto atualizarCamposProduto (Long id, Produto produtoAtualizado){
        Produto produto = exibirProduto(id);

        if(produtoAtualizado.getNome() != null){
        produto.setNome(produtoAtualizado.getNome());
        }

        if(produtoAtualizado.getPreco() != null){
            produto.setPreco(produtoAtualizado.getPreco());
        }
        
        if(produtoAtualizado.getQuantidade() != null){
            produto.setQuantidade(produtoAtualizado.getQuantidade());
        }
    
        if(produtoAtualizado.getCodigo() != null){
            produto.setCodigo(produtoAtualizado.getCodigo());
        }
    
        if(produtoAtualizado.getDescricao() != null){
            produto.setDescricao(produtoAtualizado.getDescricao());
        }
        return produtoRepository.save(produto);
         
    }


}