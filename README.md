<!DOCTYPE html>
<html>
<head>
<title>
PC NUMBERS
</title>
</head>


<body>
<h1> Semestralni_Prace </h1>
<h2>I) Zadání:</h2>
<hr>
<p>Vytvořte program, který od uživatel načtce seznam studentů a to bud formou csv souboru nebo ručním zadáváním. Student je určen jménem a příjmení,datem narození, pohlavím a identifikačním číslem. Dále nahraje soubor s výsledky, který objahuje Identifikační číslo a počet získaných bodů. Umožněte uživateli zvolit zda použije výsledky z posledního testu(předem dané) nebo nahraje jiné(vlastní). Na základě výsledků program vyhodnotí absolventy a určí zda prošli nebo ne jakou měli úspěšnost(maximum je 50b) a známku určenou následující stupnicí 1 <88%, 2 <75%,3 <58% , 4 <45%. Absolventy je možné řadit podle úspěšnosti a následně takto upravený seznam uložit ve foprmátu .txt, .dat, .pdf
Komunikaci s uživatelem realizujte pomocí řádkového menu. Program eliminujte všechna možná nežádoucí ukončení způsobená chybami.</p>

<h2>II) Návrh řešení</h2>
<hr>
<p><b>Funkční Specifikace:</b>
  <ol>
  <li>Načíst Studenty</li>
  <li> Načíst výsledky</li>
  <li>Vyhodnotit studenty
    <ul>
       <li>najít studenta ve výsledcích podle čísla</li>
       <li>vytvořit absolventa odvozeného od studenta a přidat mu vlasti</li>
    </ul> 
  </li>
      <li>Vizualizace
    <ul>
       <li>sezanm studentů</li>
       <li>seznam absolventů</li>
    </ul> 
  </li>
  </li>
      <li> Řazení podle úspěšnosti
    <ul>
       <li>od nejlepšího</li>
       <li>od nejhoršího</li>
    </ul> 
  </li>
        <li> Zápis do souboru
    <ul>
       <li>uložit do txt</li>
       <li>uložit do dat</li>
      <li>uložit do pdf</li>
    </ul> 
  </li>
</ol> 

  <h2>III)Class Diagram</h2>
  <hr>
  <img src="/calssDiagram.jpg">
  
<h2>IV) Testování:</h2>
<hr>

<p>Program byl vytvořen a testovám ve vývojovém prostředí Nebeans 8.2 a s verzí java 1.8.</p>
<p>Program obsahuje podadresář data kde je možné najít požité testovací testovací soubory</p>
<br>
<p><h3>Hlavní menu</h3><br>
System vyhodnocovani maturitnich praci <br>
1. Manualni zadavani <br>
2. Nacist cele soubory  <br>
3. Zobrazit zapsané studenty <br>
4. Vyhodnotit výdledky zadaných studentů <br>
5. Srovnat absolventy podle skore <br>
6. Ulozit vysledky do souboru <br>
7. Zobrazit absolventy <br>
0. Konec programu <br>
Zadej volbu: 9 <br>
Pod touto volbou neni zadna akce <br>
 <br>
System vyhodnocovani maturitnich praci  <br>
1. Manualni zadavani <br>
2. Nacist cele soubory  <br>
3. Zobrazit zapsané studenty <br>
4. Vyhodnotit výdledky zadaných studentů <br>
5. Srovnat absolventy podle skore <br>
6. Ulozit vysledky do souboru <br>
7. Zobrazit absolventy <br>
0. Konec programu <br>
Zadej volbu: trol <br>
Nesprávná volba!  <br>
  </p>
  <p>
