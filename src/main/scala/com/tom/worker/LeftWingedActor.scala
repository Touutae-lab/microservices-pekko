package com.tom.worker

import org.apache.pekko.actor.typed.Behavior
import org.apache.pekko.actor.typed.scaladsl.Behaviors

class LeftWingedActor {
  def apply(): Behavior[Unit] = {
    Behaviors.setup {
      context =>
        val rightWingedActor = context.spawn(new RightWingedActor(), "rightWingedActor")
        Behaviors.receiveMessage {
          case _ =>
            context.log.info("LeftWingedActor received message")
            rightWingedActor ! "Hello"
            Behaviors.same
        }
    }
  }
}
