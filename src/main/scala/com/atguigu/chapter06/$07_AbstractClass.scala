package com.atguigu.chapter06

object $07_AbstractClass {

  abstract class Animal{

    //抽象属性
    val name:String

    //具体属性
    var age:Int = 10

    /**
      * 抽象方法
      * @param x
      * @param y
      * @return
      */
    def m1(x:Int,y:Int):Int

    /**
      * 具体方法
      * @param x
      * @return
      */
    def m2(x:Int) = x*x

  }

  class Dog extends Animal{


    override val name: String = "lisi"

    /**
      * 抽象方法
      *
      * @param x
      * @param y
      * @return
      */
    override def m1(x: Int, y: Int): Int = x+y
}
  /**
    * java中抽象类语法: [访问修饰符] abstract class 类名{...}
    * java中定义抽象方法: 访问修饰符 abstract 返回值类型 方法名(...)
    *
    * scala中抽象类: abstract class 类名{...}
    * 抽象类中可以定义抽象方法,也可以定义具体方法，既可以定义抽象属性也可以定义具体属性
    *     抽象方法: 没有方法体的方法称之为抽象方法
    *     抽象属性: 没有初始化的属性称之为抽象属性
    * 子类继承抽象父类之后,如果子类是非抽象类必须重写父类的抽象属性和抽象方法
    *
    */
  def main(args: Array[String]): Unit = {

    val dog = new Dog()

    //匿名子类
    val animl = new Animal {
      override val name: String = "lisi"

      /**
        * 抽象方法
        *
        * @param x
        * @param y
        * @return
        */
      override def m1(x: Int, y: Int): Int = x-y
    }

    println(animl.name)
  }
}
