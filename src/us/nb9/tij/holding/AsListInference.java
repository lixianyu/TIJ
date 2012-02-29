package us.nb9.tij.holding;
//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.
import java.util.*;
import static net.mindview.util.Print.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
    print("snow1 = " + snow1);
    // Won't compile:
    // List<Snow> snow2 = Arrays.asList(
    //   new Light(), new Heavy());
    // Compiler says:
    // found   : java.util.List<Powder>
    // required: java.util.List<Snow>

    // Collections.addAll() doesn't get confused:
    List<Snow> snow3 = new ArrayList<Snow>();
    Collections.addAll(snow3, new Light(), new Heavy());
    print("snow3 = " + snow3);
    // Give a hint using an
    // explicit type argument specification:
    List<Snow> snow4 = Arrays.<Snow>asList(
       new Light(), new Heavy());
    print("snow4 = " + snow4);
  }
} ///:~
