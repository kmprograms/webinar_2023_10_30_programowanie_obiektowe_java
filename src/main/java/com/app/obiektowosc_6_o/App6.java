package com.app.obiektowosc_6_o;

import com.app.obiektowosc_6_o.wrong.ShapeWrong;

public class App6 {
    /*
        Zasada otwarte-zamknięte (Open-Closed Principle - OCP) mówi, że klasa powinna być otwarta
        na rozszerzenie, ale zamknięta na modyfikacje. Oznacza to, że istniejące zachowanie klasy
        nie powinno być zmieniane, gdy dodajemy nowe funkcje lub zachowania. W zamiarze OCP,
        modyfikacje istniejącego kodu powinny być minimalizowane, a nowe funkcje powinny być
        wprowadzane poprzez rozszerzanie istniejących klas lub dodawanie nowych klas.
    */
    public static void main(String[] args) {
        var s1 = new ShapeWrong("Circle");
        s1.draw();
    }
}
