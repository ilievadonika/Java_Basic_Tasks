import java.util.Scanner;

public class Codenavirus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] word = new int[0]; // Creating an array.

            String string;
            System.out.print("world: ");
            string = input.nextLine();

            // Close the scanner --
            input.close();

            //string = "What is 8this pro98gram doin8g?";

            int counter = 0;
            for (int i = 0; i < string.length(); i++) {
                //System.out.println("Test");
                // Check to see if charAt(i) is a letter.
                if (Character.isLetter(string.charAt(i))) {
                    // Counter every time the next char is a letter.
                    counter++;
                } else {
                    // Check if there are any valid characters
                    if (counter > 0) {
                        // Resize the array and add the new char count
                        word = addToArray(word, counter);
                        // Reset the counter to create a new word.
                        counter = 0;
                    }
                }
            }
            /* if the last characters in the string were letters then we need to
             * add the last count to the array
             */
            if (counter > 0) {
                // Resize the array and add the new char count
                word = addToArray(word, counter);
            }
            // Prints out all the arrays.
            for (int j = 0; j < word.length; j++) {
                // Print the value of each array.
                System.out.println(word[j]);
            }
        }

        public static int[] addToArray(int[] array, int charCount){
            // Resize the array
            array = resizeArray(array, array.length + 1);
            // Get the length and reduce 1 to get the last array index
            array[array.length - 1] = charCount;

            return array;
        }

        public static int[] resizeArray(int[] arrayToResize, int size) {
            // create a temp array
            int[] tempArray = new int[size];

            // check if the new size is different to the new size
            if (arrayToResize.length != size) {
                // copy array contents to new array
                for (int i = 0; i < arrayToResize.length; i++) {
                    tempArray[i] = arrayToResize[i];
                }
            } else {
                tempArray = arrayToResize;
            }
            // return copied array resized.
            return tempArray;
        }
    }
    }
}
