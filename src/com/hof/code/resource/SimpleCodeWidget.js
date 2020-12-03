define(function() {
    let SimpleWidget = function(options) {
        
        this.messenger = options.messenger;
        
        /**
         * These feature will only work in Yellowfin 9.4 onwards. However if this is used in a code
         * widget before that point, it will just be ignored.
         * 
         * This listens for any changes within the Parameter options and then triggers and event back to 
         * the code messenger when there is a change, it will also contain everything that has changed.
         * 
         */
        this.messenger.registerListener('optionChanged', (eventMetaData, eventData) => {
            console.log(eventData);
            this.render();
        });
        
        
        this.element = options.element;
        this.render();
    }
    
    /**
     * Create a Render function to render the value of the message.
     */
    SimpleWidget.prototype.render = function() {
        let messageToUsers = this.messenger.getOptionValue('message');
        this.element.innerText = messageToUsers;
    }
    
    return SimpleWidget;
});