package com.axiommd
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

import typings.sprotty.mod.{LocalModelSource,TYPES}
import typings.sprottyProtocol.libModelMod.SModelRoot
import com.axiommd.graphcomponents.{Node,Edge,Graph}
import typings.sprottyProtocol.libModelMod.SModelElement
import typings.sprottyProtocol.libUtilsGeometryMod.{Point,Dimension}

import scala.scalajs.js
import js.JSConverters._
import typings.sprotty.libBaseModelSmodelMod.SModelElementImpl

object PageOutput :
  def apply() =
    val c = Container.c
    val modelSource = Container.modelSource


    Main.consoleOut(s"!!!global Mouse Listener: ${Container.sjsMouseListener.globaMouseListener }")  
    EventHandlers

  //TODO [HERE]
    
  
    
    modelSource.setModel(g()) 
    h1(s"Hello, world!!!!")

  def g ():SModelRoot = 
    val elemChildren = (0 to 135).map { i =>
      val node = new Node(s"task$i",s"task$i")
      node.position = Option(Point(i%35*20,i/13*20)).orUndefined
      node.size = Option(Dimension(15,15)).orUndefined
      node
    }.foldLeft(List.empty[SModelElement])((acc, i) => {
      // val edge = new Edge(s"edge$i", s"node$i", s"node${i % 10 + 1}")
      acc:+i.asInstanceOf[SModelElement]
    })
    new Graph(elemChildren.toJSArray).asInstanceOf[SModelRoot]