System vyhodnocovani maturitnich praci <br>
1. Manualni zadavani<br>
2. Nacist cele soubory <br>
3. Zobrazit zapsané studenty<br>
4. Vyhodnotit výdledky zadaných studentů<br>
5. Srovnat absolventy podle skore<br>
6. Ulozit vysledky do souboru<br>
7. Zobrazit absolventy<br>
0. Konec programu<br>
Zadej volbu: 1<br>
1. Přidat studenta<br>
2. Přidat výsledek<br>
0. Zpět<br>
<br>
</p>
<h3>Přidávání studenta</h3>
<p><b>Správně zadané možnosti<br></b>
Zadej volbu: 1 <br>
Jmeno a prijmeni<br>
Filip Novak<br>
Pohlavi M(muz) / W(zena)<br>
M<br>
Datum narozeni ve formatu dd.MM.yyyy<br>
15.09.2001<br>
Studentske cislo: <br>
1111111<br>
Student byl uspesne pridan<br>
<br></p>
<p><b>Špatně zadané možnosti<br>  </b>
1. Přidat studenta<br>
2. Přidat výsledek<br>
0. Zpět<br>
Zadej volbu: 1<br>
Jmeno a prijmeni<br>
nejaka hloupost<br>
Pohlavi M(muz) / W(zena)<br>
muz<br>
Datum narozeni ve formatu dd.MM.yyyy<br>
10.25.0<br>
Spatne zadane datum narozeni. Zkus to znovu<br>
1. Přidat studenta <br>
2. Přidat výsledek <br>
0. Zpět <br>
Zadej volbu: 1 <br>
Jmeno a prijmeniv <br>
Filip Novak  <br>
Pohlavi M(muz) / W(zena) <br>
M <br>
Datum narozeni ve formatu dd/MM/yyyy <br>
15.11.2020 <br>
Studentske cislo:  <br>
rozhodneNeCislo <br>
Spatne zadane studentovo cislo. Zkus to znovu <br>
</p><p>
 <h3>Přidávání výsledku</h3>
</p>
<b>Špatně zadaný výsledky</b><br>
1. Přidat studenta<br>
2. Přidat výsledek<br>
0. Zpět<br>
Zadej volbu: 2<br>
Zadej sedmimistne studentske cislo:<br>
necislo<br>
Spatne zadane studentovo cislo nebo body ziskane v testu. Zkus to znovu<br>
1. Přidat studenta<br>
2. Přidat výsledek<br>
0. Zpět<br>
Zadej volbu: 2<br>
Zadej sedmimistne studentske cislo:<br>
1234<br>
Studentske cislo nesplnuje pozadeavek sedmimistneho cisla<br>
necislo<br>
Spatne zadane studentovo cislo nebo body ziskane v testu. Zkus to znovu<br>
1. Přidat studenta<br>
2. Přidat výsledek<br>
0. Zpět<br>
Zadej volbu: 2<br>
Zadej sedmimistne studentske cislo:<br>
1234567<br>
Zadej pocet bodu ziskanych v testu:<br>
-9<br>
Test nebyl pridan pocet bodu neni z mozneho rozsahu(0-50).<br>
1. Přidat studenta<br>
2. Přidat výsledek<br>
0. Zpět<br>
Zadej volbu: 2<br>
Zadej sedmimistne studentske cislo:<br>
1234567<br>
Zadej pocet bodu ziskanych v testu:<br>
a<br>
Spatne zadane studentovo cislo nebo body ziskane v testu. Zkus to znovu<br>
<b>Správně zadaný výsledky</b></b>
1. Přidat studenta<br>
2. Přidat výsledek<br>
0. Zpět<br>
Zadej volbu: 2<br>
Zadej sedmimistne studentske cislo:<br>
1234567<br>
Zadej pocet bodu ziskanych v testu:<br>
25<br>
Vysledek byl uspesne pridan pridan.<br>
</p>
<h3>Načítání souborů</h3>
<p>
<b>Špané zadávání</b><br>
System vyhodnocovani maturitnich praci <br>
1. Manualni zadavani<br>
2. Nacist cele soubory <br>
3. Zobrazit zapsané studenty<br>
4. Vyhodnotit výdledky zadaných studentů<br>
5. Srovnat absolventy podle skore<br>
6. Ulozit vysledky do souboru<br>
7. Zobrazit absolventy<br>
0. Konec programu<br>
Zadej volbu: 2<br>
1. Nahrát soubor se studenty<br>
2. Nahrát výsledky z tohoto roku<br>
3. Nahrát výsledky konkrétního roku<br>
4. Ukazat pocet nahranych informaci<br>
0. Zpět<br>
Zadej volbu: 1<br>
Zadej cestu k souboru<br>
spatna/cesta.haha<br>
soubor nebyl nalezen nebo nelze precist<br>
<br>
<b>Správné zadávání</b><br>
1. Nahrát soubor se studenty<br>
2. Nahrát výsledky z tohoto roku<br>
3. Nahrát výsledky konkrétního roku<br>
4. Ukazat pocet nahranych informaci<br>
0. Zpět<br>
Zadej volbu: 3<br>
Zadej cestu k souboru s vysledky<br>
data//test//test.csv<br>
Výsledky načteny<br>
1. Nahrát soubor se studenty<br>
2. Nahrát výsledky z tohoto roku<br>
3. Nahrát výsledky konkrétního roku<br>
4. Ukazat pocet nahranych informaci<br>
0. Zpět<br>
Zadej volbu: 4<br>
počet studentů:3 počet výsledků 8<br>
</p>
<h3>Zobrazení a vyhodnocení</h3>
<p>
<b>Vyhodnocení prazných seznamů</b><br>
System vyhodnocovani maturitnich praci <br>
1. Manualni zadavani <br>
2. Nacist cele soubory  <br>
3. Zobrazit zapsané studenty <br>
4. Vyhodnotit výdledky zadaných studentů <br>
5. Srovnat absolventy podle skore <br>
6. Ulozit vysledky do souboru <br>
7. Zobrazit absolventy <br>
0. Konec programu <br>
Zadej volbu: 3 <br>
Nasledujici studenti jsou prihlaseni k maturitni zkousce: <br>
 <br>
 <br>
