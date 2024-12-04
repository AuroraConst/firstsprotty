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

    modelSource.setModel(g()) 

    EventHandlers //initialiES EVENT HANDLERS
    
    
    h1(s"Hello, world!!!!")

  def g ():SModelRoot = 
    val elemChildren = (0 to 135).map { i =>
      val node = new Node(s"task$i",s"task$i")
      node.position = Option(Point(i%35*30,i/13*20)).orUndefined
      node.size = Option(Dimension(12,25)).orUndefined
      node
    }.foldLeft(List.empty[SModelElement])((acc, node) => {
      
      acc:+node.asInstanceOf[SModelElement]
    })

    val elemEdges = (0 to 134).map { i =>
      new Edge(s"edge$i", s"task$i", s"task${i  + 1}")
    }.foldLeft(elemChildren)  {(acc, edge) => {
      acc:+edge.asInstanceOf[SModelElement]
    }}

    new Graph(elemEdges.toJSArray).asInstanceOf[SModelRoot]



