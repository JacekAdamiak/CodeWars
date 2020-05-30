package CodeWars;

public class EnoughIsEnough {

    public static void main(String[] args) {
        int[] testList = new int[] { 20, 37, 20, 21, 100, 100 };
        int[] newList = deleteNth(testList, 1);

        System.out.print("{ ");
        for (int i=0; i<newList.length; i++) {
            if (i<newList.length-1) {
                System.out.print(newList[i] + ", ");
            } else {
                System.out.print(newList[i] + " ");
            }
        }
        System.out.print("}");
    }

        public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int[] newElements = elements;
        return newElements;
    }
}
