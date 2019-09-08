package Cadastro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Registro {
    
    private String nome;
    private String nascimento;
    private String telefone;
    private String endereco;
    private String numeroCasa;
    private String cep;
    private String cidade;
    private String uf;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public int contadorID (){
        for(ID = 0; ID>1;ID++){
            ID = ID + 1;
        }
        return ID;
    }
    
     public String gravarDados() throws IOException {
      try (FileWriter dados = new FileWriter("src\\Cadastro\\Cadastro.txt", true);
           PrintWriter gravarDados = new PrintWriter(dados);
           BufferedWriter gravarDadosTXT = new BufferedWriter(gravarDados)) {
        
          gravarDadosTXT.write("ID: "+this.contadorID()+", ");
          gravarDadosTXT.write("Nome: "+this.nome+", ");
          gravarDadosTXT.write("Data de Nascimento: "+this.nascimento+", ");
          gravarDadosTXT.write("Telefone: "+this.telefone+", ");
          gravarDadosTXT.write("Endereço: "+this.endereco+", ");
          gravarDadosTXT.write("Número de Casa: "+this.numeroCasa+", ");
          gravarDadosTXT.write("CEP: "+this.cep+", ");
          gravarDadosTXT.write("Cidade: "+this.cidade+", ");
          gravarDadosTXT.write("UF: "+this.uf+";");
          gravarDadosTXT.close();
    }
    
    return "Cadastrado com Sucesso";
}
     
}
