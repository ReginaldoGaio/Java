package aula01;
public class Aula01 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.tampar();
       c1.status();
       c1.rabiscar();
       
       Caneta c2 = new Caneta();
       c2.modelo = "Compact";
       c2.cor = "Preta";
       c2.destampar();
       c2.status();
       c2.rabiscar();
    }   
}
