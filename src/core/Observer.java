package core;

/** Where T is the observer's container type and U is the observable's container type */
public abstract class Observer<T, U> extends AbstractObserver<U> {
	protected T observer;

	protected Observer(T observer) {
		this.observer = observer;
	}
}
