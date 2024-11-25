import {  MouseListener, SModelElementImpl } from 'sprotty';
import { Action, SelectAction } from 'sprotty-protocol';


//global mouselistener
let gSjsMouseListener : MouseListener = undefined


/**
 * will 
 */
 //TODO [IMPLEMENT] mouse listener https://sprotty.org/docs/custom-interactions/
 export class SjsMouseListener extends MouseListener {
    set globaMouseListener(listener: MouseListener ) {
        gSjsMouseListener = listener;
    }
    get globaMouseListener(): MouseListener{
        return gSjsMouseListener
    }

    doubleClick(target: SModelElementImpl, event: MouseEvent): (Action | Promise<Action>)[] {
        gSjsMouseListener?.doubleClick(target, event)
        alert('double clicked ' + target.id)

        return [];
    }
}