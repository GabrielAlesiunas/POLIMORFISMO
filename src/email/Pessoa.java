package email;

// Criando a classe pessoa
public class Pessoa {
	// Atributo para a classe pessoa
    private String nome;

    // Construtor da classe pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Método enviarEmail que será sobrescrito nas subclasses
    public void enviarEmail(String mensagem) {
    
    }
}