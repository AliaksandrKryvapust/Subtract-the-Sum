public class Source {
    public static void main(String[] args) {
        int value = 10;
        System.out.println(subtractSum(value).equals("apple"));
    }

    private static final String[] fruits = {
            "kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple",
            "cucumber", "pineapple", "cucumber", "orange", "grape", "orange", "grape", "apple", "grape", "cherry",
            "pear", "cherry", "pear", "kiwi", "banana", "kiwi", "apple", "melon", "banana", "melon",
            "pineapple", "melon", "pineapple", "cucumber", "orange", "apple", "orange", "grape", "orange", "grape",
            "cherry", "pear", "cherry", "pear", "apple", "pear", "kiwi", "banana", "kiwi", "banana",
            "melon", "pineapple", "melon", "apple", "cucumber", "pineapple", "cucumber", "orange", "cucumber", "orange",
            "grape", "cherry", "apple", "cherry", "pear", "cherry", "pear", "kiwi", "pear", "kiwi",
            "banana", "apple", "banana", "melon", "pineapple", "melon", "pineapple", "cucumber", "pineapple", "cucumber",
            "apple", "grape", "orange", "grape", "cherry", "grape", "cherry", "pear", "cherry", "apple",
            "kiwi", "banana", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple"
    };

    public static String subtractSum(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        temp = n - sum;
        if (temp > 100) {
            return subtractSum(temp);
        }
        return fruits[temp - 1];
    }
}
