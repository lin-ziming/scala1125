package com.atguigu.chapter02

object $04_String {

  /**
    * java中获取字符串
    *     1、双引号: String name = "lisi"
    *     2、new创建: String name = new String("..")
    *     3、+号拼接: String name = "lisi"+"haha"
    *     4、一些方法: toString、subString....
    *
    * scala获取字符串
    *     1、双引号: val name = "lisi"
    *     2、new创建: val name = new String("lisi")
    *     3、拼接
    *         1、+号拼接: val name = "lisi"+"haha"
    *         2、插值表达式: val msg = s"${变量名/值/表达式}...."
    *     4、一些方法: toString、subString...
    *     5、三引号: """...""" [一般用于写sql语句]
    *
    */
  def main(args: Array[String]): Unit = {
    //1、双引号: val name = "lisi"
    val name: String = "lisi"

    //2、new创建: val name = new String("lisi")
    val sex = new String("M")


    //3.1、+号拼接: val name = "lisi"+"haha"
    val msg = name + sex

    //3.2、插值表达式: val msg = s"${变量名/值/表达式}...."
    val msg2 = s"hello ${name} ${10} ${1+1}"
    println(name)
    println(sex)
    println(msg)
    println(msg2)

    //4、一些方法: toString、subString...
    val age = 10
    val ageString = age.toString
    println(ageString)

    val sql = "select " +
      "id," +
      "name," +
      "age" +
      " from person left join (" +
      " select id,sex,age from student where id<=20) b on person.id = b.id"

    val sql2 =
      s"""
        |select
        |   id,
        |   ${name},
        |   age
        | from person left join (
        |     select
        |       id,
        |       name,
        |       sex,
        |       address
        |     from student
        |       where id<=30
        |   )b
        |on person.id = b.id
      """.stripMargin
    println(sql2)
  }
}
