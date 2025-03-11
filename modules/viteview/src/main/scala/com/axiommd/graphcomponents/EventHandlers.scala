package com.axiommd.graphcomponents

import typings.firstsprotty.libMod.container
import typings.sprotty.libBaseTypesMod.TYPES
import typings.sprotty.libModelSourceLocalModelSourceMod.LocalModelSource
import typings.inversify.libEsmMod.Container
//TODO [REVIEW handler SJS] listner implementation
class EventHandlers:
  val c = container().asInstanceOf[Container]
  val modelSource = c.get[LocalModelSource](TYPES.ModelSource)