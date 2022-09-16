package br.com.alura.mvc.mudi.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="Pedido")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataDaEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;
    private final LocalDate dataCadastrado;

    public Produto() {
        this.dataCadastrado = LocalDate.now();
    }

    public Produto(String nomeProduto, BigDecimal valorNegociado, LocalDate dataDaEntrega,
                   String urlProduto, String urlImagem, String descricao) {
        this.nomeProduto = nomeProduto;
        this.valorNegociado = valorNegociado;
        this.dataDaEntrega = dataDaEntrega;
        this.urlProduto = urlProduto;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
        this.dataCadastrado = LocalDate.now();
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public LocalDate getDataDaEntrega() {
        return dataDaEntrega;
    }

    public void setDataDaEntrega(LocalDate dataDaEntrega) {
        this.dataDaEntrega = dataDaEntrega;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCadastrado() {
        return this.dataCadastrado;
    }
}
