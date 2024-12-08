package com.axiommd.graphcomponents

import typings.sprottyProtocol.libModelMod.{SNode, SEdge,SModelElement}

class Edge(_id:String, _sourceId:String, _targetId:String,routerKind:String = "manhattan") 
extends  SEdge :
    
  val id: String = _id
  val `type`:String = "edge"
  var sourceId: String = _sourceId
  var targetId: String = _targetId
end Edge