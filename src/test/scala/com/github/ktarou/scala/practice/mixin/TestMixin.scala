package com.github.ktarou.scala.practice.mixin

/**
  * 5/3/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
object TestMixin extends App{
  class MixinIterator extends StringIterator("MIXIN") with RichIterator
  val mixinIterator = new MixinIterator

  // can be changed to mixinIterator.foreach(println)
  mixinIterator foreach println
}
