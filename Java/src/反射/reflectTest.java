import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectTest {
    public static void main(String[] args) throws NoSuchMethodException {
        // 1.通过字符串获取Class对象，这个字符串必须带上完整路径名
        //Class studentClass = Class.forName(Student);
        // 2.通过类的class属性
        Class studentClass2 = Student.class;
        // 3.通过对象的getClass()函数
        Student studentObject = new Student();
        Class studentClass3 = studentObject.getClass();

        System.out.println(
                "class2 = " + studentClass2 + "\n" +
                "class3 = " + studentClass3 + "\n" +
                "class2 == class3 ? " + (studentClass2 == studentClass3));

        //获取成员变量
        //1、getDeclaredFields用于获取所有声明的字段，包括公有字段和私有字段
        Field[] declaredFieldList = studentClass2.getDeclaredFields();
        for (Field declaredField : declaredFieldList){
            System.out.println("declared Field: " + declaredField);
        }
        //2、获取所有公有的字段
        Field[] fieldList = studentClass2.getFields();
        for (Field field : fieldList) {
            System.out.println("field: " + field);
        }
        //获取构造方法
        //1.获取所有声明的构造方法
        Constructor[] declaredConstructorList = studentClass2.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructorList) {
            System.out.println("declared Constructor: " + declaredConstructor);
        }
        // 2.获取所有公有的构造方法
        Constructor[] constructorList = studentClass2.getConstructors();
        for (Constructor constructor : constructorList) {
            System.out.println("constructor: " + constructor);
        }
        //获取非构造方法
        // 1.获取所有声明的函数
        Method[] declaredMethodList = studentClass2.getDeclaredMethods();
        for (Method declaredMethod : declaredMethodList) {
            System.out.println("declared Method: " + declaredMethod);
        }
        // 2.获取所有公有的函数
        //getMethods 方法不仅获取到了我们声明的公有方法setStudentAge，还获取到了很多 Object 类中的公有方法。
        // 这是因为我们前文已说到：Object 是所有 Java 类的父类。所有对象都默认实现了 Object 类的方法。
        // 而getDeclaredMethods是无法获取到父类中的方法的。
        Method[] methodList = studentClass2.getMethods();
        for (Method method : methodList) {
            System.out.println("method: " + method);
        }
    }

}
