package dsve.se;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2023 DSVE AB.
 * Licensed under the Apache License, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Main {
    public static void main(String[] args) {
        // Skapa en instans av StarWarsExplorer
        StarWarsExplorer explorer = new StarWarsExplorer();

        // Testa canRepairDroid med en skadenivå av 25
        // Förväntat resultat: true
        boolean canRepair = explorer.canRepairDroid(25);
        System.out.println("Kan droiden repareras? " + canRepair);

        // Testa defeatSith med en kraftnivå av 80
        // Förväntat resultat: 4
        int shotsNeeded = explorer.defeatSith(80);
        System.out.println("Antal blasterskott som behövs för att besegra Sith: " + shotsNeeded);

        // Testa sumOfPrimes med N=5
        // Förväntat resultat: 2 + 3 + 5 + 7 + 11 = 28
        int primeSum = explorer.sumOfPrimes(5);
        System.out.println("Summan av de första 5 primtalen: " + primeSum);

        // Testa jediPower med 9 års träning
        // Förväntat resultat: 90
        int powerLevel = explorer.jediPower(9);
        System.out.println("Kraftnivån för en Jedi med 9 års träning: " + powerLevel);
    }
}


