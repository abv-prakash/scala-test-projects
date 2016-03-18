package com.example.constructors

import akka.actor.ActorLogging

/**
  * Created by abhinavp on 3/10/16.
  */
class ObjectA {

  import ObjectA._

  def doWork() : Unit = {
    println(s"Hello ${name.getOrElse("Stranger")} , your id : ${id.getOrElse(0)}" )
  }
}


object ObjectA {

  var name : Option[String] = None
  var id : Option[Int] = None
  def apply(name : String , id: Int) = {
    this.name = Some(name)
    this.id = Some(id)
    new ObjectA()
  }

}