package DSA;

public class FindEle {
    public static void main(String[] args) {
        int arr[] = {12, 18, 16, 19, 22};
        int target = 19;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println(index != -1 ? "found at index :" + index : "Not found");
    }
}
