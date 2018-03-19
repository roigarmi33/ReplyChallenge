
public class Main {

    public static void main(String[] args) throws Exception {

        //!!! DO NOT RUN ALL TOGETHER !!!
        //      IT WILL TAKE A WHILE

        InputReader example = new InputReader("./input/example.in");

        InputReader input1 = new InputReader("./input/first_adventure.in");
        InputReader input2 = new InputReader("./input/second_adventure.in");
        InputReader input3 = new InputReader("./input/third_adventure.in");
        InputReader input4 = new InputReader("./input/fourth_adventure.in");



        Output outEx = Algorithm.FIFO(example);

        Output out1 = Algorithm.FIFO(input1);
        Output out2 = Algorithm.FIFO(input2);
        Output out3 = Algorithm.FIFO(input3);
        Output out4 = Algorithm.FIFO(input4);

        outEx.print("./output/outEx.txt");

        out1.print("./output/out1.txt");
        out2.print("./output/out2.txt");
        out3.print("./output/out3.txt");
        out4.print("./output/out4.txt");

    }
}