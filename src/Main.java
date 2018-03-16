public class Main {

    public static void main(String[] args) throws Exception {
        /*
        1 ≤ V ≤ 20    number of providers
        1 ≤ S ≤ 500 the number of services
        1 ≤ Rv ≤ 100
        1 ≤ C ≤ 20   number of countries
        1 ≤ P ≤ 100000      number of projects
         */

        //read the input contiene tutti i dati
        InputReader input = new InputReader("./input/first_adventure.in");

        System.out.printf(input.getProviders().toString());
    }
}