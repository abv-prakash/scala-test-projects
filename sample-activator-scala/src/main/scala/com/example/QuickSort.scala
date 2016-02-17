package com.example

/**
  * Created by abhinavp on 2/17/16.
  */
object QuickSort {

  def sort(xs: Array[Int]): Array[Int] = {
    if
    (xs.length <= 1) xs
    else {
      val
      pivot = xs(xs.length / 2)
      Array.concat(
        sort(xs filter (pivot >)),
        xs filter (pivot ==),
        sort(xs filter (pivot <)))
    }
  }
  def main(args: Array[String]) : Unit = {

    val arr = Array(1,2,494, 43, 33, 100, 44, 49)
    println("Before sorting:"+arr.mkString(","))
    val sortedArr =  QuickSort.sort(arr)
    println("After sorting"+sortedArr.mkString(","))

  }
}
