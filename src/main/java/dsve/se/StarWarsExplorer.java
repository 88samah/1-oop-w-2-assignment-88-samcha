package dsve.se;/*
/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class StarWarsExplorer {

    /**
     * Kontrollerar om en droid kan repareras baserat på dess skadenivå.
     *
     * @param damageLevel Skadenivån (1-100).
     * @return sant om den kan repareras, falskt annars.
     */
    public boolean canRepairDroid(int damageLevel) {
        // Pseudokod:
        // 1. Kontrollera om skadenivån är mindre än eller lika med 50.
        // 2. Returnera sant om så är fallet, annars falskt.

        if (damageLevel <= 50) {
            System.out.println("Droid can be repaired.");
            return true;
        } else {
            System.out.println("Droid cannot be repaired.");
            return false;
        }
    }
    /**
     * Beräknar antalet blasterskott som behövs för att besegra en Sith.
     *
     * @param sithPower Sithens kraftnivå (1-100).
     * @return Antalet blasterskott som behövs.
     */
    public int defeatSith(int sithPower) {

        // Pseudokod:
        // 1. Initiera en variabel för antalet skott som 0.
        // 2. Loopa så länge Sithens kraft är större än 0:
        //    a. Minska Sithens kraft med 20.
        //    b. Öka antalet skott.
        int shots =0;
        while(sithPower>0) {
            sithPower-=20;
            shots++;
        }
        System.out.println("Shots required to defeat Sith: " + shots);
       return shots;
    }

    /**
     * Beräknar summan av de första N primtalen.
     *
     * @param N Antalet primtal att summera.
     * @return Summan av de första N primtalen.
     */
    public int sumOfPrimes(int N) {
        // Pseudokod:
        // 1. Initiera summa- och räknevariabler till 0.
        // 2. Initiera en variabel för numret att kontrollera som 2.
        // 3. Loopa så länge räknevariabeln är mindre än N:
        //    a. Om numret är ett primtal, lägg till det i summan och öka räknevariabeln.
        //    b. Gå vidare till nästa nummer.

        int sum = 0;
        int num = 2;
        int count=0;

        while (count< N) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
            System.out.println("Sum of the first " + N + " prime numbers: " + sum); // Udskriv resultatet

        }
        return sum;
        }

        private boolean isPrime(int num) {
        if (num <= 1) {
            return false;

                    }
                    for (int i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            return false;



                        }
                    }
                    return true;
                }

    /**
     * Returnerar kraftnivån för en Jedi baserat på antal års träning.
     *
     * @param years Antalet år tränade.
     * @return Jediens kraftnivå.
     */
    public int jediPower(int years) {
        // Pseudokod:
        // 1. Om Jedi har tränat i 10 år eller mer är kraftnivån 100.
        // 2. Annars är kraftnivån 10 gånger antalet år tränade.


        int result;
        if (years >= 10) {
            result= 100;
        } else {
            result= 10 * years;
        }
        // Udskriv resultatet
        System.out.println("Jediens kraftnivå efter " + years + " år træning: " + result);
            return result;
        }
    }

