/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao;

/**
 *
 * @author 
 */
public class Usuarios {
    
    // atributos
    private String nome;
    private String telefone;
    private String endereco;
    private String login;
    private String senha;
    private String email;
    private String funcao;
    private Double salario;
    private String dataAdmissao;
    private String dataDemissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
     public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
    // cadastro de funcionários
    
    public void Cadastrar(){
        
        String sql = "Insert into funcionario values(?,?,?,?,?,?,?,?,?,?)";
        
    }
    
    public void Pesquisar(){
        
    }
    public void Carregar(){
        
    }
    public void Deletar(){
        
    }
    public void Alterar(){
        
    }

   
}
