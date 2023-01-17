
package controleremoto;


public interface Controlador {
    
    //lista de métodos , sem abrir o bloco void sem retorno 
   
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
            
            
    
}
