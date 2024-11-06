
/**
 * Escreva uma descrição da classe TV aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Xbox extends Dispositivo
{
    public Xbox(){}
    
    public void botaoCinco(){
        System.out.println("Canal Down");
        estado--;
    }
    
    public void botaoSeis(){
        System.out.println("Canal UP"); estado++;
    }

}
