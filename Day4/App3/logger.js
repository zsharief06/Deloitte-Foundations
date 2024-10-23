const EventEmitter = require('events');
class logger extends EventEmitter{
    log(message){
        console.log(message);
        this.emit('messageLlogged',)
    }
}