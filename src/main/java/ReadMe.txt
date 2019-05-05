Ansatz zum Lösen dieser Aufgabe:

Da aus der Aufgabenstellung weder hervor geht, wie und wann der Preis der Flöhe bestimmt wird
und ob dieser durch die Wertung beeinflusst wird, werden folgende Annahmen festgelegt:

1. Der Preis eines Flohs wird vor der Bewertung dessen gesetzt
2. Der Preis ist (damit) unabhängig von der Wertung

Um also mit Kapital k das größte bzw. optimalste Gesamtranking zu erhalten, müssen alle Möglichkeiten erprobt werden.
Eine Matrix, wie dies für eine Liste von 4 Flöhen aussehen könnte:

    4   3   2   1
    -------------
    0 | 0 | 0 | 1
    0 | 0 | 1 | 0
    0 | 0 | 1 | 1
    0 | 1 | 0 | 0
    0 | 1 | 0 | 1
    0 | 1 | 1 | 0
    0 | 1 | 1 | 1
    1 | 0 | 0 | 0
    1 | 0 | 0 | 1
    1 | 0 | 1 | 0
    1 | 0 | 1 | 1
    1 | 1 | 0 | 0
    1 | 1 | 0 | 1
    1 | 1 | 1 | 1

Eine solche Liste ließe sich natürlich beliebig erweitern.
Während diese Matrix nun durchlaufen wird, muss für jede Möglichkeit geprüft werden,
ob diese überhaupt mit k umsetzbar ist. Nur in den Fällen, in denen dies möglich ist,
lohnt es sich, dass Ergebnis zu speichern. Schlussendlich wird das Ergebnis der Zeilen
verglichen und das beste Ergebnis ausgegeben.

Ein weiterer Ansatz wäre es, das Preis-Leistungs-Verhältnis jedes Flohs zu errechnen und
dieses auf zu summieren.

