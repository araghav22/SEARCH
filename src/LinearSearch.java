public class LinearSearch {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new int[n];

        fillValue(numbers);
        display(numbers);

        int value=4;
        int position = -1;
        int i;

        for (i = 0; i < numbers.length; i++) {

            if (numbers[i] == value)
            {
                position = i;
                break;
            }
        }

        if(position == -1)
        {
            System.out.println("Value not found");
        }
        else
        {
            System.out.println("value find in index : " + position);
        }
    }

    private static void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index : " + i +" Value : " + numbers[i]);
        }
    }

    private static void fillValue(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) ((Math.random() * 10) + 1);
        }
    }
}
