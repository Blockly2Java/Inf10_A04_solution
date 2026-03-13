/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Main { 
    /**
     * Das Hauptprogramm (main-Methode):
     * Alles, was ausgeführt werden soll,
     * muss in diese Methode eingefügt werden.
     * Objekte erstellen, Methoden aufrufen, ...
     *
     * Das Hauptprogramm wird automatisch
     * gestartet, wenn du auf 'Play' drückst.
     */
    public static void main() {
    }



    public static void aufgabe1()
    {
        for(double i=0; i < 200; i++) {
            System.out.println(i);
        }
    }

    public static void aufgabe2(double limit)
    {
        double i = 0;
        while(i <= limit)
        {
            System.out.println(i);
            i++;
        }
    }

    public static void aufgabe3(double start, double ende)
    {
        for(double i=start; i >= ende; i--)
        {
            System.out.println(i);
        }
    }



    public static void aufgabe4(double limit)
    {
        double i = 0;
        while(i<limit)
        {
            System.out.println(i + "*" + i + "=" + (i*i));
            i++;
        }
    }


    public static void aufgabe5(double limit)
    {
        double z1 = 1;
        double z2 = 1;
        double tmp;
        double i = 0;

        while(i++ < limit)
        {
            System.out.println(z1);
            tmp = z1+z2;
            z1 = z2;
            z2=tmp;
        }
    }

}