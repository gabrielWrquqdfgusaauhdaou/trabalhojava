public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao(int quantidade) {
        if (quantidade > 0) {
            pontuacao += quantidade;
            System.out.println("Pontuação de " + nome + " aumentada em " + quantidade + " pontos.");
        } else {
            System.out.println("A quantidade de pontos deve ser maior que zero.");
        }
    }

    public void subirNivel() {
        nivel++;
        System.out.println("Parabéns, " + nome + "! Você subiu para o nível " + nivel + ".");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}