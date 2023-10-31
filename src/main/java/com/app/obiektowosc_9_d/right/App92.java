package com.app.obiektowosc_9_d.right;

import com.app.obiektowosc_9_d.right.impl.UserRepositoryHibernate;

public class App92 {

    /*
        Zasada "D" w SOLID odnosi się do Zasady Odwracania Zależności (Dependency Inversion
        Principle, DIP). Jest to jedna z kluczowych zasad, która wspiera tworzenie systemów
        modularnych i łatwo testowalnych. Oto główne założenia tej zasady:

        Wysokie poziomy modułów nie powinny zależeć od niskich poziomów modułów. Oba powinny
        zależeć od abstrakcji.

        "Wysoki poziom" odnosi się do modułów, które zawierają główną logikę biznesową, podczas
        gdy "niski poziom" odnosi się do modułów wykonawczych, takich jak dostęp do danych czy
        operacje wejścia/wyjścia.
        Abstrakcje nie powinny zależeć od szczegółów. Szczegóły powinny zależeć od abstrakcji.

        Innymi słowy, powinniśmy projektować nasze systemy w sposób, w którym główne komponenty
        biznesowe nie zależą bezpośrednio od konkretnej implementacji, ale raczej od abstrakcyjnych
        interfejsów czy klas bazowych.
    */
    public static void main(String[] args) {
        var userRepo = new UserRepositoryHibernate();
        var userManager = new UserManager(userRepo);
        userManager.save(new User("u"));
    }
}
