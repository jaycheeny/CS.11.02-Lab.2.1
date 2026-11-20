
/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: JAY CHEN
*****************************************************************************************************
*/

public class Main {
    public static void main(String[] args) {
        int sumOfTwo = add(3,8);
        System.out.println(sumOfTwo);
        int sumOfFour = add(3,8,4,9);
        System.out.println(sumOfFour);
        String morningName = morningGreeting("Toby Fox");
        System.out.println(morningName);
        String afternoonName = afternoonGreeting("Mac Miller");
        System.out.println(afternoonName);
        String tripleWord = triple("oohbaby");
        System.out.println(tripleWord);
        double halfNumber = half(8);
        double secondHalfNumber = half(17);
        System.out.println(halfNumber);
        System.out.println(secondHalfNumber);
        int oneRoundedNumber = roundPositiveValueToNearestInteger(8.5);
        int twoRoundedNumber = roundPositiveValueToNearestInteger(8.49);
        System.out.println(oneRoundedNumber);
        System.out.println(twoRoundedNumber);
        int negRoundedNumberOne = roundNegativeValueToNearestInteger(-8.5);
        int negRoundedNumberTwo = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(negRoundedNumberOne);
        System.out.println(negRoundedNumberTwo);
    }

    // 1. add
    public static int add(int firstAdd, int secondAdd) {
        return firstAdd + secondAdd;
    }
    // 2. add
    public static int add(int firstAdd, int secondAdd, int thirdInt, int fourthInt) {
        int firstTwo = add(firstAdd, secondAdd);
        int lastTwo = add(thirdInt, fourthInt);
        return add(firstTwo, lastTwo);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String name) {
        return name + name + name;
    }
    // 6. half
    public static double half(int number) {
        return number / 2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number) {
        return (int) Math.round(number);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number) {
        double positiveNum = number * -1;
        int num = (int) Math.round(positiveNum);
        int finalNum = num * -1;
        return finalNum;
    }
}
