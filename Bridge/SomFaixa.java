
/**
 * Escreva uma descrição da classe TvQueFicaMuda aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class SomFaixa extends ControleRemoto
{


    public SomFaixa(Dispositivo _disp){super(_disp);}
    
    public void botaoGenerico(){
        System.out.println("Faixa atual: " + getDispositivo().getFaixa());
    }


}
