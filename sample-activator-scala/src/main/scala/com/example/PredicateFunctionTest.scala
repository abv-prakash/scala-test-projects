package com.example

import scala.collection.mutable

/**
  * Created by abhinavp on 3/8/16.
  */


object PredicateFunctionTest {


  def filter(p: String => Boolean) : mutable.MutableList[String] = {

    val inputList = List("1","2","3","4","5")
    println(inputList)
    val outputList = mutable.MutableList[String]()
    for (x <- inputList) {
      println("x is" + x + ", p(x) is " + p(x))
      if (p(x)) outputList += x
    }
    outputList
  }

  def main(args : Array[String]) : Unit = {

    val checkList = List("4","5")
    println(filter(!checkList.contains(_)))
    println(filter(checkList.contains(_)))
    println(filter(x => checkList.contains(x)))

  }

}
