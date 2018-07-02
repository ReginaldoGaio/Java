package universidade;

public class Professor {
    
    int numero;
    String nome;
    double valorHoraAula;
    int numDisciplina;
    
    Professor(int num, String n, double valorHora, int numDisc) {
        int numero = num;
        String nome = n;
        double valorHoraAula = valorHora;
        int numDisciplina = numDisc;
    }
    
    void setNumDisciplina(int valor) {
        
    }
    
    void setValorHoraAula(double valor) {
       
    }
    
    void imprimi() {
        System.out.println(+ numero + nome);
    }
            
 }
