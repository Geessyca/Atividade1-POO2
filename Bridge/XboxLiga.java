
/**
 * Escreva uma descrição da classe TvQueFicaMuda aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class XboxLiga extends ControleRemoto
{
    private boolean turnOn;

    private void turnOff(){turnOn=false;}

    public XboxLiga(Dispositivo _disp){super(_disp);}
    
    public void botaoGenerico(){
        if (!turnOn){
            System.out.println("Liga Xbox!");
            turnOn=true;
        }
        else {
            System.out.println("Desliga Xbox!");
            turnOn = true;
        }
    }


}
