package com.atguigu.chapter09

import java.sql.{Connection, DriverManager, PreparedStatement}

import scala.util.Try

object $01_Exception {

  /**
    * java中异常处理方式
    *     1、捕获异常: try{...}catch(Exception e){...}....[finally{...}]
    *     2、抛出异常
    *         1、在方法体中通过throw new XXException(...)
    *         2、在方法名后面通过 throws关键字声明异常
    *
    * scala中异常处理方式
    *     1、捕获异常:
    *         1、try{...}catch{
    *             case e: XXException => ....
    *             case e: YYException => ..
    *             .....
    *             case e: Exception => ...
    *           } <此种捕获异常的方式一般只用于获取外部资源链接场景>
    *         2、Try(代码块).getOrElse(默认值) 【如果代码执行成功则返回代码执行成功的结果,如果代码块执行报错则返回默认值】 <常用>
    *             Try: 代表当前代码块可能报错
    *                 Success: 代表代码执行成功
    *                 Failture: 代表代码执行报错
    *     2、抛出异常: 在方法体中通过throw new XXException(...) <一般不用>
    */
  def main(args: Array[String]): Unit = {


    //println(m1(10, 0))

    println(m2(10, 0))

    val list = List("1\tlisi\t20\tshenzhen","\tzhangsan\t30\tbeijing","3\t\t40\tguangzhou","4\twangwu\t\tshenzhen")

    val list2 = list.map(x=>{
      val arr = x.split("\t")
      val region = arr.last
      //val age = try{ arr(2).toInt }catch {case e:Exception=> 0 }
      val age = Try( arr(2).toInt ).getOrElse(0)
      (region,age)
    })

    println(list2)

  }


  /**
    * 抛出异常
    */
  def m1(x:Int,y:Int) = {

    if(y==0) throw new Exception("被除数不能为0...")
    x/y
  }

  /**
    * 捕获异常
    * @param x
    * @param y
    * @return
    */
  def m2(x:Int,y:Int) = {

    try{
      x/y
    }catch {
      case e:Exception =>
        -1
    }
  }

  /**
    * 获取外部资源链接使用try{}catch{}finaly{}
    *
    */
  def jdbcUtil() = {

    var connection:Connection = null
    var statement:PreparedStatement = null
    try{
      connection = DriverManager.getConnection("jdbc:mysql://hadoop102:3306/test","root","root123")

      statement = connection.prepareStatement("insert into person values(?,?,?)")

      statement.setString(1,"lisi")
      statement.setInt(2,20)
      statement.setString(3,"beijing")

      statement.executeUpdate()
    }catch {
      case e:Exception => e.printStackTrace()
    }finally {
      if(statement!=null)
        statement.close()
      if(connection!=null)
        connection.close()
    }


  }
}
