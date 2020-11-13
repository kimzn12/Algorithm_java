import java.util.Stack;

public class StockPrice {
    public static void main(String[] args){
        int[] prices = {1,2,3,2,3};

        int[] answer = {};


        Stack<Integer> stack = new Stack<Integer>();

        for(int i:prices){
            stack.push(i);
        }

        System.out.println(answer);
    }

}
