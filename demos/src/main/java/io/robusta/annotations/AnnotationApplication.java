package io.robusta.annotations;

import io.robusta.files.DespacitoApplication;
import sun.security.krb5.internal.crypto.Des;

import java.lang.reflect.Method;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class AnnotationApplication {

    public static void main(String[] args) {

        Class<DespacitoApplication> myClass = DespacitoApplication.class;
        Method[] methods = myClass.getDeclaredMethods();

        for (Method method: methods){//(int i=0; i<methods.length; i++)

            System.out.println(method.getName());//System.out.println(methods[i].getName());
        }

        for (Method method: methods){ //(int i=0; i<methods.length; i++)

            System.out.println(method.getName()+ ":" + method.getDeclaredAnnotations().length);//System.out.println(methods[i].getName());
            //
        }

        int count = 0;

        for (Method method: methods){
            Slow slow = method.getDeclaredAnnotation(Slow.class);
            if (slow !=null){
                count++;
            }

        }
        System.out.println("count : "+count) ;

        long totalTime = 0;

        for (Method method: methods){
            Slow slow = method.getDeclaredAnnotation(Slow.class);
            if (slow !=null){
                totalTime = totalTime + slow.expectedTime();
            }
    }
        System.out.println("count : "+count);

    }
}

