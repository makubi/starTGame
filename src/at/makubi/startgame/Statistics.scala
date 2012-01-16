package at.makubi.startgame

import util.Random
import java.lang.Thread

object Statistics {

  val printStatisticsJob = new PrintStatistics()
  val printStatisticsThread = new Thread(printStatisticsJob)

  def printGameStatistics(any: Any): Unit = println (any)

  def printGameStatisticsTimed(any: Any) {
    printStatisticsJob any = any
    printStatisticsThread.start()
  }
}

class PrintStatistics(var any: Any) extends Runnable {
  def run() {
    val random = new Random
    while(true) {
      Statistics printGameStatistics(any)
      Thread sleep( (2 + (random nextInt 8)) * 1000 )
    }
  }
}