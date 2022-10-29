package recursoshumanos;

import java.time.LocalDate;

@Tabela(nome = "_func")
public class Funcionario {

    @Id
    private int codigo;
    @Transiente
    private String matricula;
    @Coluna(nome = "cadastropessoafisica")
    private String cpf;
    private String nome;
    private String descricaoAtribuicoes;
    private LocalDate dataNascimento;

    public Funcionario(String matricula, String cpf, String nome, String descricaoAtribuicoes, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.descricaoAtribuicoes = descricaoAtribuicoes;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return codigo;
    }

    public void setId(int id) {
        this.codigo = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoAtribuicoes() {
        return descricaoAtribuicoes;
    }

    public void setDescricaoAtribuicoes(String descricaoAtribuicoes) {
        this.descricaoAtribuicoes = descricaoAtribuicoes;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
