import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
      SuperLinkedList list1 = new SuperLinkedList();
      list1.add("a");
      list1.add("b");
      list1.add("c");
      list1.add("d");
      list1.add("e");

      SuperLinkedList list2 = new SuperLinkedList();
      list2.add("e");
      list2.add("d");
      list2.add("c");
      list2.add("b");
      list2.add("a");

      SuperLinkedList list3 = new SuperLinkedList();
      list3.add("A");
      list3.add("D");
      list3.add("C");
      list3.add("C");
      list3.add("D");
      list3.add("E");
      list3.add("B");

      System.out.println("This is list 1:");
      System.out.println(list1.toString());

      System.out.println("This is list 2:");
      System.out.println(list2.toString());

      System.out.println("This is list 3:");
      System.out.println(list3.toString());

      //this is where I mix list1 and 2 and create a new mixed list
      LinkedList <String> mixer = list1.mix(list2);
      System.out.println("This is calling the list after the mix:");
      System.out.println(list1.toString());
      System.out.println("This is the sent list after the mix:");
      System.out.println(list2.toString());
      System.out.println("This is what is retuned from mix: ");
      System.out.println(mixer.toString());

      //this is where i test the remove vowles method
      System.out.println("Removed vowels: " +list3.removeVowels());
      System.out.println("This is list3 after removeVowels:");
      System.out.println(list3.toString());

      //testing removeDuplicates
      System.out.println("Returned from removeDuplicates: ");
      LinkedList <String> dubs = list3.removeDuplicates();
      System.out.println("This is list3 after removeDuplicates: ");
      System.out.println(list3.toString());
      System.out.println("This is returned from from remove duplicates: ");
      System.out.println(dubs.toString());

      //Remove consonants
      System.out.println("Removed vowels: " +list2.removeConsonants());
      System.out.println("This is list3 after removeConsonants:");
      System.out.println(list2.toString());

      //concatenate
      LinkedList <String> cons = list3.concatenateStrings();
      System.out.println("This is list 3 after concatenateStrings: ");
      System.out.println(list3.toString());
      System.out.println("This is what is returned from concatenateStrings: ");
      System.out.println(cons.toString());

  } // end main
} // end class