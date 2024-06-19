package Observer;

import Observable.StocksObservable;

public class MsgAlertObserverImpl implements NotificationAlertObserver{
    String mobileNumber;
    StocksObservable observable;

    public MsgAlertObserverImpl(String mobileNumber, StocksObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Msg Send to " + mobileNumber);
    }
}
