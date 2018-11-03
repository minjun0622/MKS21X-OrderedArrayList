import java.util.ArrayList;
import java.utl.list;

public class NoNullArrayList<T> extends ArrayList<T> {
public NoNullArrayList() {
  super();
}

public NoNullArrayList (int startingCapacity) {
  super (startingCapacity);
}
public T set (int index, T element) {
  if (element == null) {
    throw new IllegalArgumentException();
  }
  else {
    return super.set(index, element);
  }
  }

  public boolean add (T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.add(element);
    }
    }

    public void add(int index, T element) {
      if (element == null) {
        throw new IllegalArgumentException();
      }
      else {
        return super.add(index, element);
      }
      }

    }
