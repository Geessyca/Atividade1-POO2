
/**
 * Escreva uma descrição da classe TV aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Som extends Dispositivo
{
    public Som(int faixa_){faixa=faixa_;}
    
    public void botaoCinco(){
        System.out.println("Proxima musica");
        faixa++;
    }
    
    public void botaoSeis(){
        System.out.println("Musica anterior");
        faixa--;
    }

}
