package com.atguigu.chapter03

import com.atguigu.chapter01.Person

object $01_command {

  /**
    * java中运算符
    *     算术运算符: +  -  *  /  %  ++  --
    *     逻辑运算符: && || !
    *     赋值运算符: += -= *= /= =
    *     比较运算符: > < >= <= == !=
    *     位运算符: << >> >>> & |
    *     三元运算符: 布尔表达式 ? true语句 : false语句
    *
    *scala中运算符
    *    算术运算符: +  -  *  /  %
    *    逻辑运算符: && || !
    *    赋值运算符: += -= *= /= =
    *    比较运算符: > < >= <= == !=
    *    位运算符: << >> >>> & |
    *scala运算符没有++、--、三元运算符。
    *scala中==是比较值是否相同,eq方法是判断是否为同一个对象
    *scala中运算符是一个个的方法
    *scala方法调用的两种方式:
    *     对象.方法名(参数值,...)
    *     对象 方法名 (参数值,...) [如果方法只有一个参数,()可以省略]
    *
    */
  def main(args: Array[String]): Unit = {

    val a = 10
    println(a + 20)

    val s1 = "hello"
    val s2 = s1+""
    //对象 方法名 (参数值,...) [如果方法只有一个参数,()可以省略]
    println(s1 == s2 )
    println(s1==s2 )
    println(s1 == (s2) )
    println(s1.==(s2) )
    println(s1.eq(s2))
    println(s1 eq s2 )

    val person = new Person
    person main null
    person.main(null)
    person main2

    println("123")
  }
}
