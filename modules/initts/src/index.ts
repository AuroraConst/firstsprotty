import 'reflect-metadata';

import { LocalModelSource, TYPES } from 'sprotty';
import createContainer from './aurorasprotty/di.config.js';
import { graph } from './aurorasprotty/model-source.js';
import { Container } from 'inversify';

//TODO [IMPORTANT] this is necessary to allow importing of all elements from  the parent diretory

export * from './aurorasprotty/di.config.js'
export * from './aurorasprotty/model-source.js'
export * from './aurorasprotty/model.js'
export * from './aurorasprotty/Types.js'
export * from './aurorasprotty/views.js'

document.addEventListener('DOMContentLoaded', () => {
    init();
    
});




export function init(): void {

    const container = createContainer('sprotty-container');
    const modelSource = container.get<LocalModelSource>(TYPES.ModelSource);
    modelSource.setModel(graph);
}

// export function container(): Container {
//     return createContainer('sprotty-diagram');
// }

export function f():void {
  console.log("Hello World from function f")
}