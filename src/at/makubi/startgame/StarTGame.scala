package at.makubi.startgame

import java.util.Timer
import util.Random

object StarTGame extends App {

  val kernelTimer = new Timer
  var playerList: List[Player] = Nil

  kernelTimer scheduleAtFixedRate (Kernel, 0, Kernel.roundTimeMillis)

  playerList = new Player("Player 1") :: playerList
  playerList = new Player("Player 2") :: playerList

  Statistics printGameStatisticsTimed this

  override def toString = "Current round: "+Kernel.round+", number of players: "+playerList.length
}