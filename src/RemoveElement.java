import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int size,i,temp;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input size of array: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int []array = new int[size];
        System.out.println("Input element of array: ");
        for (i = 0; i < size; i++) {
            System.out.print("Input element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array before remove: ");
        for (int j=0;j<size;j++){
            System.out.print(array[j]+"\t ");
        }
        System.out.println("\nInput element that need to remove: ");
        int isRemovedElement = scanner.nextInt();

        for (temp=i=0;i<size;i++){
            if (array[i] != isRemovedElement){
                array[temp]=array[i];
                temp++;
            }
        }
        size = temp;
        System.out.println("Array after remove " + isRemovedElement + " is: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
