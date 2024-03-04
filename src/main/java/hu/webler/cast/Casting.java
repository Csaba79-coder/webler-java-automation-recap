package hu.webler.cast;

public class Casting {

    public static void main(String[] args) {

        // Példa egész szám (int) átalakítása lebegőpontos számmá (double)
        int intValue = 10;
        double doubleValue = (double) intValue;
        System.out.println("int érték: " + intValue);
        System.out.println("double érték: " + doubleValue);

        // Példa lebegőpontos szám (double) átalakítása egész számmá (int)
        double pi = 3.14;
        int intValueOfPi = (int) pi;
        System.out.println("double pi érték: " + pi);
        System.out.println("int pi érték: " + intValueOfPi);

        // Példa karakter (char) átalakítása egész számmá (int)
        char letter = 'a';
        int intValueFromChar = (int) letter;
        System.out.println("Char érték: " + letter);
        System.out.println("Int értéke a char-nak: " + intValueFromChar);
    }

    /*
    FIGYELNI KELL:

    Adatvesztés: Ha egy nagyobb tartományú típust konvertálunk egy kisebb tartományú típusra, akkor adatvesztés léphet
    fel. Például, amikor egy double-t átkonvertálunk int-re, az általános rész elveszik. Ezért fontos megfontolni az
    adatok értékét és tartományát.

    Pontos konverzió: Mielőtt típuskastolást végeznénk, fontos ellenőrizni, hogy az átalakítás pontos lesz-e. Például,
    amikor egy double-t konvertálunk int-re, az általános rész levágódik. Ez gyakran elfogadhatatlan eredményhez vezethet.

    Kivételek: Néhány típuskastolás kivételt okozhat, például amikor egy nem kompatibilis típusú objektumot próbálunk
    átkonvertálni. Ezeket a kivételeket figyelembe kell venni, és megfelelően kell kezelni őket, például try-catch blokkokkal.

    Összetett típusok: Ha összetett típusokat kastolunk, például objektumokat, figyelembe kell venni a típuskompatibilitást
    és az objektumok közötti kapcsolatot.

    Teljesítmény: A típuskastolások néha hatással lehetnek a program teljesítményére. Ha gyakran végez kastolást nagy
    mennyiségű adaton, ez lassíthatja a programot.

    ÉRDEMES még tudni:

    Autoboxing a primitív adattípusok (pl. int, double) és az azokhoz tartozó objektumos megfelelőik (pl. Integer, Double)
    közötti automatikus konverziót jelenti Java-ban.

    Unboxing pedig az objektumos adattípusok (pl. Integer, Double) és az azokhoz tartozó primitív típusok (pl. int, double)
    közötti automatikus konverziót jelenti Java-ban.
    */
}
