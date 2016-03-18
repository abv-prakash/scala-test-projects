package com.example.actors

/**
  * Created by abhinavp on 3/9/16.
  */

import akka.actor.Actor.Receive
import akka.actor.{ActorLogging, Actor}

object MyActor {
  case class Greeting(from : String)
  case object GoodBye
}

class MyActor extends Actor with ActorLogging {
  import MyActor._
  override def receive: Receive = {

    case Greeting(greeter) => {
      log.info(s"Hello $greeter")
      println("Greeting sleeping now")
      Thread.sleep(10 * 1000)
      println("Greeting awake now")
    }
    case GoodBye => log.info("GoodBye")
    case _ => log.info("Unknown message")

  }
}
