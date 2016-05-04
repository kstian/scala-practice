package com.github.ktarou.scala.practice.mixin

/**
  * 5/3/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
trait RichIterator extends AbsIterator{
  // this method takes function f as argument
  // the function f receive type of T as input and no return value (type of Unit)
  def foreach(f: T => Unit): Unit = {
    while (hasNext) {
      f(next)
    }
  }
}
