package com.atguigu.chapter02

object $05_DataType {

  /**
    * java数据类型:
    *     1、基本数据类型: byte、short、int、long、float、double、boolean、char
    *     2、引用类型: String、数组、集合、java class
    *
    *scala是完全面向对象的
    *Any: 所有类的父类
    *     AnyVal: 值类型
    *         Byte、Short、Int、Long、Float、Double、Boolean、Char
    *         Unit: 相当于java的void,有一个实例()
    *         Stringops: 是对java 字符串补充的一些列类型的统称
    *     AnyRef: 引用类型
    *         String、java数组、java集合、java class、scala数组、scala集合、scala class
    *             Null: 是所有引用类型的子类, 有一个实例null, null一般用于给<引用类型>赋予初始值,此时必须指定变量的类型
    *Nothing: 所有类的子类[scala内部使用]
    *
    */
  def main(args: Array[String]): Unit = {

    //null一般用于给引用类型赋予初始值,此时必须指定变量的类型
    var x = null
    //x = "lisi"

    var y:String = null

    y = "lisi"

    //null一般用于给<引用类型>赋予初始值
    //var x:Int = null

    //x = 10

    val z = {

      return 10
    }

  }
}
