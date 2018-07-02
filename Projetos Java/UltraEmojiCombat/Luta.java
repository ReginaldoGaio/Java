package ultraemojicombat;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador dasafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
           && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.dasafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.dasafiante = null;
        }      
    }
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.dasafiante.apresentar();
                    
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("### RESULTADO DA LUTA ###");
            switch(vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.dasafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.dasafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.dasafiante.getNome());
                    this.dasafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("---------------------------------------");
            
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    //Métodos Especiais 
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDasafiante() {
        return dasafiante;
    }

    public void setDasafiante(Lutador dasafiante) {
        this.dasafiante = dasafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
