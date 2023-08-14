public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluirNoPlano;
    private double somaDasavaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;
    void exibeFichaTecnica(){
        System.out.println(" Nome do Filme: " + nome);
        System.out.println(" Ano de lançamento: " + anoDeLancamento);
        
    }
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void avalia(double nota){
        somaDasavaliacao += nota;
        totalDeAvaliacoes++;

    }
    double pegaMedia(){
        return somaDasavaliacao/totalDeAvaliacoes;
    }

}
