package core;

import java.util.ArrayList;
import java.util.List;

/** Where T is the observable's container type */
public class Observable<T> {
	private List<AbstractObserver<T>> observers = new ArrayList<>();

	public void addObserver(AbstractObserver<T> observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(T observable) {
		observers.forEach(o->o.update(observable));
	}
}
