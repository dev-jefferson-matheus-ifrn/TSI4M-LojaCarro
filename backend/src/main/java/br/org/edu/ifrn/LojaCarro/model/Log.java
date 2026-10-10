package br.org.edu.ifrn.LojaCarro.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "tb_log_operacoes")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dataOperacao;

    @Column(nullable = false)
    private String operacaoRealizada;

    @Column(nullable = false)
    private Long idUsuario;

    @Column(nullable = false)
    private String url;

    public Log(){}

    public Log(LocalDate dataOperacao, String operacaoRealizada, Long idUsuario, String url) {
        this.dataOperacao = dataOperacao;
        this.operacaoRealizada = operacaoRealizada;
        this.idUsuario = idUsuario;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getOperacaoRealizada() {
        return operacaoRealizada;
    }

    public void setOperacaoRealizada(String operacaoRealizada) {
        this.operacaoRealizada = operacaoRealizada;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
