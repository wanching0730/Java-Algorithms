import java.util.Scanner;

class RotateArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        RotateArray rotateArray = new RotateArray();

        rotateArray.rotateLeft(array, rotateArray.getUserInput());
        rotateArray.printArray(array);
    }

    int getUserInput() {

        System.out.println("Enter number of iteration: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    void rotateLeft(int[] array, int iteration) {
        for (int i = 0; i < iteration; i++) {
            rotateByOne(array);
        }
    }

    void rotateByOne(int[] array) {
        int j;
        int temp = array[0];

        for(j = 0; j < array.length - 1; j++) {
            array[j] = array[j+1];
        }
        array[j] = temp;
    }

    void printArray(int[] array) {
        for(int k = 0; k < array.length; k++) {
            System.out.println(array[k]+"");
        }
    }
}
