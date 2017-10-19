package example.SomeLearn1;

public class GenericMethodTest {
    public static void main(String[] args) {

//        创建不同类型数组：Integer，Double 和Character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.5};
        Character[] charArray = {'H','E','R','T'};

        System.out.println("整型数组元素为：");
        printArray(intArray);
        System.out.println("\n双精度型数组元素为：");
        printArray(doubleArray);
        System.out.println("\n字符型数组元素为:");
//        printArray(intArray);
//        printArray(doubleArray);
        printArray(charArray);


    }

    public static <E> void printArray(E[] inputArray){
//        输出数组元素
        for (E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }
}
