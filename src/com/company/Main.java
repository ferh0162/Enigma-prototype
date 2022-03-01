package com.company;

public class Main {
    public int charTilInt(char bogstav){
        //Der skal laves en metode, som modtager en char og laver den om til tal i alfabetet

        //Vi kan starte med at lave et aray af alfabetet, så vi har positionen i alfabetet
        char[] alfabetet = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y','Z','Æ','Ø','Å'};

        //Så skal der laves et loop, som tager vores bogstav,
        // og lopper gennemd et indtil den matcher med alfabetet
        // Hvis den finder et match så skal den skrive matchets index tal ud
        for (int i = 0;alfabetet.length >= i; i++ ) {
            if (alfabetet[i] == bogstav) {
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }
    public char inttilChar(int index) {
        //Vi skal lave en metode til at finde det næste
        // Vi skal kunne modtage små bogstaver og laver dem alle til store bogstaver
        // Vi skal finde en måde at lave char til .toUpperCase

        char[] alfabetet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

        char indexNummer = alfabetet[index];
        return indexNummer;
    }
    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.charTilInt('F');
        obj.inttilChar(3);
    }
}
