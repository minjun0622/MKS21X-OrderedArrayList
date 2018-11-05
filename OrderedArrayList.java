public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super (startingCapacity);
  }

  public int get(T value) {
    for (int i = 0; i < this.size; i++) {
      if (value.compareTo(this.get(i)) <= 0)
      return i;
    }
    return this.size();
  }

public boolean add(T element) {
  if (element == null) {
    throw new IllegalArgumentException();
  }
  super.add(get(element) element);
  return true;
}

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    this.remove(index);
    this.add(element);
    return element;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.add(get(element), element);
  }
}
