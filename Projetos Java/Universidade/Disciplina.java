package universidade;

public class Disciplina {
    private int numero;
    private String nome;
    private int cargaHoraria;
    
    Disciplina(int num, String nom, int cargaH) {
        numero = num;
        nome = nom;
        cargaHoraria = cargaH;
    }
    
    void setCargaHoraria(int valor) {
        if(valor > 200 && valor < 0) {
            System.out.println("Erro! Valor negativo e/ou maior que 200 horas.");
        }
        else {
            cargaHoraria = valor;
        }
        
    }
    
    void imprimi() {
        
    }
}
