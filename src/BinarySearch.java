public class BinarySearch {

    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new int[n];

        fillValues(numbers);
        display(numbers);

        int value = 2;
        int beg = 0 , end = numbers.length -1 , mid, pos = -1;

        for (int i=0 ; beg <= end ; i++){

            mid = (beg + end) / 2;

            if (numbers[mid] == value){
                pos = i;
                break;
            }
            else if (numbers[mid] > value){

                end= mid - 1;
            }
            else {
                beg = mid + 1;
            }
        }

        if (pos == -1){
            System.out.println(value + " \n Not Found");
        }
        else {
            System.out.println("\n" + value + " Found At index " + pos);
        }

    }

    private static void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(" index " + i + ", Value " + numbers[i]);

        }
    }

    private static void fillValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i+1;
        }
    }
}
