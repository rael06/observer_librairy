package core;

// Where T is the observable's type
public abstract class AbstractObserver<T> {
	public abstract void update(T observable);
}
