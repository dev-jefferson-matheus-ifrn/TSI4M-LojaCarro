package br.org.edu.ifrn.LojaCarro.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

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

    public Log(LocalDate dataOperacao, String operacaoRealizada, Long idUsuario) {
        this.dataOperacao = dataOperacao;
        this.operacaoRealizada = operacaoRealizada;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
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
