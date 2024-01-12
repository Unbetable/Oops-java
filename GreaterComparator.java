public class GreaterComparator {
    public void compare(int num1, int num2) {
        int greater = (num1 > num2) ? num1 : num2;
        System.out.println("The greater integer is: " + greater);
    }

    public void compare(char char1, char char2) {
        char greater = (char1 > char2) ? char1 : char2;
        System.out.println("The greater character is: " + greater);
    }

    public void compare(String str1, String str2) {
        String greater = (str1.compareTo(str2) > 0) ? str1 : str2;
        System.out.println("The greater string is: " + greater);
    }

    public static void main(String[] args) {
        GreaterComparator comparator = new GreaterComparator();

        comparator.compare(5, 10);
        comparator.compare('A', 'Z');
        comparator.compare("apple", "banana");
    }
}
