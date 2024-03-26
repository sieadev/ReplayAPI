package siea.dev.replayapi.session;

import siea.dev.replayapi.session.events.ReplayEvent;

import java.util.HashMap;

public class Replay {
    private HashMap<ReplayEvent, Long> timeLine = new HashMap<>();
    public Replay(){
        registerListeners();
    }

    public void start(){

    }

    public void pause(){

    }

    public void stop(){
        safe();
    }

    private void safe(){

    }
    private void registerListeners(){

    }
}
