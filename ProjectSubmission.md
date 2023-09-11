# Enskild veckouppgift - Bankkonto

## Innehåll

- [1. Inledning](#1-inledning)
    - [1.1 Uppgift](#11-uppgift)
    - [1.2 Avgränsning](#12-avgränsning)
        - [1.2.1 Ni ska använda](#121-ni-ska-använda)
        - [1.2.2 Ni får använda](#122-ni-får-använda)
        - [1.2.3 Dvs inga](#123-dvs-inga)
        - [1.2.4 Frivilligt](#134-frivilligt)
    - [1.3 Mål](#13-mål)
    - [1.4 Syfte](#14-syfte)
    - [1.5 Vad ska ni leverera?](#15-vad-ska-ni-leverera)
- [2. Betygskrav](#2-betygskrav)
    - [2.1 Grundläggande Krav](#21-grundläggande-krav)
        - [2.1.1 Funktionalitet](#211-funktionalitet)
        - [2.1.2 Dokumentation för projektet](#212-dokumentation-för-projektet)
        - [2.1.3 Personliga reflektioner](#213-personliga-reflektioner)
- [3. Sista inlämningstid](#3-sista-inlämningstid)

## 1 Inledning

### 1.1 Uppgift

Uppgiften går ut på att fylla i de metoder som finns fördefinierade i klassen StarWarsExplorer. Ni ska
leverera en fungerande applikation som går att testa.

### 1.2 Avgränsning

#### 1.2.1 Ni ska använda:

- Java 17

#### 1.2.2 Ni får använda:

- Inget extra i denna uppgift

#### 1.2.3 Dvs inga:

- Andra paket för att bli godkända

#### 1.3.4 Frivilligt

När uppgiften är klar så kan ni gå banans och tex skapa ett lättanvänt menysystem som visar upp allt på ett snyggt sätt,
detta sätts inte betyg på men kan bli häftigt till er presentation. Ni ska fortfarande använda befintliga funktioner i
grunduppgiften samt det extra ni skapar behöver inte vara en del av er testning.

### 1.3 Mål

Ni behöver fylla i de fördefinierade metoderna i klassen StarWarsExplorer så att de levererar rätt värden.
Toleransen på avrundningen sätts till 0.1.
Ni ska använda er av if-satser och loopar för att lösa uppgiften.

### 1.4 Syfte

Syftet med denna uppgift är att ni ska få börja använda er av kunskaperna från veckans föreläsningar.

### 1.5 Vad ska ni leverera?

En applikation som uppfyller kraven:

- En klass "StarWarsExplorer" som levererar korrekt resultat.
- En personlig reflektion i filen "personliga_reflektioner.md" i mappen "documents" där ni beskriver hur ni har tänkt
  och resonerat under arbetets gång. Fyll i under respektive passande rubrik.

## 2. Betygskrav

#### Projektet skall fungera som avsett av utbildaren, vid oklarheter fråga!

_Möts inte detta kriteriet så är man underkänd per automatik!_

Ingen tid kommer att läggas på er inlämning och er inlämning kommer **inte** rättas alls om den inte är komplett och
klarat de automatiska testerna!

Det vill säga, att om er applikation inte uppfyller alla krav så kommer er inlämning inte att bli rättad och ni får
således inte heller någon feedback!

### 2.1 Grundläggande krav

- [ ] Komplett `pom.xml` fil som bygger projektet.
- [ ] Klasskamrat ska verifiera att er inlämning möter kraven innan ni lämnar in. Ni namnger vem som godkänt er
  inlämning i er `personal_reflections.md` fil.
- [ ] Förbereda en max 5 min redovisning på vad ni gjort och hur ni gjort det. Ni ska kunna svara på frågor om er
  inlämning. Powerpoint eller liknande är inte ett krav.

**Projektstruktur:**

```text
├───documentation
│       personal_reflections.md
├───src
│   ├───main
│   │   ├───java
│   │   │   └───se
│   │   │       └───dsve
│   │   │           │   Main.java
│   │   │               StarWarsExplorer.java
├── .gitignore
├── pom.xml
├── ProjectSubmission.md
└── README.md
```

#### 2.1.1 Funktionalitet

<table>
	<tr>
		<th>Område</th>
		<th>G-nivå</th>
	</tr>
    <tr>
        <td>Planering</td>
        <td>Enklare projektplan</td>
    </tr>
    <tr>
        <td>Kod stil</td>
        <td>Lättläst kod med kommentarer om nödvändigt</td>
    </tr>
    <tr>
        <td>Läsbarhet</td>
        <td>**Lättläst kod.**</td>
    </tr>
    <tr>
        <td>Struktur</td>
        <td>Tydlig namngivning av variabler och funktioner</td>
    </tr>
    <tr>
        <td>Kontroll</td>
        <td>Gör en enklare kontroll så att dina funktioner fungerar som de ska.</td>
    </tr>
</table>

#### 2.1.2 Dokumentation för projektet

<table>
	<tr>
		<th>Område</th>
		<th>G-nivå</th>
	</tr>
    <tr>
        <td>README.md</td>
        <td>
            <ul>
                <li>Hur man driftar hela projektet</li>
                <li>Hur man startar/stoppar de olika delarna</li>
                <li>Allt som behövs för att vem som helst ska kunna starta projektet på sin dator</li>
                <li>Använd korrekta begrepp och syntax i dina beskrivningar.</li>
            </ul>
        </td>
    </tr>
</table>

#### 2.1.3 Personliga reflektioner

<table>
	<tr>
		<th>Område</th>
		<th>G-nivå</th>
	</tr>
    <tr>
        <td>personal_reflections.md</td>
        <td>
            <ul>
                <li>Fyll i under alla rubriker</li>
                <li>2-3 meningar per rubrik!</li>
            </ul>
        </td>
    </tr>
</table>

Detta innebär:

1. `README.md`-fil i projektets rotmapp.
2. `personliga_reflektioner.md`-fil i mappen `documents`
3. Alla filer ska finnas kvar i roten på ert projekt, annars kommer inlämningen underkännas.

## 3. Sista inlämningstid

Lämna in uppgiften via GitHub-länk senast den `2023-09-14` kl. `23:59:59`.

* Ni kan göra färdigt er uppgift efter deadline men ni hamnar sist i prioritering med att rättas.
* Om ni inte lämnar in något alls får ni IG på er inlämning.
* Ni kan komplettera er inlämning fram till `2023-10-14` därefter kan ni inte komplettera er inlämning.

Frågor? Återkom till utbildaren via Google Meet/Teams/Discord eller maila mig på `marmed02@gafe.molndal.se`.

_OBS! Är det frågor som fler än du själv har nytt av att få svar på, använd er av Discord kanalen för frågor och svar._
