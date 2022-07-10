package com.atguigu.chapter06

object $03_ConstructMethod {

  class Person(private val name:String = "zhangsan", var age:Int = 0, address:String){

    var mony:Double = _
    /**
      * 辅助构造器
      */
    def this(age:Int) {
      this(age=age,address="shenzhen")
      //this(2.2)
    }

    def this(mony:Double){
      this( 100 )
      this.mony = mony

    }

    def this(){
      this(100)
    }

    def getAddress( ) = this.address

    //def setAddress(address:String) = this.address = address
  }

  class Student extends Person
  /**
    * scala的构造器分为两种: 主构造器、辅助构造器
    *     主构造器
    *         定义位置: 定义类名后面
    *         语法: 在类名后面以 ([访问修饰符] [val/var] 属性名:类型[=默认值],...) 形式表示
    *                 主构造器中的属性使用val/var与不使用val/var修饰的区别:
    *                     val/var修饰的非private属性可以在class内部与外部使用
    *                     不用val/var修饰的属性只能在class内部使用[相当于是private val修饰的]
    *     辅助构造器
    *         定义位置: 定义在class内部
    *         语法: def this(参数名:类型,...){
    *             //辅助构造器第一行必须调用其他的辅助构造器或者主构造器
    *             this(...)
    *         }
    */
  def main(args: Array[String]): Unit = {

    val person = new Person(address = "beijing")

    println(person.age)
    println(person.getAddress())

    val person2 = new Person(20)
    println(person2.age)
    println(person2.getAddress())

    val person3 = new Person(1555.5)
    println(person3.mony)
    println(person3.age)
  }
}
