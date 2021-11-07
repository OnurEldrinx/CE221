public class Main {
    public static void main(String[] args) {

        GenericMemoryCell<Integer> numbers = new GenericMemoryCell<>();

        numbers.write(0);

        System.out.println(numbers.storedValue);

        numbers.write(1);

        System.out.println(numbers.storedValue);

        double sum = 0;

        double N = 800000000;

        for(double i=N/2;i<=N;i++){

            sum = sum + (1/i);

        }

        System.out.println(sum);

    }
}
