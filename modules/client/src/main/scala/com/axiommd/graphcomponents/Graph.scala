package com.axiommd.graphcomponents

import typings.sprottyProtocol.libModelMod.SGraph
import scala.scalajs.js
import js.UndefOrOps
import typings.sprottyProtocol.libModelMod.SModelElement

class Graph(_children:js.Array[SModelElement]) extends SGraph:
  val id: String = "graph"
  val `type`: String = "graph"
  var children:js.Array[SModelElement] = _children



