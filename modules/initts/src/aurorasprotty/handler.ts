import {  MouseListener, SModelElementImpl } from 'sprotty';
import { Action, SelectAction } from 'sprotty-protocol';


/**global mouselistener
 * this can be set by the SjsMouseListener
 * This will be set by the one defined in Scala Js development through SjsMouseListener
 */
let globalSjsMouseListener : MouseListener|undefined = undefined


/**
 * This is a customized MouseListener that delegates tot eh globalSjsMouseListener
 */
 //TODO [IMPLEMENT] mouse listener https://sprotty.org/docs/custom-interactions/
 export class SjsMouseListener extends MouseListener {
    set globaMouseListener(listener: MouseListener|undefined ) {
        globalSjsMouseListener = listener;
    }

    /**I am not that a getter is necessary here
     * because the globalSjsMouseListener is a global variable
     */
    get globaMouseListener(): MouseListener|undefined{
        return globalSjsMouseListener
    }


    mouseDown(target: SModelElementImpl, event: MouseEvent): (Action | Promise<Action>)[] {
        if (!globalSjsMouseListener) return []  
        else 
        return globalSjsMouseListener?.mouseDown(target, event)
    }


    doubleClick(target: SModelElementImpl, event: MouseEvent): (Action | Promise<Action>)[] {
        if (!globalSjsMouseListener) return []  
        else
        return globalSjsMouseListener?.doubleClick(target, event)
    }
}