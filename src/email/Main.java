package email;

// Classe main para testes
public class Main {
    public static void main(String[] args) {
        // Criando instâncias do email
        Email email = new Email("Gabriel Alesiunas", "Aluno");

        // Assunto do e-mail
        email.enviarEmail("Atividade de Polimorfismo.");
    }
}
