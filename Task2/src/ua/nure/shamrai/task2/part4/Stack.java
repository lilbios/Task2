package ua.nure.shamrai.task2.part4;

import ua.nure.shamrai.task2.Container;

public interface Stack<E> extends Container<E> {

	void push(E element);

	E pop();

	E top();

}
