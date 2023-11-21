Worttrainer \
Model \
Paare von Wörtern und Bildern sind sind als Klasse abgebildet. Objekte dieser Klasse sind durch entsprechende
Checks zu jeder Zeit in einem gültigen Zustand. Der Rechtschreibtrainer selbst ist als 
Klasse abgebildet. Anfangs wird ein zufälliges Wort-Bild paar ausgewählt, nachdem ein Paar ausgewählt
wurde kann die Bild URL abgerufen werden und das zugehörige Wort geraten werden. Bei einer
falschen Antwort bleibt das Wort-Bild Paar ausgewählt, bei einer richtigen Antwort ist es nicht
mehr ausgewählt und es muss ein neues Paar ausgewählt werden. Es wird eine Statistik geführt
wie oft insegesamt richtig/falsch geraten wurde. Durch Checks werden ungültige Eingaben verhindert.

Persistenz \
Eine Worttrainer Session soll auch gespeichert werden können. Die genaue Umsetzung ist größtenteils 
dem User überlassen. Wähle ein beliebiges Speicherformat, benutze eine dafür geeignete Bibliothek,
wähle zur Integration der Persistierung in deine Anwendung ein sinnvolles Pattern, sodass
die Speicherstrategie austauschbar bleibt.

Grafische Oberfläche \
Ermöglicht es den Worttrainer über eine Grafische Oberfläche zu steuern.\
Ablauf: Beim Start werden die persistenten Daten geladen. Falls keine Daten persistiert 
sind, wird ein neuer Worttrainer mit eigenen fix einprogrammierten Wortpaaren erstellt.
Danach werden folgende Schritte wiederholt: Wortpaar wird zufällig ausgewählt, Statistik und aktuelles
Bild wird angezeigt. Falls es nicht der erste Versuch ist wird angezeigt ob der vorherige Versuch
richtig oder falsch war. Außerdem wird eine Eingabemöglichkeit für das Wort gegeben. Zum Schluss wird der aktuelle 
Zustand des Worttrainers ausgegeben.