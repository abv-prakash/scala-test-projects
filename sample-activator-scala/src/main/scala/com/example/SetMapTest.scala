package com.example

/**
  * Created by abhinavp on 3/8/16.
  */

import java.util.LinkedHashMap
import scala.collection.JavaConversions._

object SetMapTest {

  def main(args : Array[String]) : Unit = {

    val testKeySetMap = new LinkedHashMap[String,String]()
    testKeySetMap.put("k1","v1")
    testKeySetMap.put("k2","v2")
    testKeySetMap.put("k3","v3")
    testKeySetMap.put("k2","v2")

    val testKeySet = testKeySetMap.keySet()
    val scalaMap = testKeySet.map {x => (x,testKeySetMap.get(x))}
    println(scalaMap)



  }

}
