package com.axiommd
import scala.scalajs.js
import js.JSConverters._
import org.scalajs.dom
import typings.sprottyProtocol.libActionsMod.Action
import typings.sprotty.mod.MouseListener
import typings.sprotty.libBaseModelSmodelMod.SModelElementImpl
import org.scalajs.dom.window.alert

import scala.scalajs.js.JSConverters.*




object EventHandlers :

  /**
    * customize mouse listener here
    */
  private class SjsMouseListeenerImplementation extends MouseListener :

    override def doubleClick(target: SModelElementImpl, event: dom.MouseEvent): js.Array[Action | js.Promise[Action]] = 
      alert(s"double Click: ${target.id} ${event.screenX}, ${event.screenY}")
      js.Array[Action | js.Promise[Action]]()

  private  val mouseImplInstance = new SjsMouseListeenerImplementation   


  

  Container.sjsMouseListener.globaMouseListener_= ( mouseImplInstance)

end EventHandlers  

