public class Main {
    /**
     *
     * @param v = vettore
     * @param cercato = numero da trovare
     * @param inizio = inizio del vettore (all'inizio 0 poi incrementa con la ricorsione)
     * @param fine = dimensione del vettore
     * @return se è stata trovata o meno
     */
    public static boolean cerca(int []v, int cercato, int inizio, int fine){
        if (inizio == fine){
            //non c'è più niente da cercare
            return false;
        }
        return (v[inizio] == cercato || cerca(v, cercato, inizio + 1, fine));
    }

    public static void main(String[] args) {
        int []v;
        v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = (int)(Math.random()*100);
            System.out.println(v[i]);
        }

        int cercato = 81;

        if(cerca(v, cercato, 0, 10)){
            System.out.println("Trovato!");
        } else
            System.out.println("Non trovato");

    }
}