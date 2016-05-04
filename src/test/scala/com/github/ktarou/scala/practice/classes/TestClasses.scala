package com.github.ktarou.scala.practice.classes

/**
  * 5/3/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
object TestClasses extends App{
  val pt = new Point(1, 2)
  println(pt)
  pt.move(10, 10)
  println(pt)
}
