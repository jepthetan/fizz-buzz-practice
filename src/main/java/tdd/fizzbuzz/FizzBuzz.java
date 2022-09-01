package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff (int order) {
        StringBuilder orderPrompt = new StringBuilder();

        if (order % 3 == 0) {
            orderPrompt.append("Fizz");
        }
        if (order % 5 == 0) {
            orderPrompt.append("Buzz");
        }
        if (order % 7 == 0) {
            orderPrompt.append("Whizz");
        }
        if (orderPrompt.length()==0) {
            return String.valueOf(order);
        }
        return String.valueOf(orderPrompt);
    }
}
