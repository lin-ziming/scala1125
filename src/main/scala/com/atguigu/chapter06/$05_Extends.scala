package com.atguigu.chapter06

object $05_Extends {

  /*final */class Animal{

    private val name:String = "lisi"

    val sex = "man"

    var age = 20

    def m1(x:Int,y:Int) = x+y
  }

  class Dog extends Animal{

    //方法的重写
    override def m1(x: Int, y: Int): Int = {
      val k = x+y
      super.m1(k,x)
    }
    //属性的重写
    override val sex: String = "woman"
    //override var age= 100
  }
  /**
    * java的继承: class 子类 extends 父类
    * scala的继承: class 子类 extends 父类
    *
    * final修饰的类不能被继承
    * private修饰的成员、构造器、代码块不能被继承
    *
    * scala子类可以通过override关键字重写父类的方法和val修饰的属性【var修饰的属性不能重写】
    * scala子类可以通过super调用父类的成员
    *
    * java中只有方法多态,属性不多态,scala中是方法和属性都多态
    *
    *
    */
  def main(args: Array[String]): Unit = {

    val dog = new Dog
    println(dog.sex)
    println(dog.age)
    //println(dog.name)
    println(dog.m1(10, 20))

    val animal:Animal = new Dog
    println(animal.m1(10, 20))
    println(animal.sex)
  }

  class Person(val name:String="lisi",var age:Int=20,address:String){
    var color = ""
    def this(color:String){
      this("wangwu",100,"shenzhen")
      this.color = color
    }
  }

  class Student extends Person("red"){

  }
}
