package com.axiommd
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

import typings.comAxiommdFirstsprotty.libMod.container
import typings.comAxiommdFirstsprotty.libAurorasprottyModelSourceMod.graph
import typings.sprotty.mod.{LocalModelSource,TYPES}
import typings.sprottyProtocol.libModelMod.SModelRoot
import typings.inversify.mod.Container
import com.axiommd.graphcomponents.{Node,Edge,Graph}
import typings.sprottyProtocol.libModelMod.SModelElement
import scala.scalajs.js.JSConverters.*
import typings.sprottyProtocol.libUtilsGeometryMod.{Point,Dimension}

import typings.comAxiommdFirstsprotty.libAurorasprottyHandlerMod
import typings.comAxiommdFirstsprotty.libAurorasprottyTypesMod
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.comAxiommdFirstsprotty.libAurorasprottyHandlerMod.SjsMouseListener
import typings.sprotty.mod
import org.scalajs.dom.MouseEvent
import typings.sprottyProtocol.libActionsMod.Action
import scala.scalajs.js
import js.JSConverters._
import typings.sprotty.libBaseViewsMouseToolMod.MouseListener
import scala.scalajs.js.Promise
import typings.sprotty.libBaseModelSmodelMod.SModelElementImpl

object PageOutput :
  def apply() =
    val c = container() 
    

    val modelSource = c.get[LocalModelSource](TYPES.ModelSource)
    val sjsMouseListener = c.get[ServiceIdentifier[SjsMouseListener]](typings.comAxiommdFirstsprotty.libAurorasprottyTypesMod.MyTYPES.SjsMouseListener)

    // class GlobalSjsMouseListener extends MouseListener :
    //   override def doubleClick(target: SModelElementImpl, event: MouseEvent): Action | Promise[Action] = 
    //     Main.consoleOut(s"double click on $target !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")  
    //     // println(s"double click on $target !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    //     Action("dblClickHandledinSJS")
    

    val sjsMouseHandler :js.UndefOr[
          js.Function2[/* target */ typings.sprotty.mod.SModelElementImpl, /* event */ MouseEvent, Action | js.Promise[Action]]
        ] = (target: typings.sprotty.mod.SModelElementImpl, event: MouseEvent) =>
        Main.consoleOut(s"double click on $target !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")  
        // println(s"double click on $target !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        Action("dblClickHandledinSJS")
        

  //TODO [HERE]
    
  // sjsMouseListener.globaMouseListener_=(new GlobalSjsMouseListener())
  
    Main.consoleOut(s"global handler has been set !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")  
    modelSource.setModel(g()) 
    h1(s"Hello, world!")

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



