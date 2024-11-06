
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{

    public static void main(String[] nothing){
        ControleRemoto tv1 = new TvQueFicaMuda(new TV(1,100));
        ControleRemoto tv2 = new TvQuePausa(new TV(1,200));
    
        System.out.println("Testando a TV que fica muda:");
        tv1.botaoCinco();
        tv1.botaoSeis();
        tv1.botaoGenerico();
        
        System.out.println("Testando a TV que pausa:");
        tv2.botaoCinco();
        tv2.botaoSeis();
        tv2.botaoGenerico();

        ControleRemoto xbox = new XboxLiga(new Xbox());
        System.out.println("Testando ligar e desligar o Xbox:");
        xbox.botaoGenerico();
        xbox.botaoGenerico();

        ControleRemoto som = new SomFaixa(new Som(1));
        System.out.println("Testando mudar musica:");
        som.botaoCinco();
        som.botaoCinco();
        som.botaoSeis();
        som.botaoGenerico();

    }

}
