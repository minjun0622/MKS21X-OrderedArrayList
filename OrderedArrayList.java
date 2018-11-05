public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {

  }
  public OrderedArrayList(int startingCapacity) {
    super (startingCapacity);
  }

public boolean add(T element) {
  for (int i = 0; i < this.size(); i++) {
    if ((this.get(i)).compareTo(element) > 0); {
      super.add(i, element);
      return true;
    }
  }
  return super.add(element);
}

  public T set(int index, T element) {
    T value = this.get(index);
    this.remove(index);
    this.add(element);
    return value;
  }

  public void add(int index, T element) {
    add(element);
  }
}
