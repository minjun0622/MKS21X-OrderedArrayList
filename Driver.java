public class Driver {

  public static void main(String[] args) {

    NoNullArrayList<String> NAL = new NoNullArrayList<>();

    System.out.println("NAL: " + NAL);
    // []
    System.out.println("isEmpty?: " + NAL.isEmpty());                       // true

    System.out.println();

    NAL.add("A"); System.out.println("NAL.add(\"A\")");                     // no output
    System.out.println("isEmpty?: " + NAL.isEmpty());                       // false
    System.out.println("size: " + NAL.size());                              // 1

    System.out.println();

    System.out.println("NAL.remove(0): " + NAL.remove(0));                  // "A"
    NAL.add("i'm"); System.out.println("NAL.add(\"i'm\")");                 // no output
    NAL.add("invincible!"); System.out.println("NAL.add(\"invincible!\")"); // no output
    NAL.add("you're"); System.out.println("NAL.add(\"you're\")");           // no output
    NAL.add("a"); System.out.println("NAL.add(\"a\")");                     // no output
    NAL.add("looney"); System.out.println("NAL.add(\"looney\")");           // no output

    System.out.println();

    System.out.println("size: " + NAL.size());                              // 5
    System.out.println("NAL: " + NAL);
    // [i'm, invincible!, you're, a, looney]

    // NOTE: comment these null tests out accordingly, as thrown errors stop the program

    NAL.add(null); System.out.println("NAL.add(null)");
    // [i'm, invincible!, you're, a, looney, null]
    // IllegalArgumentException: null, invalid input

    NAL.add(null); System.out.println("NAL.add(2,null)");
    // [i'm, invincible!, null, you're, a, looney]
    // IllegalArgumentException: null, invalid input

    NAL.set(0,null); System.out.println("NAL.set(0,null)");
    // [null, invincible!, you're, a, looney]
    // IllegalArgumentException: null, invalid input

    System.out.println("\n");

    OrderedArrayList<String> OAL = new OrderedArrayList<>();

    System.out.println("OAL: " + OAL);
    // []
    System.out.println("isEmpty?: " + OAL.isEmpty());                       // true

    System.out.println();

    OAL.add("A"); System.out.println("OAL.add(\"A\")");                     // no output
    System.out.println("isEmpty?: " + OAL.isEmpty());                       // false
    System.out.println("size: " + OAL.size());                              // 1

    System.out.println();

    System.out.println("OAL.remove(0): " + OAL.remove(0));                  // "A"
    OAL.add("B"); System.out.println("OAL.add(\"B\")");                     // no output
    OAL.add("C"); System.out.println("OAL.add(\"C\")");                     // no output

    System.out.println();

    System.out.println("size: " + OAL.size());                              // 2
    System.out.println("OAL: " + OAL);
    // [B, C]

    System.out.println();

    OAL.add("R"); System.out.println("OAL.add(\"R\")");                     // no output
    System.out.println("OAL: " + OAL);
    // [B, C, R]

    System.out.println();

    OAL.add("A"); System.out.println("OAL.add(\"A\")");                     // no output
    System.out.println("OAL: " + OAL);
    // [A, B, C, R]

    System.out.println();

    OAL.add(0,"F"); System.out.println("OAL.add(0,\"F\")");                 // no output
    System.out.println("OAL: " + OAL);
    // [A, B, C, F, R]

    System.out.println();

    OAL.add(2,"X"); System.out.println("OAL.add(2,\"X\")");                 // no output
    System.out.println("OAL: " + OAL);
    // [A, B, C, F, R, X]

    System.out.println();

    OAL.set(1,"G"); System.out.println("OAL.set(1,\"G\")");                 // no output
    System.out.println("OAL: " + OAL);
    // [A, C, F, G, R, X]

    System.out.println("\n");

    OrderedArrayList<Integer> OAL2 = new OrderedArrayList<>();

    System.out.println("OAL2: " + OAL2);
    // []
    System.out.println("isEmpty?: " + OAL2.isEmpty());                      // true

    System.out.println();

    OAL2.add(0); System.out.println("OAL2.add(1)");                         // no output
    System.out.println("isEmpty?: " + OAL2.isEmpty());                      // false
    System.out.println("size: " + OAL2.size());                             // 1

    System.out.println();

    System.out.println("OAL2.remove(0): " + OAL2.remove(0));                // "A"
    OAL2.add(1); System.out.println("OAL2.add(1)");                         // no output
    OAL2.add(2); System.out.println("OAL2.add(2)");                         // no output

    System.out.println();

    System.out.println("size: " + OAL2.size());                             // 2
    System.out.println("OAL2: " + OAL2);
    // [1, 2]

    System.out.println();

    OAL2.add(15); System.out.println("OAL2.add(15)");                       // no output
    System.out.println("OAL2: " + OAL2);
    // [1, 2, 15]

    System.out.println();

    OAL2.add(0); System.out.println("OAL2.add(0)");                         // no output
    System.out.println("OAL2: " + OAL2);
    // [0, 1, 2, 15]

    System.out.println();

    OAL2.add(0,9); System.out.println("OAL2.add(0,9)");                     // no output
    System.out.println("OAL2: " + OAL2);
    // [0, 1, 2, 9, 15]

    System.out.println();

    OAL2.add(2,22); System.out.println("OAL2.add(2,22)");                   // no output
    System.out.println("OAL2: " + OAL2);
    // [0, 1, 2, 9, 15, 22]

    System.out.println();

    OAL2.set(1,10); System.out.println("OAL2.set(2,10)");                   // no output
    System.out.println("OAL2: " + OAL2);
    // [0, 2, 9, 10, 15, 22]

  }

}
