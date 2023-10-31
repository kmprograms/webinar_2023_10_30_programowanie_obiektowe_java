package com.app.obiektowosc_7_l.right;

public class App72 {
    /*
        Zasada "L" w SOLID

        1. Podstawowa idea
           Obiekty typu klasy bazowej muszą być w stanie zostać zastąpione obiektami klasy pochodnej
           bez wpływania na poprawność programu.

        2. Niełamanie kontraktu
           Klasy pochodne powinny rozszerzać funkcjonalność klasy bazowej, nie zmieniając jej kontraktu.
           Inaczej mówiąc, nie powinny naruszać oczekiwań dotyczących zachowania klasy bazowej.

        3. Inwarianty klasy bazowej
           Jeśli klasa bazowa ma określone inwarianty, klasy pochodne muszą je zachować. Inwariant to coś,
           co jest zawsze prawdziwe (np. pewna właściwość obiektu nie może przyjmować wartości null).

        4. Niezmienność typów
           Klasy pochodne nie powinny ograniczać typów danych akceptowanych przez metody klasy bazowej.

        5. Wzmocnienie postwarunków
           Jeśli klasa pochodna przesłania pewną metodę, wynik tej metody nie powinien naruszać postwarunków
           (oczekiwane wyniki) określonych w klasie bazowej.

        6. Zastępowalność
           Jeśli klasa pochodna nie jest zastępowalna dla klasy bazowej (np. ponieważ narusza oczekiwania dotyczące
           jej zachowania), może to prowadzić do błędów w kodzie, który zakłada użycie klasy bazowej.
    */
    public static void main(String[] args) {

    }
}
