import br.com.alura.screenmacht.calculo.CalculadoraDeTempo;
import br.com.alura.screenmacht.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Avengers",2019);

        meuFilme.setDuracaoEmMinutos(180);
        System.out.println(meuFilme.getNome());
        System.out.println("Duração do filme: "+meuFilme.getDuracaoEmMinutos());
        System.out.println("------------------------------------");

        Filme outroFilme = new Filme("Star Wars", 1970);

        outroFilme.setDuracaoEmMinutos(200);
        System.out.println(outroFilme.getNome());
        System.out.println("Duração do filme: "+ outroFilme.getDuracaoEmMinutos());
        System.out.println("-----------------------------------");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: "+  meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: "+ meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);

        lost.setTemporada(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutoPorEpsodio(50);
        lost.exibeFichaTecnica();
        System.out.println(" Temporadas: "+lost.getEpisodioPorTemporada());
        System.out.println(" Duração do filme: "+ lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(" " +  calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("-------------------------------------------");
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("-------------------------------------------");

        System.out.println("toString "+ listaDeFilmes.get(0).toString());




    }

}


