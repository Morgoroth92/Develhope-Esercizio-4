public class NumberOperations {
    public static void main(String[] args){
        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b++;

        boolean condizione1 = b%2 != 0;
        boolean condizione2 = (b*(b+1)) %3 ==0;
        boolean condizione3 = condizione1  && condizione2;

        System.out.println("B is an odd number? " + condizione1 );
        System.out.println("Is B*(B+1) is a multiple of 3? "+ condizione2);
        System.out.println("Bot conditions are true? " + condizione3);

    }
}
