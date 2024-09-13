import java.util.ArrayList;
import java.util.List;

public class Bibliotheque implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String newBook;
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Nouveau livre ajouté : " + newBook);
        } }
    public void ajouterLivre(String livre) {
        this.newBook = livre;
        notifyObservers();
    }
}
