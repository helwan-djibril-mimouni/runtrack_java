package jour03.job03;

public class StrArray {
    public static void main(String[] args) {
        String[] arr = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(arr[1]);
        arr[2] = "Mireille";
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
