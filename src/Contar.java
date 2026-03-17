public class Contar {
    public static void imprimirResultado(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o número " + x);
        }
    }
}
