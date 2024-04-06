package com.tom.httpactor

import org.apache.pekko.actor.typed.Behavior
import org.apache.pekko.actor.typed.scaladsl.Behaviors
import org.slf4j.LoggerFactory

import scala.concurrent.ExecutionContext

class HttpActor {
  val logger = LoggerFactory.getLogger(getClass)
  
  def apply(): Behavior[_] = {
    Behaviors.setup { context =>
      implicit val system = context.system
      implicit val ec = context.executionContext
      
      
      
      
      Behaviors.same
    }
  }
}