System vyhodnocovani maturitnich praci  <br>
1. Manualni zadavani <br>
2. Nacist cele soubory  <br>
3. Zobrazit zapsané studenty <br>
4. Vyhodnotit výdledky zadaných studentů <br>
5. Srovnat absolventy podle skore <br>
6. Ulozit vysledky do souboru <br>
7. Zobrazit absolventy <br>
0. Konec programu <br>
Zadej volbu: 4 <br>
vyhodnoceny výsledky <br>
 <br>
 <br>
System vyhodnocovani maturitnich praci  <br>
1. Manualni zadavani <br>
2. Nacist cele soubory  <br>
3. Zobrazit zapsané studenty <br>
4. Vyhodnotit výdledky zadaných studentů <br>
5. Srovnat absolventy podle skore <br>
6. Ulozit vysledky do souboru <br>
7. Zobrazit absolventy <br>
0. Konec programu <br>
Zadej volbu: 7 <br>
Seznam vsech absolventu:  <br>
 <br>
<b>Zadané informace</b><br>
System vyhodnocovani maturitnich praci <br>
1. Manualni zadavani<br>
2. Nacist cele soubory <br>
3. Zobrazit zapsané studenty<br>
4. Vyhodnotit výdledky zadaných studentů<br>
5. Srovnat absolventy podle skore<br>
6. Ulozit vysledky do souboru<br>
7. Zobrazit absolventy<br>
0. Konec programu<br>
Zadej volbu: 3<br>
Nasledujici studenti jsou prihlaseni k maturitni zkousce:<br>
Student number:1234567  Name:Filip Charouzd(M) born in 2000-09-16<br>
Student number:7654321  Name:Karel Bor(M) born in 2000-09-25<br>
Student number:1122334  Name:Lida Novakova(W) born in 2001-04-15<br>
<br>
<br>
System vyhodnocovani maturitnich praci<br> 
1. Manualni zadavani<br>
2. Nacist cele soubory <br>
3. Zobrazit zapsané studenty<br>
4. Vyhodnotit výdledky zadaných studentů<br>
5. Srovnat absolventy podle skore<br>
6. Ulozit vysledky do souboru<br>
7. Zobrazit absolventy<br>
0. Konec programu<br>
Zadej volbu: 4<br>
vyhodnoceny výsledky<br>
Student's number:1234567  Name:Filip Charouzd(M) born in 2000-09-16 seccesfuly gradueted for 1.0(96.0%)<br>
Student's number:7654321  Name:Karel Bor(M) born in 2000-09-25 seccesfuly gradueted for 4.0(50.0%)<br>
Student's number:1122334  Name:Lida Novakova(W) born in 2001-04-15 seccesfuly gradueted for 3.0(72.0%)<br>
</p>
<h3>Řazení podle úspěšnosti</h3>
<p>
1. Zobrazit absolventy<br>
2. Srovnat Absolventy podle bodu od nejlepších<br>
3. Srovnat Absolventy podle bodu od nejhorších<br>
0. Zpět<br>
Zadej volbu: 2<br>
1. Zobrazit absolventy<br>
2. Srovnat Absolventy podle bodu od nejlepších<br>
3. Srovnat Absolventy podle bodu od nejhorších<br>
0. Zpět<br>
Zadej volbu: 1<br>
Student's number:1234567  Name:Filip Charouzd(M) born in 2000-09-16 seccesfuly gradueted for 1.0(96.0%)<br>
Student's number:1122334  Name:Lida Novakova(W) born in 2001-04-15 seccesfuly gradueted for 3.0(72.0%)<br>
Student's number:7654321  Name:Karel Bor(M) born in 2000-09-25 seccesfuly gradueted for 4.0(50.0%)<br>
<br>
1. Zobrazit absolventy<br>
2. Srovnat Absolventy podle bodu od nejlepších<br>
3. Srovnat Absolventy podle bodu od nejhorších<br>
0. Zpět<br>
Zadej volbu: 3<br>
1. Zobrazit absolventy<br>
2. Srovnat Absolventy podle bodu od nejlepších<br>
3. Srovnat Absolventy podle bodu od nejhorších<br>
0. Zpět<br>
Zadej volbu: 1<br>
Student's number:7654321  Name:Karel Bor(M) born in 2000-09-25 seccesfuly gradueted for 4.0(50.0%)<br>
Student's number:1122334  Name:Lida Novakova(W) born in 2001-04-15 seccesfuly gradueted for 3.0(72.0%)<br>
Student's number:1234567  Name:Filip Charouzd(M) born in 2000-09-16 seccesfuly gradueted for 1.0(96.0%)<br>
</p>
<h3>Ukládání</h3>
<p>
<b>Spatné zadávání</b><br>
System vyhodnocovani maturitnich praci <br>
1. Manualni zadavani<br>
2. Nacist cele soubory <br>
3. Zobrazit zapsané studenty<br>
4. Vyhodnotit výdledky zadaných studentů<br>
5. Srovnat absolventy podle skore<br>
6. Ulozit vysledky do souboru<br>
7. Zobrazit absolventy<br>
0. Konec programu<br>
Zadej volbu: 6<br>
1. Ulozit jako .txt<br> 
2. Ulozit jako .dat<br>
3. Ulozit jako .pdf<br>
0. Zpět<br>
Zadej volbu: 1<br>
Zadej jmeno souboru: <br>
//nesmysl//na//entou.wtf<br>
File created: entou.wtf.txt<br>
Soubor se nepodarilo vytvořit.<br>
<br>
<b>Správné zadávání</b><br>
<br>
1. Ulozit jako .txt <br>
2. Ulozit jako .dat<br>
3. Ulozit jako .pdf<br>
0. Zpět<br>
Zadej volbu: 1<br>
Zadej jmeno souboru: <br>
vysledky<br>
File created: vysledky.txt<br>
Soubor byl vytvořen v podadresari programu(data//results//).<br>
<br>
1. Ulozit jako .txt <br>
2. Ulozit jako .dat<br>
3. Ulozit jako .pdf<br>
0. Zpět<br>
Zadej volbu: 2<br>
Zadej jmeno souboru: <br>
vysledky1<br>
Soubor byl vytvořen v podadresari programu(data//results//).<br>
<br>
1. Ulozit jako .txt <br>
2. Ulozit jako .dat<br>
3. Ulozit jako .pdf<br>
0. Zpět<br>
Zadej volbu: 3<br>
Zadej jmeno souboru: <br>
vysledky2<br>
Soubor byl vytvoren v podadresari programu(data//results//).<br>
<br>
</p>
</body>
</html>
