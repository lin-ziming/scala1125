package com.atguigu.chapter07

import scala.collection.mutable

object $11_MutableQueue {

  def main(args: Array[String]): Unit = {
    //创建可变队列
    val q1 = mutable.Queue[Int](1,4,3,2,5)
    println(q1)

    //添加元素
    val q2 = q1.+:(30)
    println(q2)

    val q3 = q1.:+(40)
    println(q3)

    q1.+=(50)
    println(q1)

    q1.+=:(60)
    println(q1)

    val q4 = q1.++(List(11,22,33))
    println(q4)

    val q5 = q1.++:(List(11,22,33))
    println(q5)

    q1.++=(List(11,22,33))
    println(q1)

    q1.enqueue(11,22,33,44)
    println(q1)

    //删除
    q1.dequeue()
    println(q1)

    //获取角标元素
    println(q1(0))

    //修改角标值
    q1(0) = 100
    println(q1)
  }
}
