package entidades;

import java.util.*;

class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Gênero: " + genero + " | Preço: R$" + preco;
    }
}

public class GameHub {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Jogo> jogos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> cadastrarJogo();
                case 2 -> listarJogos();
                case 3 -> buscarJogo();
                case 4 -> removerJogo();
                case 5 -> editarJogo();
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n===== GAMEHUB =====");
        System.out.println("1 - Cadastrar jogo");
        System.out.println("2 - Listar jogos");
        System.out.println("3 - Buscar jogo");
        System.out.println("4 - Remover jogo");
        System.out.println("5 - Editar jogo");
        System.out.println("6 - Sair");
    }

    private static void cadastrarJogo() {
        String nome = lerString("Nome: ");
        String genero = lerString("Gênero: ");
        double preco = lerDouble("Preço: ");

        jogos.add(new Jogo(nome, genero, preco));
        System.out.println("Jogo cadastrado!");
    }

    private static void listarJogos() {
        if (jogos.isEmpty()) {
            System.out.println("Nenhum jogo cadastrado.");
            return;
        }

        jogos.forEach(System.out::println);
    }

    private static void buscarJogo() {
        String nome = lerString("Digite o nome do jogo: ");

        for (Jogo j : jogos) {
            if (j.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Encontrado: " + j);
                return;
            }
        }

        System.out.println("Jogo não encontrado.");
    }

    private static void removerJogo() {
        String nome = lerString("Digite o nome do jogo para remover: ");

        Iterator<Jogo> it = jogos.iterator();

        while (it.hasNext()) {
            if (it.next().getNome().equalsIgnoreCase(nome)) {
                it.remove();
                System.out.println("Jogo removido!");
                return;
            }
        }

        System.out.println("Jogo não encontrado.");
    }

    private static void editarJogo() {
        String nome = lerString("Digite o nome do jogo para editar: ");

        for (Jogo j : jogos) {
            if (j.getNome().equalsIgnoreCase(nome)) {
                j.setNome(lerString("Novo nome: "));
                j.setGenero(lerString("Novo gênero: "));
                j.setPreco(lerDouble("Novo preço: "));
                System.out.println("Jogo atualizado!");
                return;
            }
        }

        System.out.println("Jogo não encontrado.");
    }

    private static int lerInt(String msg) {
        while (true) {
            System.out.print(msg);
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            }
            System.out.println("Digite um número válido.");
            scanner.nextLine();
        }
    }

    private static double lerDouble(String msg) {
        while (true) {
            System.out.print(msg);
            if (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                scanner.nextLine();
                return valor;
            }
            System.out.println("Digite um valor válido.");
            scanner.nextLine();
        }
    }

    private static String lerString(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }
}
