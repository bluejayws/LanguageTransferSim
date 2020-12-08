package com.company;

public class Main {


    public static void main(String[] args) {

        /*
        Constant parameters

        Set them small for easier debugging; change to current model parameters later
         */

        //Population parameter; Each language is 50/50
        int populationParameter = 10;
        Integer languageAPopulation = populationParameter;
        Integer languageBPopulation = populationParameter;

        //Death rate parameter (for both)
        Double deathRate = 0.8678;

        //Immigration rate; ToDo: Add Sine constant?
        Double immigrationRate = 5.0;

        //Emigration Rates;
        Double langAEmigrationRate = 2.0;
        Double langBEmigrationRate = 0.5;

        //Generation amount
        int maximumGenerationLimit = 5;

        //Generation counter
        int generationCounter = 1;

        //Birth rate (for both)
        Double birthRate = 0.012;

        //Switching probabilities
        Double langAtoB = 0.45;
        Double langBtoA = 0.55; //A is slightly more advantageous language

        //Year counter
        int yearCounter = 0;

        //Simulation starts here
        System.out.println("Current generation: " + generationCounter);
        while(generationCounter <= maximumGenerationLimit){
            yearCounter++;
            System.out.println("Current year: " + yearCounter);

            //If 20 years have passed, we've gone up a generation
            if (yearCounter%20 == 0) {
                System.out.println("A generation has passed!");
                generationCounter++;

                //Simple formatting if-statement; Can ignore; If we have 5 generations, will prevent from printing
                //  "Current generation: 6"
                if (generationCounter<=maximumGenerationLimit) {
                    System.out.println("Current generation: " + generationCounter);
                }
            }

        }




    }
}
