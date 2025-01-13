package com.axiommd
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
// import typings.comAxiommdFirst.*
import typings.comAxiommdSecondsprotty.libMod.{container}
import typings.comAxiommdSecondsprotty.libAurorasprottyModelSourceMod.graph
import typings.sprotty.mod.{LocalModelSource,TYPES}
import typings.sprottyProtocol.libModelMod.SModelRoot
import typings.inversify.libEsmMod.Container
import typings.sprottyProtocol.libModelMod.SGraph

 
object Main :

  def consoleOut(msg: String): Unit =
    dom.console.log(s"%c $msg","background: #222; color: #bada55")

  def main(args: Array[String]): Unit =
    
    val element = dom.document.querySelector("#app")
    renderOnDomContentLoaded(element,div({PageOutput()}))

  

