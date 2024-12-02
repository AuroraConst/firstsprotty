package com.axiommd


import typings.comAxiommdFirstsprotty.libMod.container
import typings.sprotty.mod.{LocalModelSource,TYPES}
import scala.scalajs.js
import js.JSConverters._
import org.scalajs.dom
import typings.sprottyProtocol.libActionsMod.Action


import typings.comAxiommdFirstsprotty.libAurorasprottyHandlerMod.SjsMouseListener


object Container :
  val c = container() 
  val modelSource = c.get[LocalModelSource](TYPES.ModelSource)
  val sjsMouseListener = c.get[SjsMouseListener](typings.comAxiommdFirstsprotty.libAurorasprottyTypesMod.MyTYPES.SjsMouseListener)
end Container