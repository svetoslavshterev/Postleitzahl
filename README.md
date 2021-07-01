# Postleitzahl(Anforderungen)
Über die Methode isValid sollen Klienten überprüfen können, ob eine int-Ziffernfolge eine gültige Postleitzahl ist.
(Nur) Die Methode select stellt Postleitzahlen gemäß einem als Ziffernfolge übergebenen Selektor zur Verfügung. 
Postleitzahlen sollen das Interface Comparable implentieren, um sie anordnen zu können, z.B. für das Sortieren nach Postleitzahlen.
Die Methoden equals und hashCode sollen sinnvoll implementiert werden.
Zwei Postleitzahlen gelten als wertgleich, wenn sie aus der gleichen int-Ziffernfolge entstanden sind.
Die Methode toInt soll eine Ziffernfolge für eine Postleitzahl zurückgeben. (Naturgemäß gehen hierbei führende Nullen verloren)
Die Methode toString soll eine Zeichenkette zurückgeben, die neben dem Typnamen eine Ziffernfolge für die Postleitzahl enthält, z.B. "Postleitzahl(12345)". (Auch hier dürfen führende Nullen ausnahmsweise aus Aufwandsgründen fehlen.)
