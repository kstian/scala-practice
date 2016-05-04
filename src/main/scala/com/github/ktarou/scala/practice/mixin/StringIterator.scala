package com.github.ktarou.scala.practice.mixin

/**
  * 5/3/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
class StringIterator(s: String) extends AbsIterator {
  type T = Char // define that the type is Char
  private var i = 0
  // this is actually a function declaration, e.g hasNext(){ ...}
  // we can omit the parentheses "()" because it doesn't have arguments
  // and "{}" because it contain only one statement/expression
  def hasNext = i < s.length()
  def next = {
    val ch = s charAt i;
    i += 1;
    ch
  }
}
