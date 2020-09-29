
package atividadehamilton03;

import javax.swing.JOptionPane;

public class Partida {
    
    String vencedor;
    int pontuacaoA, pontuacaoB;
    
    
     
     public void setPontuacao(int pA){
        pontuacaoA= pA;
    }
    
    public int getPontuacaoA(){
        return pontuacaoA;
    }
    
    
    
     public void setPontuacaoB(int pB){
        pontuacaoB = pB;
    }
    
    public int getPontuacaoB(){
        return pontuacaoB;
    }
    
    void Vencedor(){
        if (pontuacaoA > pontuacaoB){
            System.out.println("Time A é o vencedor");
        }
        else{
            System.out.println("Time B é o vencedor");
        }
    }
    
    
    
    
    void gol (){
        
    }
    
    
    
    
}
