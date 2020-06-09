package com.lxtech.tbrelics.util;

import com.lxtech.tbrelics.domain.LResource;
import com.lxtech.tbrelics.view.ViewShopcart;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author RLL
 * @date 2019/5/6
 */
public class FatherToChildUtil {
    /**
     * 将父类的属性赋值给子类(利用反射)
     *
     * @param father 父类
     * @param child  子类
     * @param <T>
     * @throws Exception
     */
    public static <T> void fatherToChild(T father, T child) throws Exception {
        if (child.getClass().getSuperclass() != father.getClass()) {
            throw new Exception("child 不是 father 的子类");
        }
        Class<?> fatherClass = father.getClass();
        //getDeclaredFields()获得某个类的所有声明的字段，即包括public、private和proteced，但是不包括父类的申明字段
        Field[] declaredFields = fatherClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            //field.getName()获取字段的名称
            //getDeclaredMethod(...)获取的是类自身声明的所有方法，包含public、protected和private方法。
            Method method = fatherClass.getDeclaredMethod("get" + upperHeadChar(field.getName()));
            Object obj = method.invoke(father);
            //通过调用 setAccessible(true)方法会关闭指定类 Field 实例的反射访问检查.
            //这行代码执行之后不论是私有的、受保护的以及包访问的作用域，你都可以在任何地方访问，即使你不在他的访问权限作用域之内。
            field.setAccessible(true);
            field.set(child, obj);
        }

    }


    /**
     * 将属性名称的首字母变成大写
     *
     * @param in 属性名称
     * @return 字母变成大写的属性名称
     */
    public static String upperHeadChar(String in) {
        if (in == null || "".equals(in)) {
            return in;
        }
        if (in.length() == 1) {
            return in.toUpperCase();
        } else {
            return in.substring(0, 1).toUpperCase() + in.substring(1);
        }
    }

}
