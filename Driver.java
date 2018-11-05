public class Driver {
	public static void main(String[] args) {
		/*
		      NONULLARRAYLIST
		*/
		    // TESTING CONSTRUCTORS AND NULL CASES
		    System.out.println("First thing's first: No Nulls!");

		    NoNullArrayList<String> fruity = new NoNullArrayList<String>(20);
		    fruity.add("apples");
		    fruity.add("bananas");
		    fruity.add("watermelon");
		    fruity.add("mangoes");
		    System.out.println("Your fruits are: \n" + fruity.toString());

		    NoNullArrayList<String> veggie = new NoNullArrayList<String>(20);
		    veggie.add("cucumbers");
		    veggie.add("carrots");
		    veggie.add("spinach");
		    veggie.add("bok choy");
		//    veggie.add(null); UNCOMMENT TO TEST NULL CASES THIS SHOULD THROW BACK
		    System.out.println("Your veggies are: \n" + veggie.toString() + "\n");

		    // TESTING SETTING
		    System.out.println("But now, can we eat different fruits? AND vegetables???");
		    fruity.set(2, "dragonfruit");
		    fruity.set(3, "strawberries");
		    System.out.println("Our new fruits should be: \n[apples, bananas, dragonfruit, strawberries]");
		    System.out.println("Your fruits are: \n" + fruity.toString());

		    veggie.set(0, "kale");
		//    veggie.set(5, "tomatoes"); UNCOMMENT TO TEST INDEX OUT OF BOUNDS EXCEPTION
		//    veggie.set(3, null); UNCOMMENT TO TEST NULL CASES THIS SHOULD BE THROWN BACK
		    System.out.println("Our new veggies should be: \n[kale, carrots, spinach, bok choy]");
		    System.out.println("Your veggies are: \n" + veggie.toString() + "\n");

		    // TESTING ADDING
		    System.out.println("We're still hungry though!");
		    fruity.add("honeydew");
		    fruity.add("grapes");
		    fruity.add("durian");
		    fruity.add(0, "blueberries");
		    fruity.add(3, "oranges");
		    System.out.println("Our long list of fruits should be: \n[blueberries, apples, bananas, oranges, dragonfruit, strawberries, honeydew, grapes, durian]");
		    System.out.println("Your fruits are: \n" + fruity.toString());

		    veggie.add("pumpkin");
		    veggie.add("squash");
		    veggie.add(2, "lettuce");
		    veggie.add(3, "eggplant");
		//    veggie.add(null); UNCOMMENT TO TEST NULL CASES THIS SHOULD BE THROWN BACK
		    System.out.println("Our long list of veggies should be: \n[kale, carrots, lettuce, eggplant, spinach, bok choy, pumpkin, squash]");
		    System.out.println("Your veggies are: \n" + veggie.toString() + "\n");

		int c = 0;

		NoNullArrayList<String> array = new NoNullArrayList<>();

		try {
			array.add("x");
			if (!(""+array).equals("[x]")) System.out.println(++c+". You aren't adding properly when NoNullArrayList.add(T) is called.");
			array.add(0,"y");
			if (!(""+array).equals("[y, x]")) System.out.println(++c+". You aren't adding properly when NoNullArrayList.add(index, T) is called.");
			array.set(1,"z");
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You aren't setting properly when NoNullArrayList.set(index, T) is called.");
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when adding/setting to a NoNullArrayList.");
		}

		try {
			try {
				array.add(null);
				System.out.println(++c+". You aren't catching nulls properly when NoNullArrayList.add(T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You are modifying the array when NoNullArrayList.add(null) is called.");
			try {
				array.add(0,null);
				System.out.println(++c+". You aren't catching nulls when NoNullArrayList.add(index, T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You are modifying the array when NoNullArrayList.add(index, null) is called.");
			try {
				array.set(1,null);
				System.out.println(++c+". You aren't catching nulls when NoNullArrayList.set(index, T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You are modifying the array when NoNullArrayList.set(index, null) is called.");
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when adding/setting a null value to a NoNullArrayList. You should be throwing IllegalArgumentException instead.");
		}

		array.clear();

		try {
			if (!array.add("a")) System.out.println(++c+". You aren't returning true when NoNullArrayList.add(T) is called.");
			if (!array.set(0, "b").equals("a")) System.out.println(++c+". You aren't returning the old element at <index> when NoNullArrayList.set(index, T) is called.");
		} catch (Exception e) {}

		array = new OrderedArrayList<>();

		try {
			array.add("z");
			array.add("x");
			array.add("y");
			if (!(""+array).equals("[x, y, z]")) System.out.println(++c+". You aren't adding properly when OrderedArrayList.add(T) is called.");
			array.add(2,"c");
			array.add(1,"a");
			array.add(0,"b");
			if (!(""+array).equals("[a, b, c, x, y, z]")) {
				System.out.print(++c+". You aren't adding properly when OrderedArrayList.add(index, T) is called. ");
				if (array.size() == 6) System.out.println("Your elements are out of order. :(");
				else System.out.println("Some elements aren't getting added. They feel left out :(");
			}
			array.set(2,"r");
			array.set(1,"p");
			array.set(0,"q");
			if (!(""+array).equals("[p, q, r, x, y, z]")) {
				System.out.print(++c+". You aren't adding properly when OrderedArrayList.set(index, T) is called. ");
				if (array.size() > 6) System.out.println("You aren't removing elements properly!");
				else if (array.size() < 6) System.out.println("Some elements aren't getting added. They feel left out :(");
				else if ((""+array).contains("a") || (""+array).contains("b") || (""+array).contains("c")) System.out.println("You aren't removing elements properly!");
				else System.out.println("Your elements are out of order. :(");
			}
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when adding/setting to an OrderedArrayList.");
		}

		try {
			try {
				array.add(null);
				System.out.println(++c+". You aren't catching nulls properly when OrderedArrayList.add(T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[p, q, r, x, y, z]")) System.out.println(++c+". You are modifying the array when OrderedArrayList.add(null) is called.");
			try {
				array.add(0,null);
				System.out.println(++c+". You aren't catching nulls when OrderedArrayList.add(index, T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[p, q, r, x, y, z]")) System.out.println(++c+". You are modifying the array when OrderedArrayList.add(index, null) is called.");
			try {
				array.set(1,null);
				System.out.println(++c+". You aren't catching nulls when OrderedArrayList.set(index, T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[p, q, r, x, y, z]")) System.out.println(++c+". You are modifying the array when OrderedArrayList.set(index, null) is called.");
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when adding/setting a null value to an OrderedArrayList. You should be throwing IllegalArgumentException instead.");
		}

		array.clear();

		try {
			if (!array.add("a")) System.out.println(++c+". You aren't returning true when OrderedArrayList.add(T) is called.");
			if (!array.set(0, "b").equals("a")) System.out.println(++c+". You aren't returning the old element at <index> when OrderedArrayList.set(index, T) is called.");
		} catch (Exception e) {}

		if (c == 0) System.out.println("Your code passed every test. Nice work.");
		else System.out.println("\nYou produced "+c+" unexpected results. Keep debugging!");

	}
}
