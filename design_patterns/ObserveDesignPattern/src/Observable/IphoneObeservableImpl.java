package Observable;

import Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneObeservableImpl implements StocksObservable{
    public List<NotificationAlertObserver> observersList = new ArrayList<>();
    public int stocksCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observersList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockAdded) {
        if(stocksCount == 0){
            notifySubscribers();
        }
        stocksCount = stockAdded;
    }

    @Override
    public int getStockCount() {
        return stocksCount;
    }
}
