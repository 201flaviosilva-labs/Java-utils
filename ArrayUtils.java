import java.util.Arrays;

// Array Of Strings
public class ArrayUtils {
  public static String[] add(String[] originalArr, String text) {
    String newArr[] = new String[originalArr.length + 1];

    for (int i = 0; i < originalArr.length; i++) {
      newArr[i] = originalArr[i];
    }

    newArr[newArr.length - 1] = text;

    return newArr;
  }

  public static String[] remove(String[] originalArr, String item) {
    String newArr[] = new String[originalArr.length - 1];
    int index = findIndex(originalArr, item);

    for (int i = 0, k = 0; i < originalArr.length; i++) {
      if (i == index)
        continue;

      newArr[k++] = originalArr[i];
    }

    return newArr;
  }

  public static int findIndex(String[] originalArr, String item) {
    int index = -1;
    for (int i = 0; i < originalArr.length; i++) {
      if (originalArr[i].equals(item)){
        index = i;
			}
    }

    return index;
  }

  public static void reverse(String[] originalArr) {
    int size = (int) (Math.floor(originalArr.length / 2));

    for (int i = 0; i < size; i++) {
      int index = originalArr.length - i - 1;
      String tempValue = originalArr[index];
      originalArr[index] = originalArr[i];
      originalArr[i] = tempValue;
    }
  }

  public static String[] reverseNewArray(String[] originalArr) {
    String reversedArray[] = new String[originalArr.length];

    for (int i = 0; i < originalArr.length; i++) {
      int index = originalArr.length - i - 1;
      reversedArray[i] = originalArr[index];
    }

    return reversedArray;
  }

  public static void sort(String[] originalArr) {
    Arrays.sort(originalArr);
  }

  public static void print(String[] originalArr) {
    for (String e : originalArr) {
        System.out.println(e);
    }
  }
}
