package email;

// Classe email herdando da classe pessoa
public class Email extends Pessoa {
	// Atributo para email
    private String titulo;

    // Construtor
    public Email(String nome, String titulo) {
        super(nome);
        this.titulo = titulo;
    }

    // Sobrescrita do método enviarEmail para a classe email
    @Override
    public void enviarEmail(String mensagem) {
    	String saudacao = "Olá " + (titulo != null && !titulo.isEmpty() ? titulo : "") + " " + getNome() + "!";
        System.out.println(saudacao + "\n\n" + mensagem);
    }
}
