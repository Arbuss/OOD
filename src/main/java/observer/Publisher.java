package observer;

import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers;

    public void addSubscriber(Subscriber sub){
        subscribers.add(sub);
    }

    public void removeSubscriber(Subscriber sub){
        subscribers.remove(sub);
    }

    public void notifySubs(){
        for(Subscriber sub: subscribers){
            sub.alarm();
        }
    }
}
