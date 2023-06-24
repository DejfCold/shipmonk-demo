package cz.dejfcold.shipmonk_demo;

import java.util.*;

public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E> {

    private SortedLinkedList(Collection<E> collection) {
        super();
        addAll(collection);
    }

    /**
     * Constructs a permanently sorted list containing the elements of the specified Integer
     * collection, in the default Integer sort order.
     *
     * @param collection a collection of elements whose presence in this collection is to be ensured
     * @return new instance of SortedLinkedList
     */
    public static SortedLinkedList<Integer> ofInts(Collection<Integer> collection) {
        return new SortedLinkedList<>(collection);
    }


    /**
     * Constructs a permanently sorted list containing the elements of the specified Integer
     * array, in the default Integer sort order.
     *
     * @param ints an array of elements whose presence in this collection is to be ensured
     * @return new instance of SortedLinkedList
     */
    public static SortedLinkedList<Integer> ofInts(Integer... ints) {
        return new SortedLinkedList<>(Arrays.asList(ints));
    }


    /**
     * Constructs a permanently sorted list containing the elements of the specified String
     * collection, in the default String sort order.
     *
     * @param collection a collection of elements whose presence in this collection is to be ensured
     * @return new instance of SortedLinkedList
     */
    public static SortedLinkedList<String> ofStrings(Collection<String> collection) {
        return new SortedLinkedList<>(collection);
    }

    /**
     * Constructs a permanently sorted list containing the elements of the specified String
     * array, in the default String sort order.
     *
     * @param strings an array of elements whose presence in this collection is to be ensured
     * @return new instance of SortedLinkedList
     */
    public static SortedLinkedList<String> ofStrings(String... strings) {
        return new SortedLinkedList<>(Arrays.asList(strings));
    }

    /**
     * Places the element into the collection into such a position, so that it is sorted.
     *
     * @param e element whose presence in this collection is to be ensured
     * @return true (as specified by {@link Collection#add(Object)})
     */
    @Override
    public boolean add(E e) {
        for (int i = 0; i < this.size(); i++) {
            var currentValue = this.get(i);
            var compareResult = e.compareTo(currentValue);
            if (compareResult <= 0) {
                super.add(i, e);
                return true;
            }
        }
        super.addLast(e);
        return true;

    }

    /**
     * Breaks List contract. Works just like {@link #add(Comparable)}
     *
     * @param index   ignored
     * @param element element to be inserted
     */
    @Override
    public void add(int index, E element) {
        this.add(element);
    }

    /**
     * Same as {@link #add(Comparable)}
     *
     * @param element the element to add
     * @return true (as specified by {@link Collection#add(Object)})
     */
    @Override
    public boolean offer(E element) {
        return this.add(element);
    }

    /**
     * Breaks Dequeue contract. Works just like {@link #add(Comparable)}
     *
     * @param element the element to add
     * @return true (as specified by {@link Collection#add(Object)})
     */
    @Override
    public boolean offerFirst(E element) {
        return this.add(element);
    }

    /**
     * Breaks Dequeue contract. Works just like {@link #add(Comparable)}
     *
     * @param element the element to add
     * @return true (as specified by {@link Collection#add(Object)})
     */
    @Override
    public boolean offerLast(E element) {
        return this.add(element);
    }

    /**
     * Breaks Dequeue contract. Works just like {@link #add(Comparable)}
     *
     * @param element the element to push
     */
    @Override
    public void push(E element) {
        this.add(element);
    }

    /**
     * Places the elements of the collection into this collection in such a positions, so that it is kept sorted.
     *
     * @param collection collection containing elements to be added to this collection
     * @return true (as specified by {@link Collection#add(Object)})
     */
    @Override
    public boolean addAll(Collection<? extends E> collection) {
        var ret = false;
        for (var value : collection) {
            ret |= this.add(value);
        }
        return ret;
    }

    /**
     * Breaks List contract. Works just like {@link #addAll(Collection)}
     *
     * @param index      ignored
     * @param collection collection containing elements to be added to this list
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> collection) {
        return this.addAll(collection);
    }

    /**
     * Breaks Dequeue contract. Works just like {@link #add(Comparable)}
     *
     * @param element the element to add
     */
    @Override
    public void addFirst(E element) {
        this.add(element);
    }

    /**
     * Breaks Dequeue contract. Works just like {@link #add(Comparable)}
     *
     * @param element the element to add
     */
    @Override
    public void addLast(E element) {
        this.add(element);
    }
}
