package com.axiommd.graphcomponents

import typings.sprottyProtocol.libModelMod.{SNode, SEdge,SModelElement}
import typings.sprottyProtocol.libModelMod.SEdge
import scala.scalajs.js
import js.JSConverters.*
import org.scalactic.Bool
import typings.comAxiommdSecondsprotty.libAurorasprottyModelMod.TaskNode

class Node(_id:String, _name:String) 
  extends  TaskNode :
  var id:String = _id
  var name:String = _name
  var `type`:String = "task"
  var isRunning = false
  var isFinished = false
end Node
