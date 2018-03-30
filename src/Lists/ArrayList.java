package Lists;

/**
 * Created by bajlu1731402 on 2018-03-19.
 */
public class ArrayList<T> implements List<T> {

    private T[] tableau;
    private int taille = 0;
    private int objets = 0;

    public ArrayList(T element) {
        if (taille > objets ) {
            this.taille = taille;
            tableau = (T[]) new Object[taille];
        }
    }

    public void add(T element) {
        if (objets >= taille) {
            if (taille <= 0) {
                taille = 1;
            }
            else taille += 10;
            T[] newTab = (T[]) new Object[taille];
            for (int i=0 ; i<objets ; i++) {
                newTab[i] = tableau[i];
            }
            tableau = newTab;
        }

        tableau[objets] = element;
        objets++;
    }

    public void add(int index, T element) {
        if (taille <=0) {
            taille = 1;
        }
        if (index < taille & index >= 0) {
            if (objets >= taille - 2) {
                taille *= 2;
                T[] newTab = (T[]) new Object[taille];
                for (int i = 0; i < objets; i++)
                    newTab[i] = tableau[i];
                tableau = newTab;
            }

            for (int i = objets; i > index; i--)
                tableau[i] = tableau[i - 1];

            tableau[index] = element;
            objets++;
            taille++;
        }
    }

    public void set(int index, T element) {
        if (index >= 0 && index < taille)
            tableau[index] = element;
    }


    public T get(int index) {
        if (index >= 0 && index < objets) return tableau[index];
        else return null;
    }


    public void remove(int index) {
        if (index >= 0 && index < taille) {
            for (int i = index; i < (objets - 1); i++) {
                tableau[i] = tableau[i + 1];
            }
            objets--;
        }
    }


    public void clear() {
        taille = 0;
        objets = 0;
    }


    public int size() {
        if (tableau != null) return objets;
        else return 0;
    }
}
