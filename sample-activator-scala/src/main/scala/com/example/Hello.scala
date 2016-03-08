package com.example

object Hello {

  def sum(x :Int = 1, y :Int = 3) : Int = x + y

  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val testArray = Array(1,2,3,4)
    println(testArray.length)
    sum()
  }
}
