package com.kaua.productapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kaua.productapi.model.Produto;
import com.kaua.productapi.service.*;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }
    
    //Criar
    @PostMapping("/produtos")
    public ResponseEntity<?> criarProduto(@Valid @RequestBody Produto produto) {
        produtoService.criarProduto(produto);
        return ResponseEntity.ok(produto);
    }
    
    //Listar Todos
    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    //Listar 1 por id
    @GetMapping("/produtos/{id}")
    public Produto exibirProduto(@PathVariable Long id) {
        return produtoService.exibirProduto(id);
    }
    
    //Deletar ID
    @DeleteMapping("/produtos/{id}")
    public void deletaProduto(@PathVariable Long id){
        produtoService.deletaProduto(id);
    }

    //Substituir produto
    @PutMapping("/produtos/{id}")
    public ResponseEntity<?> atualizarProduto(@PathVariable Long id,@Valid @RequestBody Produto produto) {
        Produto atualizado = produtoService.atualizarProduto(id,produto);
        return ResponseEntity.ok(atualizado);
    }

    //Atualizar apenas campos passados
    @PatchMapping("/produtos/{id}")
    public ResponseEntity<?> atualizarCamposProduto(@PathVariable Long id,@RequestBody Produto produto){
        Produto PAtualizado = produtoService.atualizarCamposProduto(id, produto);
        return ResponseEntity.ok(PAtualizado);
    }

}
