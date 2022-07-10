package com.atguigu.chapter11

object $04_GenericChange {

  //非变
  class P1[T]

  //协变
  class P2[+T]

  //逆变
  class P3[-T]

  /**
    * 非变[T]: 类型一样泛型不一样,创建出来的对象之间没有任何关系
    * 协变[+T]: 类型一样泛型是父子关系的时候,创建出来的对象之间继承了泛型的父子关系
    * 逆变[-T]: 类型一样泛型是父子关系的时候,创建出来的对象之间颠倒了泛型的父子关系1
    */
  def main(args: Array[String]): Unit = {

    var animals = List[Animal]( new Animal,new Animal)
    val dos = List[Dog](new Dog,new Dog)

    animals = dos

    println(animals)

    //非变
    var p1 = new P1[Animal]
    var p2 = new P1[Dog]

    //p1 = p2
    //p2 = p1

    //协变
    var p3 = new P2[Animal]
    var p4 = new P2[Dog]
    p3 = p4
    //p4 = p3
    println(p3)

    //逆变
    var p5 = new P3[Animal]
    var p6 = new P3[Dog]
    p6 = p5
   // p5 = p6
    println(p6)
  }

  class Animal

  class Dog extends Animal
}
