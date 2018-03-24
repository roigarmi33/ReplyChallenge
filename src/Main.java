
public class Main {

    public static void main(String[] args) throws Exception {

        //!!! DO NOT RUN ALL TOGETHER !!!
        //      IT WILL TAKE A WHILE

        InputReader example = new InputReader("./input/example.in");
        Output outEx = Algorithm.FIFO(example);
        outEx.print("./output/outEx.txt");

        InputReader input1 = new InputReader("./input/first_adventure.in");
        Output out1 = Algorithm.FIFO(input1);
        out1.print("./output/out1.txt");

        InputReader input11 = new InputReader("./input/first_adventure.in");
        Output out11 = Algorithm.FIFO(input11);
        out11.print("./output/out11.txt");
/*
        InputReader input2 = new InputReader("./input/second_adventure.in");
        Output out2 = Algorithm.FIFO(input2);
        out2.print("./output/out2.txt");

        InputReader input3 = new InputReader("./input/third_adventure.in");
        Output out3 = Algorithm.FIFO(input3);
        out3.print("./output/out3.txt");

        InputReader input4 = new InputReader("./input/fourth_adventure.in");
        Output out4 = Algorithm.FIFO(input4);
        out4.print("./output/out4.txt");
*/
    }
}