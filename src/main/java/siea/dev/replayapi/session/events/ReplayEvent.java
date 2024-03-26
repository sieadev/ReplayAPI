package siea.dev.replayapi.session.events;

public class ReplayEvent {
    private final EventType type;

    public ReplayEvent(EventType type){
        this.type = type;
    }

    public EventType getType(){
        return type;
    }
}
