import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeptionsExamples {

    //unchecked exception
    public void indexOutOfBounds() {
        List<String> lst = new ArrayList<>();
        lst.add("item-1");
        lst.add("item-2");
        lst.add("item-3");
        String result = lst.get(lst.size()-1);
    }

//    public void checkedException() {
//        String fileName = "file does not exist";
//        File file = new File(fileName);
//        FileInputStream stream = new FileInputStream(file);
//    }

    public void multiCheck() {
        try {
            int[] a = new int[5];
            a[5] = 30 / 0;
//            throw new NullPointerException("Null pointer");
//            throw new RuntimeException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("outOfBounds exception");
        } catch (Exception exception) {
            System.out.println("Parent exception");
        } finally {
            System.out.println("Finally block");
        }
    }

    public void simpleTry() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/main/resources/test"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
    public void tryWithResources() {
        try (Scanner scanner = new Scanner(new File("src/main/resources/test"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

    public void test(int x) throws MyCustomException {
        if (x>5) {
            throw new MyCustomException("x is bigger than 5. You are fired!");
        } else {
            System.out.println("x is smaller than 5. You are fine. ");
        }
    }
}
