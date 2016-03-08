package com.example

/**
  * Created by abhinavp on 3/7/16.
  */
object CompanionTestClient {

  def main(args : Array[String]): Unit = {
    val companionTest = CompanionTest()
    println(companionTest.sum(2,3))
  }

}
