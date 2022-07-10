package com.atguigu.chapter01

object HelloWord {

  /**
    * java中main方法语法: public static void main(String[] args){....}
    * scala没有public关键字,默认就是类似java public效果的
    * scala object中的所有属性和方法都是类似java static修饰的
    * scala class中的所有属性和方法都是类似java 非static修饰的
    * scala Unit就相当于java的void
    * def是defined缩写,def相当于方法的标识符
    * Array就是数组,Array[String]就是字符串数组,scala中中括号代表泛型相关
    *
    * scala中如果一行只写一个语句,那么每行结果的分号可以省略,如果一行写多个语句那么分号必须加上
    */
  def main(args: Array[String]): Unit = {

    System.out.println("hello zhangsan....")

    println("hello....")

    val person = new Person()
    person.main(null)
  }
}
