package com.axiommd


import typings.comAxiommdSecondsprotty.libMod.container
import typings.inversify.libEsmMod.Container
import typings.sprotty.mod.{LocalModelSource,TYPES}
import scala.scalajs.js
import js.JSConverters._
import org.scalajs.dom
import typings.sprottyProtocol.libActionsMod.Action


import typings.comAxiommdSecondsprotty.libAurorasprottyHandlerMod.SjsMouseListener


object Container :
  val c = container().asInstanceOf[Container]
  val modelSource = c.get[LocalModelSource](TYPES.ModelSource)

  //TODO,CHANGE SYMBOL TO MOUSELISTENER from SjsMouseListener
  // val sjsMouseListener = c.get[SjsMouseListener](typings.comAxiommdSecondsprotty.libAurorasprottyTypesMod.MyTYPES.SjsMouseListener)
  // val sjsMouseListener = c.get[SjsMouseListener](TYPES.MouseListener)
end Container