import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodsDemo {

    public static void main(String[] args) {
        try {
            Method method = SomeClass.class.getDeclaredMethods()[0];
            Object result = method.invoke(new SomeClass());
            System.out.println(result);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}