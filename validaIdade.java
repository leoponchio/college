class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String message) {
        super(message);
    }
}

class ValidadorDeIdade {
    public void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("erro: idade menor que 0");
        }
    }
}

public class validaIdade {
    public static void main(String[] args) {
        ValidadorDeIdade validador = new ValidadorDeIdade();
        int idade = -5;

        try {
            validador.verificarIdade(idade);
            System.out.println("idade valida: " + idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
}
