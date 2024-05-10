import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Sou um agente lógico de inteligência artificial.");
        System.out.println("Como posso ajudar você hoje?");

        while (true) {
            String entrada = scanner.nextLine().toLowerCase();

            // Verificar se a entrada está vazia
            if (entrada.isEmpty()) {
                System.out.println("Por favor, insira algo.");
                continue; // Reinicia o loop para obter uma nova entrada
            }

            String resposta = processarEntrada(entrada);
            System.out.println(resposta);
        }

    }

    public static String processarEntrada(String entrada) {
        if (entrada.contains("olá") || entrada.contains("oi")) {
            return "Olá! Como posso ajudar?";
        } else if (entrada.contains("tempo") || entrada.contains("clima")) {
            return "A previsão do tempo para hoje é ensolarado.";
        } else if (entrada.contains("notícias")) {
            return "As últimas notícias são sobre avanços na inteligência artificial.";
        } else if (entrada.contains("adeus") || entrada.contains("tchau")) {
            return "Até logo! Tenha um ótimo dia!";
        } else {
            return "Desculpe, não entendi. Pode repetir, por favor?";
        }
    }
}
