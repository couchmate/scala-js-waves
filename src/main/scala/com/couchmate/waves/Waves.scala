package com.couchmate.waves

import scala.scalajs.js

@js.native
object Waves extends js.Object {

  def init(config: WavesConfig): Unit = js.native
  def attach(elements: List[String], classes: List[String] = null): Unit = js.native
  def ripple(elements: List[String], options: RippleOptions = null): Unit = js.native
  def calm(elements: List[String]): Unit = js.native

}

@js.native
trait WavesConfig extends js.Object {
  val duration: Int = js.native
  val delay: Int = js.native
}

object WavesConfig {
  def apply(
    duration: Int = 0,
    delay: Int = 0
  ): WavesConfig = {
    js.Dynamic.literal(
      duration = duration,
      delay = delay
    ).asInstanceOf[WavesConfig]
  }
}

@js.native
trait RippleOptions extends js.Object {
  val waitDuration: Int = js.native
  val position: Position = js.native
}

object RippleOptions {
  def apply(
    waitDuration: Int = 0,
    position: Position = null
  ): RippleOptions = {
    js.Dynamic.literal(
      wait = waitDuration,
      position = position
    ).asInstanceOf[RippleOptions]
  }
}

@js.native
trait Position extends js.Object {
  val x: Int = js.native
  val y: Int = js.native
}

object Position {
  def apply(
    x: Int = 0,
    y: Int = 0
  ): Position = {
    js.Dynamic.literal(
      x = x,
      y = y
    ).asInstanceOf[Position]
  }
}
