
package atividadehamilton03;

public class Jogadores {
    
    String nome;
    double altura;
    
    public Jogadores(String n , double a){
        nome = n;
        altura = a;
    }
    
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setAltura(double a){
        altura = a;
    }

    public double getAltura(){
        return altura;
    }
}
