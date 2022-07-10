package com.atguigu.chapter06

object $10_TraitAdd {


  trait Log{
    def logger() = {
      println("Log:.............")
    }
  }

  trait Log1 extends Log{

    override def logger() = {
      println("Log1:.............")
      super.logger()
    }
  }

  trait Log2 extends Log{
    override def logger() = {
      println("Log2:.............")
      super.logger()
    }
  }

  trait Log3 extends Log{
    override def logger() = {
      println("Log3:.............")
      super.logger()
    }
  }

  class ErrorLog extends Log1 with Log2 with Log3{
    override def logger(): Unit = {
      println("ErrorLog:............")
      //super[Log1].logger()
      super.logger()
    }
  }

  /**
    * scala特质是可以多实现的,如果实现的多个特质中都用于方法名一样参数列表也一样的方法,子类实现这多个特质之后调用该同名方法的时候默认是报错的。此时可以子类重写该同名方法解决报错问题。
    * 子类中可以通过super调用父特质的方法,默认情况下super调用的是最后一个特质的该方法,如果想要调用指定父特质的方法,此时可以使用 super[父特质名].方法名 调用
    * 如果子类实现的多个父特质都继承自同一个父特质,后续通过super调用方法的时候方法执行顺序是按照继承顺序从右向左依次执行。
    */
  def main(args: Array[String]): Unit = {

    val log = new ErrorLog
    log.logger()
  }
}
