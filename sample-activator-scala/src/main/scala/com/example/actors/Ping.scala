package com.example.actors

import akka.actor.{Props, Actor}
import akka.event.Logging
import akka.actor.Actor.Receive


/**
  * Created by abhinavp on 3/8/16.
  */
class Ping extends Actor {

  val log = Logging(context.system,this)

  override def receive: Receive = {
    case "test" => log.info("Recieved test message")
    case _ => log.info("received some other message")
  }
}

object Ping {
  def props : Props = Props(new Ping())
}