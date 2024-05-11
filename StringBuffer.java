
public class StringBuffer {
    public static void main(String[] args) {
        String fruit = "Apple";
        System.out.println("Before appending :" + fruit.hashCode());
        fruit = fruit + 's';
        System.out.println("After appending :" + fruit.hashCode());

        StringBuffer stringBuffer = new StringBuffer("Apple");
        System.out.println("Before appending :" + stringBuffer.hashCode());
        stringBuffer.append('s');
        System.out.println("After appending :" + stringBuffer.hashCode());
    }

}
