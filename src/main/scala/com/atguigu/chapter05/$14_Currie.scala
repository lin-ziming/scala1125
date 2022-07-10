package com.atguigu.chapter05

object $14_Currie {

  /**
    * 柯里化: 有多个参数列表的方法称之为柯里化
    *
    */
  def main(args: Array[String]): Unit = {

    println(m1(10, 20)(30)(40))

    val f1 = m3(10,20)

    val f2 = f1(30)

    val r = f2(40)

    val r2 = m3(10,20)(30)(40)

    println(r)
    println(r2)

  }

  /**
    * 柯里化
    */
  def m1(x:Int,y:Int)(z:Int)(t:Int) = {
    x + y +z + t
  }

  def m2(x:Int,y:Int,z:Int,t:Int) = x + y +z + t

  /**
    * 柯里化演变过程
    */
  def m3(x:Int,y:Int) = {

    val f1 = (z:Int) => {

      val f2 = (t:Int) => {

        x+y+z+t
      }

      f2
    }

    f1
  }
}
