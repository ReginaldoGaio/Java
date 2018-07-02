package ultraemojicombat;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
                
        l[0] = new Lutador("Reginaldo", "Brasil", 35, 1.79f,
                           90.0f, 11, 2, 1);
        l[1] = new Lutador("Fábio", "Japão", 44, 1.80f,
                           80.0f, 10, 8, 2);
        l[2] = new Lutador("Matheus", "Dinamarca", 44, 1.80f,
                           80.0f, 20, 8, 4);
        l[3] = new Lutador("Douglas", "Espanha", 44, 1.80f,
                           80.0f, 15, 8, 3);
        l[4] = new Lutador("Leonardo", "Suiça", 44, 1.80f,
                           80.0f, 16, 8, 3);
        l[5] = new Lutador("Gabriel", "Estados Unidos", 44, 1.80f,
                           80.0f, 19, 8, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[1]);
        UEC01.lutar();
        l[4].status();
        l[1].status();
    }
    
}
