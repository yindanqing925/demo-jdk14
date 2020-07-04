package org.nh.jdk14.demo;

/**
 * InstanceDemo
 *
 * @author: yindanqing
 * @date: 2020/7/4 18:45
 * @description: instanceof 语法糖
 */
public class InstanceDemo {

    public static void main(String[] args) {
        Object obj = new String("str");
        if(obj instanceof String str){
            System.out.println(str);
        }else {
            System.out.println("Not String");
        }
    }

}
