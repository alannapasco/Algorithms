package Final;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

  private class Node {
    Item item;
    Node next;
  }

  private Node first;
  private int size;

  public int size() {
    return size;
  }

  public void add(Item item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;

    size++;
  }

  public void printBag(){
    System.out.println("print bag:");
    for (Item i : this) {
      System.out.println(i);
    }


  }



  public Iterator<Item> iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator<Item> {

    private Node current = first;

    public boolean hasNext() {
      return current != null;
    }


    public Item next() {
      Item item = current.item;
      current = current.next;
      return item;
    }
  }


}