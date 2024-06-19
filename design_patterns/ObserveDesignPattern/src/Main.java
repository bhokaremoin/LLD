import Observable.IphoneObeservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MsgAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObeservableImpl();


        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@test.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@test.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MsgAlertObserverImpl("1234567890", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.add(observer1);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(1);
        iphoneStockObservable.setStockCount(10);
    }
}