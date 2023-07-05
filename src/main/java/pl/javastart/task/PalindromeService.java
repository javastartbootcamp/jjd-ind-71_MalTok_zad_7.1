package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {

        if (isIncorrectInput(array)) {
            return false;
        }

        return checkInputForPalindrome(array);
    }

    private static boolean checkInputForPalindrome(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - i - 1]) {
                count++;
            }
        }

        return count == array.length / 2;
    }

    private static boolean isIncorrectInput(int[] array) {
        return array == null || array.length == 0;
    }
}
