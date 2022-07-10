package com.atguigu.chapter02

object $01_Operator {

  /**
    * java中标识符的命名规范: 必须是数字、字母、下划线、$,首字母不能是数字
    *
    * scala中标识符的命名规范: 必须是数字、字母、下划线、特殊符号、$,首字母不能是数字
    *
    * scala中标识符虽然可以用特殊符号,但是不推荐我们开发使用
    * 开发中推荐还是使用java之前的定义方法[驼峰原则.见名知意]
    *
    */
  def main(args: Array[String]): Unit = {

    val +  = 20
    println(+)

    val & = 100
    println(&)

    println(1 + 10)
  }
}
