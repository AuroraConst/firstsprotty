package com.axiommd.graphcomponents

import typings.comAxiommdFirstsprotty.libMod.container
import typings.sprotty.libBaseTypesMod.TYPES
import typings.sprotty.libModelSourceLocalModelSourceMod.LocalModelSource

//TODO [REVIEW handler SJS] listner implementation
class EventHandlers:
  val c = container()
  val modelSource = c.get[LocalModelSource](TYPES.ModelSource)