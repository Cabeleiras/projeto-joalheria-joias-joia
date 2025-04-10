package br.com.joalheriaaurevielle.app.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduto", nullable = false)
    private Long idProduto;
    
    @Column(name = "nomeProduto", nullable = false, length = 100)
    private String nomeProduto;
    
    @Column(name = "descricaoProduto", length = 255)
    private String descricaoProduto;
    
    @Column(name = "preco", nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;
    
    @Column(name = "estoque", nullable = false)
    private Integer estoque;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private CategoriaProduto categoriaProduto;

    @ManyToOne
    @JoinColumn(name = "tipo_produto_id", nullable = false)
    private TipoProduto tipoProduto;

    @ManyToOne
    @JoinColumn(name = "ornamento_id")
    private Ornamentos ornamento;

    // Construtores
    public Produto() {
    }

    public Produto(Long idProduto, String nomeProduto, String descricaoProduto, BigDecimal preco, Integer estoque,
                   CategoriaProduto categoriaProduto, TipoProduto tipoProduto, Ornamentos ornamento) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.preco = preco;
        this.estoque = estoque;
        this.categoriaProduto = categoriaProduto;
        this.tipoProduto = tipoProduto;
        this.ornamento = ornamento;
    }

    // Getters e Setters
    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public Ornamentos getOrnamento() {
        return ornamento;
    }

    public void setOrnamento(Ornamentos ornamento) {
        this.ornamento = ornamento;
    }
}