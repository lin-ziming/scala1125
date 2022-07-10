package com.atguigu.chapter06

import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable
import scala.collection.mutable.{HashMap => _, _}


object $06_Package {

  private[chapter06] val color = "red"
  /**
    * 包的作用:
    *     1、区分同名类
    *     2、便于管理
    * java中包的用法
    *     1、导入包
    *       1、导入位置: 必须在声明包下面在类上面
    *       2、语法:
    *           1、导入包下所有类: import 包名.*
    *           2、导入包下某个类: import 包名.类名
    *     2、声明包:
    *          语法: package 包名
    *         声明包必须在源文件第一行
    *scala中包的用法
    *     1、导入包
    *         scala可以在任何位置导入包
    *         scala在某个作用域导入的包只能在该作用域和子作用域使用
    *         语法:
    *             1、导入包下所有类: import 包名._
    *             2、导入包下某个类: import 包名.类名
    *             3、导入包下多个类: import 包名.{类名1,类名2,...}
    *             4、导入包下某个类并起别名: import 包名.{类名=>别名}
    *             5、导入包下除开某个类的所有类: import 包名.{类名=>_ , _ }
    *     2、声明包
    *          语法: package 包名
    *         声明包必须在源文件第一行
    *     3、创建包
    *         语法: package 包名{....}
    *         此种方式创建的包只能在classes目录才能看到
    *     4、包对象
    *         语法: package object 包名{...}
    *         包对象中定义所有的非private属性和方法都可以在该包任何位置使用。
    *     5、包和访问修饰符结合
    *         语法: private[包名]
    *         代表修饰的类/属性/方法只能在该包中使用
    *
    */
  def main(args: Array[String]): Unit = {

    import java.util.ArrayList

    val list = new ArrayList[String]()

    val func = () => {
      new ArrayList[String]()
    }

    val hashMap = new JavaHashMap[String,Int]()

    //new mutable.HashMap[]()
  }

  //new ArrayList[String]()
}

package sub{

  class Person

  object Student{

    def main(args: Array[String]): Unit = {

    }
  }
}
