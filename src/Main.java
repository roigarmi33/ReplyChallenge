
public class Main {

    public static void main(String[] args) throws Exception {

        //read the input contiene tutti i dati
        InputReader input = new InputReader("./input/first_adventure.in");

        Output fifo = Algorithm.FIFO(input);
        
        fifo.print(".output/test.txt");
    }
}