package atividadehamilton03;

import javax.swing.JOptionPane;

public class Teste {
    public static void main (String [] args){
        String nome = JOptionPane.showInputDialog("Digite o nome do jogador: ");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do jogador: "));
        
        
        String nome2 = JOptionPane.showInputDialog("Digite o nome do jogador: ");
        double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do jogador: "));
        
        String timeA = JOptionPane.showInputDialog("Digite o time A: ");
        String timeB = JOptionPane.showInputDialog("Digite o time B: ");
        
        int pontuacaoA = Integer.parseInt(JOptionPane.showInputDialog("Digite a pontuação do time A:"));
        int pontuacaoB = Integer.parseInt(JOptionPane.showInputDialog("Digite a pontuação do time B:"));
        
        
        
        Jogadores jogador1 = new Jogadores(nome , altura);
        Jogadores jogador2 = new Jogadores(nome2 , altura2);
        Time time1 = new Time();
        Time time2 = new Time();
        Partida partida = new Partida();
        
        time1.setTime(timeA);
        time2.setTime(timeB);
        
        partida.setPontuacao(pontuacaoA);
        partida.setPontuacao(pontuacaoB);
        
        
        System.out.println("Nome: " + jogador1.getNome() + "\nAltura: " + jogador1.getAltura());
        System.out.println("Nome: " + jogador2.getNome() + "\nAltura: " + jogador2.getAltura());
        System.out.println("O time A é: " + timeA);
        System.out.println("O time B é: " + timeB);
        System.out.println("A pontuação do time A é: " + pontuacaoA);
        System.out.println("A pontuação do time B é: " + pontuacaoB);
        
        partida.Vencedor();
    }
}
