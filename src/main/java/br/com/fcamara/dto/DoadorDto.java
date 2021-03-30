package br.com.fcamara.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class DoadorDto implements Serializable{

    private Long id;
    
    @NotNull(message = "Este campo não pode ser vazio")
    @NotBlank(message = "Este campo não pode estar em branco")
    private String tipo;

    private String nome;

    private Long cpf;

    private String endereco;

    private String email;

    private Long idDoacoes; 

    
    // GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdDoacoes() {
        return idDoacoes;
    }

    public void setIdDoacoes(Long idDoacoes) {
        this.idDoacoes = idDoacoes;
    }
    
}
