package at.makubi.startgame

import java.lang.Thread
import java.util.TimerTask

object Kernel extends TimerTask {

  val roundTimeMillis = 10000
  var round: Int = 1

  def run() {
      round += 1
  }
}